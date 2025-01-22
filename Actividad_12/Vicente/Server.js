const express = require('express');
const fs = require('fs');
const path = require('path');
const app = express();
const PORT = 4000;

// Middleware para parsear JSON
app.use(express.json());
app.use(express.urlencoded({ extended: true }));

// Ruta para servir archivos estáticos
app.use(express.static(path.join(__dirname)));

const comentariosFile = path.join(__dirname, 'comentarios.csv');

// Ruta para obtener comentarios
app.get('/comentarios', (req, res) => {
    fs.readFile(comentariosFile, 'utf-8', (err, data) => {
        if (err) {
            return res.status(500).json({ error: 'Error al leer el archivo de comentarios' });
        }
        const comentarios = data
            .trim()
            .split('\n')
            .map(line => {
                const [producto, comentario] = line.split('\\');
                return { producto: producto.trim(), comentario: comentario.trim() };
            });
        res.json(comentarios);
    });
});

// Ruta para agregar un nuevo comentario
app.post('/comentarios', (req, res) => {
    const { producto, comentario } = req.body;
    if (!producto || !comentario) {
        return res.status(400).json({ error: 'Producto y comentario son requeridos' });
    }

    const nuevoComentario = `${producto}\\${comentario}\n`;
    agregarLineaCSV(nuevoComentario, res);
});

// Iniciar servidor
app.listen(PORT, () => {
    console.log(`Servidor corriendo en http://localhost:${PORT}`);
});

// Función para agregar una nueva línea al archivo CSV
function agregarLineaCSV(nuevaLinea, res) {
    fs.appendFile(comentariosFile, nuevaLinea, 'utf8', (err) => {
        if (err) {
            console.error('Error al escribir en el archivo:', err);
            res.status(500).json({ error: 'Error al guardar el comentario' });
        } else {
            console.log('Comentario añadido con éxito.');
            res.status(201).json({ mensaje: 'Comentario añadido exitosamente' });
        }
    });
}
