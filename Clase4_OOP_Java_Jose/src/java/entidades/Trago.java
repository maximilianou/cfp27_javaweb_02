package entidades;

import com.google.gson.Gson;
import java.util.*;

/**
 *
 * @author educacion
 */
public class Trago {
    public String nombre;
    ArrayList<Bebida> listaBebidas = new ArrayList();
    
    public void agregar(Bebida unaBebida) {
      // sumar al aatributo lista o conjuno a la coleccion elejida
      listaBebidas.add(unaBebida); 
    }

    @Override
    public String toString() {
        Gson conv = new Gson();
        return conv.toJson( this ); 
    }
    
}
