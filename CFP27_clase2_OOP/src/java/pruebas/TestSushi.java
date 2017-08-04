package pruebas;

import entidades.Sushi;

/**
 * <pre>
 * Tipos Basicos de Datos
 *  byte (Entero de 8 bits de almacenmiento)
 *  short (Entero de 16 bits)
 *  int ( Entero de 32 bits )
 *  long ( Entero de 64 bits )
 *  float (Decimal Flotante, Real de 32 bits)
 *  double ( punto flotante de 64 bits)
 *  boolean ( true o false )
 *  char ( 'A' 'a' )
 * </pre>
 * @author educacion
 */
public class TestSushi {
    
    public static void main(String [] args){
        System.out.println("Test Sushi [..]");
        
        Sushi elSashimi = new Sushi();
        elSashimi.nombre = "SaShimi";
        elSashimi.cantidaPiezas = 28;
        elSashimi.precio = 600;
        
        Sushi elNiguiri = new Sushi();
        elNiguiri.nombre = "Niguiri";
        elNiguiri.cantidaPiezas = 32;
        elNiguiri.precio = 800;
        
        System.out.println("Test Sushi [OK]");
    }
    
}

