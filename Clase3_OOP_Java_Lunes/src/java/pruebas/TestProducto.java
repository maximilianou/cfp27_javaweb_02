package pruebas;

import com.google.gson.Gson;
import entidades.Producto;

/**
 * Testing Unitario de Producto.
 * Repaso de Tipos Basicos, y agregado del Metodo Overriden.
 * 
 * @author educacion
 */
public class TestProducto {
    public static void main(String[] args) {
        System.out.println("Test Prod [..]");
        Producto unaRemera = new Producto();
        unaRemera.nombre = "Remera Musculosa";
        unaRemera.precio = 300;
        
        Producto unaCorbata = new Producto();
        unaCorbata.nombre = "Corata Lisa";
        unaCorbata.precio = 200;
        
        System.out.println(unaRemera);
        System.out.println(unaCorbata);

        System.out.println("Test Prod [OK]");
    }
}
