package presentacion;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
/**
 * Standard de Internet RFC, request for comments
 * https://tools.ietf.org/html/rfc2616
 * https://jwt.io/  (Investigar)
 * 
 * @author educacion
 */
@WebServlet(name = "Reciclaje", urlPatterns = {"/Reciclaje"})
public class Reciclaje extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.getWriter().print( "Mensaje del Servidor !!!" );
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
