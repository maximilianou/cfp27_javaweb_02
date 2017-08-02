package entidades;

/**
 *
 * @author educacion
 */
public class Aviso {
    
    public String titulo;
    /** Precio mayor a cero por favor.  */
    public float precio;

    
    
//    public static void main(String[]args){
//        System.out.println("Aviso, desde adentro [..]");
//
//        System.out.println("Aviso, desde adentro [OK]");
//    }

    @Override
    public String toString() {
        return  "Aviso: " + titulo + ": pesos: " + precio; 
    }
    
}
