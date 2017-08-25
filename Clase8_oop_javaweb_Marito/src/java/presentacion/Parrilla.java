package presentacion;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import entidades.Corte;

@WebServlet(name = "Parrilla", urlPatterns = {"/Parrilla"})
public class Parrilla extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Corte elcorte = (Corte)request.getSession().getAttribute("corte");
        if( elcorte == null ){ // null es que NO Existe en Sesion
          elcorte = new Corte();
          elcorte.nombre = "Vacio " + request.getSession().getId();
          request.getSession().setAttribute("corte", elcorte);
        }else{ // Si no esta en Null, es porque SI Existe en Sesion
            elcorte.PESO_MAXIMO++;
        }
        
        response.getWriter().print("Envio Mensaje de Parrilla desde el Server !!");
        response.getWriter().print( elcorte.nombre + " :: " + elcorte.PESO_MAXIMO );
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
