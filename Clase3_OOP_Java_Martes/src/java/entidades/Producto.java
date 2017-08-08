package entidades;

import com.google.gson.Gson;

/**
 *
 * @author educacion
 */
public class Producto {
// ambito declarativo
    public String nombre;
    public int precio;
     
    @Override
    public String toString() {
        // dentro del cuerpo de procedimiento de tares del tuString de prroduto
        Gson convertir = new Gson();
       return convertir.toJson( this );
//       System.out.println("Imprimo algo"); // Error, luego del return
    }
 //      System.out.println("Imprimo algo"); // Error, dentro del blocke declarativo de la clse Producto 
    
}
