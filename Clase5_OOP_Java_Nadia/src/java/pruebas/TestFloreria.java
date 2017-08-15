package pruebas;

import entidades.Flor;
import entidades.Pedido;

/** <pre>
 * Excepciones
 * TDD: https://en.wikipedia.org/wiki/Test-driven_development
 * BDD: https://en.wikipedia.org/wiki/Behavior-driven_development
 * </pre>
 *
 * @author educacion
 */
public class TestFloreria {
    public static void main(String[] args) {
        System.out.println("pruebas.TestFloreria.main() [..]");
        
        Pedido unPedido = new Pedido();
        unPedido.nombre = "Un Festejo de 15";
        
        Flor centro = new Flor();
        centro.nombre = "Centros de mesa";
        Flor arreglo = new Flor();
        arreglo.nombre = "Arreglo Floral";
        
        unPedido.agregar(centro);
        unPedido.agregar(arreglo);
        
        
        System.out.println("pruebas.TestFloreria.main() [OK]");
    }
}
