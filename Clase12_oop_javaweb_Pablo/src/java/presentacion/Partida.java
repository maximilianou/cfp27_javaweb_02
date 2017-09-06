package presentacion;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "Partida", urlPatterns = {"/Partida"})
public class Partida extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.getWriter().println("GET, Metodo aun no implementado");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.getWriter().println("POST, Metodo aun no implementado");
    }
}
