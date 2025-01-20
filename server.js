const express = require('express');
const app = express();
const port = 5500; // Puerto donde escucha el servidor
const cors = require('cors');
app.use(cors());


// Middleware para procesar JSON
app.use(express.json());

// Rutas y lógica de operaciones
app.post('/operation', (req, res) => {
    const { type, num1, num2 } = req.body;

    // Validación básica
    if (!['1', '2', '3', '4'].includes(type)) {
        return res.status(400).json({ error: 'Operación no válida.' });
    }

    const number1 = parseFloat(num1);
    const number2 = parseFloat(num2);

    if (isNaN(number1) || isNaN(number2)) {
        return res.status(400).json({ error: 'Los números deben ser válidos.' });
    }

    // Cálculo según el tipo de operación
    let result;
    switch (type) {
        case '1': // Suma
            result = number1 + number2;
            break;
        case '2': // Resta
            result = number1 - number2;
            break;
        case '3': // Multiplicación
            result = number1 * number2;
            break;
        case '4': // División
            if (number2 === 0) {
                return res.status(400).json({ error: 'División por cero no permitida.' });
            }
            result = number1 / number2;
            break;
    }

    // Responder con el resultado
    res.json({ result });
});

// Inicia el servidor
app.listen(port, () => {
    console.log(`Servidor corriendo en http://localhost:${port}`);
});
