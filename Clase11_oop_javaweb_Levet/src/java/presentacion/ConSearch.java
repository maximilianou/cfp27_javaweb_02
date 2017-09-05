package presentacion;

import com.google.gson.Gson;//import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "ConSearch", urlPatterns = {"/ConSearch"})
public class ConSearch extends HttpServlet {

    Gson convertir = new Gson();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection conectar = null;
        try {
            ArrayList<TreeMap> listaResultado = new ArrayList();
            // Cargar la Libreria pra conecarme a la base de datos
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
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conectar = DriverManager.getConnection(
                    "jdbc:mysql://localhost/dbrest", // url de conexion a la base
                    "educacion", // usuario
                    "educacion"); // clave

            /*
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
             */
            response.getWriter().println(
              convertir.toJson( "OK: Accedimos a la Base." )
            );
        } catch (SQLException ex) {
            response.getWriter().println(convertir.toJson( "ERROR: " + ex.getMessage() ));
        } catch (ClassNotFoundException ex) {
            response.getWriter().println(convertir.toJson( "ERROR: " + ex.getMessage() ));
        } catch (InstantiationException ex) {
            response.getWriter().println(convertir.toJson( "ERROR: " + ex.getMessage() ));
        } catch (IllegalAccessException ex) {
            response.getWriter().println(convertir.toJson( "ERROR: " + ex.getMessage() ));
        }finally{
            try {
                conectar.close();
            } catch (Exception ex) {
                response.getWriter().println(convertir.toJson( "ERROR: " + ex.getMessage() ));
            }
        }

    }

}
