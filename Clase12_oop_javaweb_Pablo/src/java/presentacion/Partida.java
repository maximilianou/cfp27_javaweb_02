package presentacion;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "Partida", urlPatterns = {"/Partida"})
public class Partida extends HttpServlet {

    Gson convertir = new Gson();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        LinkedList listado = new LinkedList();
        HashMap objetoActual = new HashMap();

        listado.add(objetoActual);
        response.getWriter().println(
                convertir.toJson(listado));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().println(
                convertir.toJson("POST, Metodo aun no implementado"));
    }
}
