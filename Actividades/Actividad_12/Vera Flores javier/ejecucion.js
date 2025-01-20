// Obtener elementos del formulario y de la sección donde se mostrarán los comentarios
const formularioComentarios = document.getElementById('commentForm');
const nombreEntrada = document.getElementById('name');
const comentarioEntrada = document.getElementById('comment');
const seccionComentarios = document.querySelector('.comment-section');

// Función para manejar el envío del formulario
formularioComentarios.addEventListener('submit', function(event) {
    // Prevenir el comportamiento predeterminado de envío del formulario (recarga de la página)
    event.preventDefault();

    // Obtener los valores del nombre y comentario
    const name = nombreEntrada.value.trim();
    const comment = comentarioEntrada.value.trim();

    // Verificar que el nombre y el comentario no estén vacíos
    if (name === '' || comment === '') {
        alert('Por favor, ingresa tu nombre y comentario.');
        return;
    }

    // Crear un nuevo contenedor para el comentario
    const commentDiv = document.createElement('div');
    commentDiv.classList.add('user-comment');
    
    // Crear el contenido del comentario
    const commentContent = `
        <p><strong>${name} dice:</strong></p>
        <p>${comment}</p>
    `;

    // Asignar el contenido al div
    commentDiv.innerHTML = commentContent;

    // Agregar el nuevo comentario a la sección de comentarios
    seccionComentarios.appendChild(commentDiv);

    // Limpiar los campos del formulario después de enviar el comentario
    nombreEntrada.value = '';
    comentarioEntrada.value = '';
});
