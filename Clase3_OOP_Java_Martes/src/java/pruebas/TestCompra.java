package pruebas;

import entidades.Cliente;
import entidades.*;

/**
 *
 * @author educacion
 */
public class TestCompra {
    public static void main(String[] args) {
        System.out.println("pruebas.TestCompra.main() [..]");
        
        Compra pedidoArepas = new Compra();
        pedidoArepas.elCliente = new Cliente();
        pedidoArepas.elVendedor = new Vendedor();
        System.out.println( pedidoArepas );

        Compra pedidoPizza = new Compra();
        pedidoPizza.elCliente = new Cliente();
        pedidoPizza.elVendedor = new Vendedor();
        System.out.println( pedidoPizza );

        System.out.println("pruebas.TestCompra.main() [OK]");
    }
}
