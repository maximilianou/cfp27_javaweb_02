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
        pedidoArepas.elCliente.nombre = "Julia Maria";
        pedidoArepas.elVendedor = new Vendedor();
        pedidoArepas.elVendedor.nombre = "Michael Angelo";
        Producto laPe = new Producto();
        laPe.nombre = "peluda";
        laPe.precio = 90;
        Producto laCh = new Producto();
        laCh.nombre = "ja queso";
        laCh.precio = 70;
        pedidoArepas.agregar(laPe);
        pedidoArepas.agregar(laCh);
        System.out.println(pedidoArepas);

        Compra pedidoPizza = new Compra();

        Cliente elClientito = new Cliente();
        elClientito.nombre = "Rogelio";
        pedidoPizza.elCliente = elClientito;

        Vendedor elVendedorcito = new Vendedor();
        elVendedorcito.nombre = "Carlos";
        pedidoPizza.elVendedor = elVendedorcito;
        Producto muza = new Producto();
        muza.nombre = "Muzzarella ";
        Producto fuga = new Producto();
        fuga.nombre = "Fugazzeta Rellena con Jamon y Queso y Morrones, y Palmeitos";
        pedidoPizza.agregar(fuga);
        pedidoPizza.agregar(muza);
        elClientito.nombre = "Julia Marieta" ;
        System.out.println(pedidoPizza);

        Compra cc = new Compra();
        cc.elCliente = elClientito;
        System.out.println(cc);
        
        
        System.out.println("pruebas.TestCompra.main() [OK]");
    }
}
