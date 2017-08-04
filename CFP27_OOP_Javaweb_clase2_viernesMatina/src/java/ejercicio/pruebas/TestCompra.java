package ejercicio.pruebas;

import ejercicio.entidades.*;

/** <pre>
 * TODO: Ejercicio
 * La Compra: Resolver en Codigo fuente 
 * Una Compra tiene un Pedido
 * Un Pedido esta compuesto por un Cliente 
 * Un Pedido esta compuesto por un Vendedor
 * Un Pedido esta compuesto por Empanadas
 * Este es el caso de Test de Uso, Testing Unitario
 * </pre>
 * @author educacion
 */
public class TestCompra {
    public static void main(String [] args){
        System.out.println("Test Compra [..]");
        
        Cliente nosotrO = new Cliente();
        nosotrO.numeroDeCliente = 1071;

        Vendedor delaGran = new Vendedor();
        delaGran.nombre = "La Gran Siete";
        
        Pedido pedidoAlmuerzoViernes = new Pedido();
        pedidoAlmuerzoViernes.cliente = nosotrO;
        pedidoAlmuerzoViernes.vendedor = delaGran;
        
        
        System.out.println("Test Compra [OK]");
    }
}
