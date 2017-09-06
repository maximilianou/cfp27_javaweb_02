package presentacion;

import com.google.gson.Gson;
import java.io.IOException;
import java.sql.Connection;
//import com.mysql.jdbc.Connection;
//import com.oracle.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "Partida", urlPatterns = {"/Partida"})
public class Partida extends HttpServlet {

    Gson convertir = new Gson();

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        // CCargar el Driver en el DriverMaanger
        // Conecar a la base
        // Pedir sentencia pra ejecuar SQL
        // Ejecutar SQL
        // Recibir el REsultSet,
        //      que es la representacion del CURSOR de la base de datos,
        //       del listado del select *
        // Poder agregar lo elementos de ese ResultSet en la lista resutado
        // Poder enviar al Navegador Web el JSON representndo esos Datos de la BASE
        Connection conectar = null;// Declarando lal variable conectar, fuera del try, para poder utilizarla en el finally, que esta fuera del try
        try {
            LinkedList listado = new LinkedList();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conectar = DriverManager.getConnection(
                    "jdbc:mysql://localhost/dbrest", "educacion", "educacion");
            PreparedStatement sentencia = conectar.prepareStatement(
                    " SELECT * FROM personas " );
            ResultSet resultado = sentencia.executeQuery();
            while ( resultado.next() ) {
                // Instanciar el Objeto Actual,
                // Alimentandolo con lo que viene de la bse de datos
                HashMap objetoActual = new HashMap();
                objetoActual.put("jugada", 
                        resultado.getString("per_id"));
                objetoActual.put("jugador", resultado.getString("per_nombre"));
                // Agregamos el Objecto Actual a la Lista resultado
                listado.add(objetoActual);
            }
            response.getWriter().println(convertir.toJson(listado));
        } catch (ClassNotFoundException ex) {
            response.getWriter().println(convertir.toJson("Error: " + ex.getMessage()));
        } catch (InstantiationException ex) {
            response.getWriter().println(convertir.toJson("Error: " + ex.getMessage()));
        } catch (IllegalAccessException ex) {
            response.getWriter().println(convertir.toJson("Error: " + ex.getMessage()));
        } catch (SQLException ex) {
            response.getWriter().println(convertir.toJson("Error: " + ex.getMessage()));
        } finally {
            try {
                conectar.close();
            } catch (SQLException ex) {
                response.getWriter().println(convertir.toJson("Error: " + ex.getMessage()));
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().println(
                convertir.toJson("POST, Metodo aun no implementado"));
    }
}
