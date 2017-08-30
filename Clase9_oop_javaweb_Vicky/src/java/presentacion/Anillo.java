package presentacion;

import entidades.Producto;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "Anillo", urlPatterns = {"/Anillo"})
public class Anillo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {



        response.getWriter().println( Producto.obtenerListado() );
        
//        response.getWriter().println( "Primer Producto: "
//                                     + alianza.nombre
//                                     + " cota: "
//                                     + alianza.cotaMaximaPeso);
        
        //response.getWriter().println("Alianzas, Hilito, Rockero, Fantasia !!!");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
