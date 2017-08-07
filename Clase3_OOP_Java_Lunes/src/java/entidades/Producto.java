package entidades;

import com.google.gson.Gson;
/**
 *
 * @author educacion
 */
public class Producto {
    public String nombre;
    public float precio;

    @Override
    public String toString() {
        //return " , " + nombre;
        Gson convertir = new Gson();
        return convertir.toJson( this );
    }
    
    
}


