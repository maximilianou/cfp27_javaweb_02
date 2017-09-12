package pruebas;

import entidades.*;

/**
 *
 * @author educacion
 */
public class TestTragos {
    public static void main(String[] args) {
        System.out.println("pruebas.TestTragos.main() [..]");
        
        Trago daiquiri = new Trago();
        daiquiri.nombre = "Daiquiri Segun Matias";
        
        Bebida ron = new Bebida();
        ron.nombre = "Ron Havana";

        Bebida fruti = new Bebida();
        fruti.nombre = "Pulpa de Frutilla";
        
        daiquiri.agregar( ron );
        daiquiri.agregar( fruti );
        
        Trago caipi = new Trago();
        
        Trago lemonsham = new Trago();
        
        System.out.println(daiquiri);
        
        System.out.println("pruebas.TestTragos.main() [OK]");
    }
}
