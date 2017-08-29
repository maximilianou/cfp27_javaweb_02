package presentacion;
import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
/** HTTP rfc : https://tools.ietf.org/html/rfc2616
 * JSON rfc : https://tools.ietf.org/html/rfc7159
 * Json, expliccion y librerishttp://json.org/
 */
@WebServlet(name = "AutorizacionDeMenores", urlPatterns = {"/AutorizacionDeMenores"})
public class AutorizacionDeMenores extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {
        
        Gson convertir = new Gson();
        response.getWriter().print(
                    convertir.toJson(
                      "Informacion desde el Servidor: "
                    + " 1- El DNI "
                    + "     es Digital unicamente. "
                    + " 2- La Autorizacion de Padre, "
                    + "     Madre o Tutor ante escribano." 
                    )
                );
            
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
