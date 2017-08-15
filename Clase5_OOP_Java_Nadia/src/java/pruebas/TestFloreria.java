package pruebas;

import entidades.Flor;
import entidades.Pedido;

/**
 * < pre>
 * Excepciones TDD: https://en.wikipedia.org/wiki/Test-driven_development BDD:
 * https://en.wikipedia.org/wiki/Behavior-driven_development
 * </pre>
 *
 * @author educacion
 */
public class TestFloreria {

    public static void main(String[] args) {
        System.out.println("pruebas.TestFloreria.main() [..]");
        try {
            System.out.println( 3 / 0 );
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
        testPedidoOK();
        testPedidoError();

        System.out.println("pruebas.TestFloreria.main() [OK]");
    }

    public static void testPedidoOK() {
        System.out.println("Test Pedido OK [..]");
        try {
            Pedido unPedido = new Pedido();
            unPedido.cotaMaxima = 2;
            unPedido.nombre = "Un Festejo de 15";
            Flor centro = new Flor();
            centro.nombre = "Centros de mesa";
            Flor arreglo = new Flor();
            arreglo.nombre = "Arreglo Floral";
            unPedido.agregar(centro);
            unPedido.agregar(arreglo);
        } catch (Exception ex) {
            System.out.println("Ocurrio un Error, Verifique " + ex.getMessage());
        }
        System.out.println("Test Pedido OK [OK]");
    }

    public static void testPedidoError() {
        System.out.println("Test Pedido Error [..]");
        try {
            Pedido unPedido = new Pedido();
            unPedido.cotaMaxima = 2;
            unPedido.nombre = "Un Festejo de 15";
            Flor centro = new Flor();
            centro.nombre = "Centros de mesa";
            Flor arreglo = new Flor();
            arreglo.nombre = "Arreglo Floral";

            Flor ramos = new Flor();
            ramos.nombre = "Ramos Amantes";

            //unPedido.agregar(null);
            unPedido.agregar(centro);
            unPedido.agregar(arreglo);
            unPedido.agregar(ramos);

        } catch (Exception ex) {
            System.out.println("Ocurrio un Error, Verifique " + ex.getMessage());
        }

        System.out.println("Test Pedido Error [OK]");

    }
}
