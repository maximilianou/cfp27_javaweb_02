package pruebas;

import entidades.*;

/**
 * <pre>
 * Testeo unitrio de Producto
 * Aqui podemos ver, el Standad Error y Standard Output
 * Que salen en la interface grafica diferido, indiscriminado.
 * 
 * </pre>
 * @author educacion
 */
public class TestProducto {
    public static void main(String[] args) {
        System.out.println("Test Productos [..]");
        
        Producto peluda = new Producto();
        peluda.nombre = "Arepa Peluda";
        peluda.precio = 80;
        
        Producto cheese = new Producto();
        cheese.nombre = "Arepa Jamon y Queso";
        cheese.precio = 70;

        System.out.println(  peluda  );
        System.out.println(  cheese  );
        
        
        System.out.println("Test Productos [OK]");
        //System.err.println("Test Productos [..]");
        //System.err.println("Test Productos [OK]");
    }
}
