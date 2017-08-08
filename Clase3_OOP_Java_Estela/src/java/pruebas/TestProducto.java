package pruebas;

import entidades.Producto;

/**
 * <pre>
 *  Comenzamo con Productos
 * Para poder hacer un ejercicio de
 * Compra de productos, 
 *  donde 
 *  Una compra tiene un cliente
 *  una compra tiene un vendedor
 *  y una compra tiene una lista de productos ( ArrayList )
 * 
 * Segun ejemplos anteiores, logramos imprimir
 * en el toString en formato JSON
 * Por que JSON lo usamos con AJAX
 * Y asi como las bases de datos SQL usan tablas y campos tipados
 * tambien existen las bses noSQL que almacenan JSON 
 * y filtra y buscan en estos objetos
 * </pre>
 * @author educacion
 */
public class TestProducto {
    
    public static void main(String[] args) {
        System.out.println("pruebas.TestProducto.main() [..]");
        
        Producto zapatilla = new Producto();
        zapatilla.nombre = "Nike Plus";
        zapatilla.precio = 800;
        
        Producto zapato = new Producto();
        zapato.nombre = "Bota Cuero Negro";
        zapato.precio = 1400;
        
        System.out.println( zapatilla );
        System.out.println( zapato );
        
        System.out.println("pruebas.TestProducto.main() [OK]");
    }
    
}
