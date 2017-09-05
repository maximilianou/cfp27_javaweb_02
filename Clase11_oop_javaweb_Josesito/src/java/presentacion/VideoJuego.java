package presentacion;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "VideoJuego", urlPatterns = {"/VideoJuego"})
public class VideoJuego extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.getWriter().println("GET, Metodo aun No Implementado");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.getWriter().println("POST, Metodo aun No Implementado");

    }
}
