package presentacion;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "ConSearch", urlPatterns = {"/ConSearch"})
public class ConSearch extends HttpServlet {
    Gson convertir = new Gson();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<TreeMap> listaResultado = new ArrayList();

        // Cargar el Driver de Base de DAtos 
        //      java.sql.DriverManager.getConnection()
        // Conectarme a la Base de Datos     
        //      java.sql.Connection
        // Pedir a la Conexion establecida una Sentencia
        //      java.sql.PreparedStatement
        // A la Sentencia, con SQL, ejecutar
        //      sentencia.executeQuery()
        // recibir el Resultado en el objeto ResultSet
        //      java.sql.ResultSet
        // Para Cada Fila de la base de Datos 
        //      while()
        //  instanciar un objeto 
        //      java.util.TreeMap
        //  sumarlo a la lista resultado
        //      java.util.ArrayList
        // retornar el resultado a la pagina web en JSON
        
        TreeMap<String, String> unConcertista = new TreeMap();
        unConcertista.put("nombre","Luka");
        unConcertista.put("temple","Suave");
        
        TreeMap<String, String> otroConcertista = new TreeMap();
        otroConcertista.put("nombre","Stjepan");
        otroConcertista.put("temple","Fuerte");
        
        listaResultado.add(unConcertista);
        listaResultado.add(otroConcertista);

        
        response.getWriter().println( 
                convertir.toJson( listaResultado )
        );
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().println("POST, No implementado AUN.");
    }
}
