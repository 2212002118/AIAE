document.addEventListener("DOMContentLoaded", function () {
    // Función para cargar comentarios
    async function loadComments() {
        try {
            const response = await fetch('http://localhost:4000/comentarios');
            const comentarios = await response.json();

            comentarios.forEach(({ producto, comentario }) => {
                const productElement = Array.from(document.querySelectorAll('.product h2'))
                    .find(h2 => h2.textContent.trim() === producto);

                if (productElement) {
                    const commentsSection = productElement.closest('.product').querySelector('.comments-section');
                    const commentParagraph = document.createElement('p');
                    commentParagraph.textContent = comentario;
                    commentsSection.appendChild(commentParagraph);
                }
            });
        } catch (error) {
            console.error('Error al cargar comentarios:', error);
        }
    }

    // Función para manejar envío de comentarios
    async function handleCommentSubmission() {
        document.querySelectorAll('.product form').forEach(form => {
            form.addEventListener('submit', async function (event) {
                event.preventDefault();

                const textarea = form.querySelector('textarea');
                const newComment = textarea.value.trim();
                if (!newComment) return;

                const productName = form.closest('.product').querySelector('h2').textContent.trim();
                const commentsSection = form.closest('.product').querySelector('.comments-section');

                // Mostrar comentario en el DOM
                const commentParagraph = document.createElement('p');
                commentParagraph.textContent = newComment;
                commentsSection.appendChild(commentParagraph);

                // Limpiar textarea
                textarea.value = '';

                try {
                    const response = await fetch('http://localhost:4000/comentarios', {
                        method: 'POST',
                        headers: { 'Content-Type': 'application/json' },
                        body: JSON.stringify({ producto: productName, comentario: newComment })
                    });

                    if (response.ok) {
                        console.log(`Comentario guardado: ${newComment}`);
                    } else {
                        throw new Error('Error al guardar el comentario');
                    }
                } catch (error) {
                    console.error('Error al guardar el comentario:', error);
                }
            });
        });
    }

    loadComments();
    handleCommentSubmission();
});
