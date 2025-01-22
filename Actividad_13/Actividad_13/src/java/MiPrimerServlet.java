/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aczay
 */
@WebServlet(name = "TestServlet", urlPatterns = {"/MiPrimerServlet"})
public class MiPrimerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"es\">");
            out.println("<head>");
            out.println("    <meta charset=\"UTF-8\">");
            out.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("    <title>Practica de html VFJ ;)</title>");
            out.println("    <link rel=\"stylesheet\" href=\"./estilos.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("    <div>");
            out.println("        <h1>Catalogo de Productos</h1>");
            out.println("        <h2>Disponibles por temporada</h2>");
            out.println("    </div>");

            out.println("    <div class=\"catalogo-container\">");

            // Catálogo de Otoño
            out.println("        <div class=\"catalogo\" id=\"otoño\">");
            out.println("            <h3>Catálogo Otoño - Octubre</h3>");
            out.println("            <h4>Descripcion</h4>");
            out.println("            <p>Este catalogo provee la combinacion perfecta para el periodo de otoño</p>");
            out.println("            <p><strong>Precio:</strong> $200.00 MXN</p>");
            out.println("            <div class=\"producto-lista\">");
            out.println("                <div class=\"producto-item\">");
            out.println("                    <strong>Gafas:</strong> Gafas de color rojo");
            out.println("                    <img src=\"./imagenes/Gafas de color Rojo.jpg\" alt=\"\">");
            out.println("                </div>");
            out.println("                <div class=\"producto-item\">");
            out.println("                    <strong>Pantalones:</strong> Oversize blue cian");
            out.println("                    <img src=\"./imagenes/Oversize blue cian.jpg\" alt=\"\">");
            out.println("                </div>");
            out.println("                <div class=\"producto-item\">");
            out.println("                    <strong>Playera:</strong> Playera verde");
            out.println("                    <img src=\"./imagenes/playera Verde.png\" alt=\"\">");
            out.println("                </div>");
            out.println("            </div>");
            out.println("            <div class=\"proveedor\">");
            out.println("                <strong>Proveedores:</strong>");
            out.println("                <span>Laura Fonseca</span>");
            out.println("                <span>Juana Flores</span>");
            out.println("            </div>");
            out.println("        </div>");

            // Catálogo de Invierno
            out.println("        <div class=\"catalogo\" id=\"invierno\">");
            out.println("            <h3>Catálogo Invierno - Diciembre</h3>");
            out.println("            <h4>Descripcion</h4>");
            out.println("            <p>Este catalogo provee la combinacion perfecta para el periodo de Diciembre</p>");
            out.println("            <p><strong>Precio:</strong> $200.00 MXN</p>");
            out.println("            <div class=\"producto-lista\">");
            out.println("                <div class=\"producto-item\">");
            out.println("                    <strong>Gafas:</strong> Gafas de color amarillo");
            out.println("                    <img src=\"./imagenes/gafas de color amarillo.png\" alt=\"\">");
            out.println("                </div>");
            out.println("                <div class=\"producto-item\">");
            out.println("                    <strong>Pantalones:</strong> Joggers café");
            out.println("                    <img src=\"./imagenes/joggers cafe.png\" alt=\"\">");
            out.println("                </div>");
            out.println("                <div class=\"producto-item\">");
            out.println("                    <strong>Playera:</strong> Playera blanca");
            out.println("                    <img src=\"./imagenes/playera blanca.jpg\" alt=\"\">");
            out.println("                </div>");
            out.println("            </div>");
            out.println("            <div class=\"proveedor\">");
            out.println("                <strong>Proveedores:</strong>");
            out.println("                <span>Karla Fonseca Hernandez</span>");
            out.println("            </div>");
            out.println("        </div>");

            // Catálogo de Año Nuevo
            out.println("        <div class=\"catalogo\" id=\"ano-nuevo\">");
            out.println("            <h3>Catálogo Año Nuevo - Diciembre</h3>");
            out.println("            <h4>Descripcion</h4>");
            out.println("            <p>Este catalogo provee la combinacion perfecta para el año nuevo</p>");
            out.println("            <p><strong>Precio:</strong> $200.00 MXN</p>");
            out.println("            <div class=\"producto-lista\">");
            out.println("                <div class=\"producto-item\">");
            out.println("                    <strong>Gafas:</strong> Gafas de sol");
            out.println("                    <img src=\"./imagenes/Gafas de sol .png\" alt=\"\">");
            out.println("                </div>");
            out.println("                <div class=\"producto-item\">");
            out.println("                    <strong>Pantalones:</strong> Small fit jeans");
            out.println("                    <img src=\"./imagenes/Small fit jeans.jpg\" alt=\"\">");
            out.println("                </div>");
            out.println("                <div class=\"producto-item\">");
            out.println("                    <strong>Playera:</strong> Playera naranja");
            out.println("                    <img src=\"./imagenes/Playera naranja.png\" alt=\"\">");
            out.println("                </div>");
            out.println("            </div>");
            out.println("            <div class=\"proveedor\">");
            out.println("                <strong>Proveedores:</strong>");
            out.println("                <span>Patricia Tampico Hernandez</span>");
            out.println("            </div>");
            out.println("        </div>");

            out.println("    </div>");

            // Comentarios
            out.println("    <div class=\"comment-section\">");
            out.println("        <h3>Deja tu comentario sobre nuestros productos:</h3>");
            out.println("        <form id=\"commentForm\">");
            out.println("            <label for=\"name\">Nombre:</label>");
            out.println("            <input type=\"text\" id=\"name\" name=\"name\" required>");
            out.println("            <label for=\"comment\">Comentario:</label>");
            out.println("            <textarea id=\"comment\" name=\"comment\" rows=\"4\" required></textarea>");
            out.println("            <button type=\"submit\">Enviar Comentario</button>");
            out.println("        </form>");
            out.println("    </div>");
            //Ya no ocuparemos java Script ;)
            //out.println("    <script src=\"./ejecucion.js\"></script>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
