package pruebas;
import entidades.*;

/**
 *
 * @author educacion
 */
public class TestCompra {
    
    public static void main(String[] args) {
        System.out.println("pruebas.TestCompra.main() [..]");
        Compra unaCompra = new Compra();
        unaCompra.elCliente = new Cliente();
        unaCompra.elCliente.nombre = "Marito";
        unaCompra.elVendedor = new Vendedor();
        unaCompra.elVendedor.nombre = "Mauricio";
        
        Producto zapatilla = new Producto();
        zapatilla.nombre = "Nike Air";
        zapatilla.precio = 2500;
        
        unaCompra.agregar( zapatilla );
        
        Producto zapato = new Producto();
        zapato.nombre = "Nautico";
        zapato.precio = 1000;
        unaCompra.agregar( zapato );
        
        System.out.println( unaCompra );
        
        Compra otraCompra = new Compra();
        
        Cliente minorista = new Cliente();
        minorista.nombre = "Laura";
        
        Vendedor particular = new Vendedor();
        particular.nombre = "Marcela";
        
        otraCompra.elCliente = minorista;
        otraCompra.elVendedor = particular;
        
        Producto cam = new Producto();
        cam.nombre = "Camiseta";
        cam.precio = 500;
        Producto botines = new Producto();
        botines.nombre = "Botines ";
        botines.precio = 1700;
        Producto bota = new Producto();
        bota.nombre = "BotaManga ";
        bota.precio = 3000;
        
        otraCompra.agregar(cam);
        otraCompra.agregar(botines);
        otraCompra.agregar(bota);
        System.out.println(  otraCompra  );
        
        System.out.println("pruebas.TestCompra.main() [OK]");
    }
    
}
