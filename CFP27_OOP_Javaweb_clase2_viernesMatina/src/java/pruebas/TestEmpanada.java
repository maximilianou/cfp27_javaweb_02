package pruebas;
import entidades.Empanada;
/**  <pre>
 * En esta clase de TEst
 * USO la clase Empanada, 
 * para checkar el sistema que voy  entregar.
 * Test Empanad DEPENDE de la clase Empanada.
 * La clase Empanada, NO Depende de la clase TestEmpanada
 * </pre>
 * @author educacion
 */
public class TestEmpanada {
    public static void main( String [] args ){
        System.out.println("Test Tipos Basicos [..]");
        Empanada laCaprese = new Empanada();
        Empanada dePollo = new Empanada();
        laCaprese.nombre = "Capresse";
        laCaprese.stock = 200;
        laCaprese.precio = 15.75f;
        laCaprese.graduacioonAceite = 0.0000000000000000000000001;
        dePollo.nombre = "Pollo";
        dePollo.stock = 600;
        dePollo.precio = 13.25f;
        
        
        System.out.println("Test Tipos Basicos [OK]");
    }
    
}
