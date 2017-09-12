package pruebas;

import entidades.Compra;
import entidades.Producto;

/** <pre>
 * Ejercicio de lograr la compra de producto,
 * dados los conocimiento que tenemos al dia de hoy..
 * Clases, Atributos, Metodos, 
 * metodo override, toString, JSON
 * Collections
 * </pre>
 * @author educacion
 */
public class TestCompra {
    
    
    public static void main(String[] args) {
        System.out.println("Test Compra [..]");
        
        Compra laCompra = new Compra();
        
       Producto laCorbata = new Producto();
        laCorbata.nombre = "Corbata Rojo Punzo";
        laCorbata.precio = 500;
        
        Producto elPantalon = new Producto();
        elPantalon.nombre = "Pantalon con Tiradores";
        elPantalon.precio = 2000;
        
        Producto laCamisa = new Producto();
        laCamisa.nombre = "Camisa Clasica";
        laCamisa.precio = 1000;
        
        laCompra.agregar( laCorbata );
        laCompra.agregar( elPantalon );
        laCompra.agregar( laCamisa );
        
        
        System.out.println( laCompra  );
        System.out.println("Test Compra [OK]");
    }
    
}
