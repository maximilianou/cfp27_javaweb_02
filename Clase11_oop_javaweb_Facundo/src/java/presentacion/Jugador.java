package presentacion;

import com.google.gson.Gson;
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

/**
 * < pre>
 * http://www.aulaclic.es/java-en-video/ Explicacion en Spanish de Object
 * Oriented Programming 1. Quiero Convertir a JSON lo que reciba el Servidor
 * Referencia: http://json.org/ y de esta referencia puedo bajar la api que
 * quiera 2. Y Envie al Cliente WEB Browser 3. Crear El Jugador, enviarlo al
 * Navegador 4. Enviar Lista de Jugadores 5. Festejar 6. Buscar de la bAse de
 * DAtos.. si llegamos
 * </pre>
 */
@WebServlet(name = "Jugador", urlPatterns = {"/Jugador"})
public class Jugador extends HttpServlet {

    Gson convertir = new Gson();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Siempre voy a Devolver una lista de Jugadores, asi este vacia.
            ArrayList<TreeMap> listaJugadores = new ArrayList();
            // Cargar al DriverManager la libreria de Mysql
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Conectar a la Base de Datos 
            Connection conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost/dbrest",
                    "educacion",
                    "educacion");
            // Ejecutar la Sentencia, Select * from personas
            // Obteer los resultados, si los hay.
            { // Contexto de Creacion de Instancias de Jugadores
                // Voy a instanciar, tantos jugadore como hay en la DB
                TreeMap<String, String> unJugador = new TreeMap();
                unJugador.put("nombre", "Marilu");
                unJugador.put("posicion", "Delantero");
                unJugador.put("energia", "50%");
                // Voy a Agregar, Cada jugador Instanciado a la listar resultado
                listaJugadores.add(unJugador);
            }
            // devolver los resultados a la inerfaz Grafica.
            response.getWriter().println(convertir.toJson(listaJugadores));
        } catch (SQLException ex) {
            response.getWriter().println(convertir.toJson( "ERROR: " + ex.getMessage() ) );
        } catch (ClassNotFoundException ex) {
            response.getWriter().println(convertir.toJson( "ERROR: " + ex.getMessage() ) );
        } catch (InstantiationException ex) {
            response.getWriter().println(convertir.toJson( "ERROR: " + ex.getMessage() ) );
        } catch (IllegalAccessException ex) {
            response.getWriter().println(convertir.toJson( "ERROR: " + ex.getMessage() ) );
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
