package presentacion;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "VideoJuego", urlPatterns = {"/VideoJuego"})
public class VideoJuego extends HttpServlet {
    private Gson convertir = new Gson();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<TreeMap> listadoResultado = new ArrayList();

        response.getWriter().println( 
                 convertir.toJson( listadoResultado )
         );
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         response.getWriter().println("POST, Metodo aun No Implementado");

    }
}
