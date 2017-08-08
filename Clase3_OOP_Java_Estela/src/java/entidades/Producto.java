package entidades;

import com.google.gson.Gson;

/**
 *
 * @author educacion
 */
public class Producto {
// espacio decclarativo de la clase
    public String nombre;
    public int precio;

    @Override
    public String toString() {
        Gson convertir = new Gson();
        return convertir.toJson( this );
    }
    
    
    
}
