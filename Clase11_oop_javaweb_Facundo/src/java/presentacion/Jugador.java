package presentacion;
import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
/** <pre> 
 * http://www.aulaclic.es/java-en-video/ Explicacion en Spanish de Object Oriented Programming
 * 1. Quiero Convertir a JSON lo que reciba el Servidor 
 *     Referencia: http://json.org/
 *     y de esta referencia puedo bajar la api que quiera
 * 2.  Y Envie al Cliente WEB Browser
 * 3.  Crear El Jugador, enviarlo al Navegador
 * 4.  Enviar Lista de Jugadores
 * 5.  Festejar
 * 6. Buscar de la bAse de DAtos.. si llegamos
 * </pre>
 */
@WebServlet(name = "Jugador", urlPatterns = {"/Jugador"})
public class Jugador extends HttpServlet {
    
    Gson convertir = new Gson();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String texto = "Esto es un TExto plano, convertido a JSON.";
        
        response.getWriter().println(  texto  );
        //response.getWriter().println( convertir.toJson( texto ) );
        
    }
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
