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

@WebServlet(name = "VideoJuego", urlPatterns = {"/VideoJuego"})
public class VideoJuego extends HttpServlet {

    private Gson convertir = new Gson();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Cargar el Driver de BAse de datos en el
        //     java.sql.DriverManager
        // Conectarme a la Bse de Datos
        //     java.sql.Connection
        // Pedir Crear una Sentencia para enviar SQL por la conexion
        //     java.sql.PreparedStatement
        // Ejecutar la Sentencia, si es Select, devolve los resultaso
        //     java.sql.ResultSet
        // Ciclar por los resultados, hasta el final del CURSOR de SQL
        // Finalmente Cerrar la Conexion, que es un reurso compartidos
        Connection conectar = null;
        try {
            ArrayList<TreeMap> listadoResultado = new ArrayList();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conectar = DriverManager.getConnection(
                    "jdbc:mysql://localhost/dbrest",
                    "educacion", "educacion");
            
            TreeMap<String, String> unJuego = new TreeMap();

            unJuego.put("nombre", "RPG 400");
            unJuego.put("Categoria", "RPG");
            unJuego.put("precio", "5000");
            listadoResultado.add(unJuego);
            
            response.getWriter().println(
                    convertir.toJson(listadoResultado)
            );
        } catch (SQLException ex) {
            response.getWriter().println(convertir.toJson("ERROR: " + ex.getMessage()));
        } catch (ClassNotFoundException ex) {
            response.getWriter().println(convertir.toJson("ERROR: " + ex.getMessage()));
        } catch (InstantiationException ex) {
            response.getWriter().println(convertir.toJson("ERROR: " + ex.getMessage()));
        } catch (IllegalAccessException ex) {
            response.getWriter().println(convertir.toJson("ERROR: " + ex.getMessage()));
        } finally {
            try {
                conectar.close();
            } catch (SQLException ex) {
                response.getWriter().println(convertir.toJson("ERROR: " + ex.getMessage()));
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.getWriter().println("POST, Metodo aun No Implementado");

    }
}
