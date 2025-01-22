document
  .getElementById("operationForm")
  .addEventListener("submit", async (e) => {
    e.preventDefault();

    // Obtén los datos del formulario
    const operation = document.getElementById("operation").value;
    const num1 = document.getElementById("num1").value;
    const num2 = document.getElementById("num2").value;

    try {
      // Enviar la solicitud al servidor
      const response = await fetch("http://localhost:123456/operation", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({ type: operation, num1, num2 }),
      });

      // Manejo de la respuesta
      if (response.ok) {
        const data = await response.json();
        document.getElementById(
          "result"
        ).innerText = `Resultado: ${data.result}`;
      } else {
        const errorData = await response.json();
        document.getElementById(
          "result"
        ).innerText = `Error: ${errorData.error}`;
      }
    } catch (error) {
      document.getElementById(
        "result"
      ).innerText = `Error de conexión: ${error.message}`;
    }
  });
