package ejercicio.pruebas;

// import ejercicio.entidades.Cliente;
// import ejercicio.entidades.Venta;
import ejercicio.entidades.*;

/**
 * <pre>
 * Ejercicio: Tipos basicos de datos, en carar solucion real
 *   El Delivery es un Servicio de Envio
 *   Un Servicio es la Venta
 *   El Cliente tiene Telefono
 *   El Envio es a un Cliente
 *   El Delivery viene por apliccion y sabe la ubicacion 
 *   La Venta esta compuesta por
 *      Cliente,
 *      Envio desde Aplicacion, o por telefono, al local
 *      
 * </pre>
 * @author educacion
 */
public class TestDelivery {
    public static void main(String [] args){
        System.out.println("Test Compra [..]");
        
        Cliente nad = new Cliente();
        nad.dni = "34000001";
        
        Envio aCasa = new Envio();
        
        Venta hoyNoche = new Venta();
        hoyNoche.numero = 234;
        hoyNoche.cliente = nad;
        hoyNoche.esteEnvio = aCasa;
        
        System.out.println(hoyNoche);
        System.out.println("Test Compra [OK]");
    }
}
