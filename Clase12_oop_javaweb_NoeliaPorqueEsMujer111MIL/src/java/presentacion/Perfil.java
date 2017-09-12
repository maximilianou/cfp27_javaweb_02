package presentacion;
import com.google.gson.Gson;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(name = "Perfil", urlPatterns = {"/Perfil"})
public class Perfil extends HttpServlet {
    Gson convertir = new Gson();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conectar = DriverManager.getConnection(
                    "jdbc:mysql://localhost/dbrest", "educacion", "educacion");
            PreparedStatement sentencia = conectar.prepareStatement(" SELECT * FROM personas ");
            ResultSet resultado = sentencia.executeQuery();
            ArrayList<TreeMap> listado = new ArrayList();
            while( resultado.next() ){
                TreeMap<String, String> perfilActual = new TreeMap();
                perfilActual.put("Identificador",  resultado.getString("per_id") );
                perfilActual.put("Nombre Usuario",  resultado.getString("per_nombre") );
                perfilActual.put("Contacto",  resultado.getString("per_email") );
                listado.add( perfilActual );
            }
            response.getWriter().println( convertir.toJson( listado ) );
        } catch (SQLException ex) {
            response.getWriter().println( convertir.toJson( "ERROR: " + ex.getMessage() ) );
         } catch (ClassNotFoundException ex) {
            response.getWriter().println( convertir.toJson( "ERROR: " + ex.getMessage() ) );
        } catch (InstantiationException ex) {
            response.getWriter().println( convertir.toJson( "ERROR: " + ex.getMessage() ) );
        } catch (IllegalAccessException ex) {
            response.getWriter().println( convertir.toJson( "ERROR: " + ex.getMessage() ) );
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      response.getWriter().println( "POST, Insertar OK, Aun no implementados" );
    }
}
