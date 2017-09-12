package presentacion;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PedidoPizza", urlPatterns = {"/PedidoPizza"})
public class PedidoPizza extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.getWriter().println("GET, este metodo no esta programado aun");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            response.getWriter().println("POST, este QUIERO programar para INSERTAR");
            
            String textoParametros = request.getReader().readLine();
            
            response.getWriter().println( " !! " + textoParametros + " !! " );
            
            

    }
}
