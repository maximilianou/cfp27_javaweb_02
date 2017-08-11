package pruebas;

import entidades.*;
import java.util.*;

/**
 *<pre>
 * https://en.wikipedia.org/wiki/Test-driven_development
 * https://en.wikipedia.org/wiki/Behavior-driven_development
 * http://www.seleniumhq.org/
 * 
 * 
 * </pre>
 * @author educacion
 */
public class TestBebida {
    
    public static void main(String[] args) {
        System.out.println("pruebas.TestBebida.main() [..]");
        ArrayList<Bebida> listaBebidas = new ArrayList();
        
        Bebida ron = new Bebida();
        ron.nombre = "Ron Havana";
        listaBebidas.add(ron);

        Bebida vodka = new Bebida();
        vodka.nombre = "Vodka Absolute";
        listaBebidas.add(vodka);
        
        Bebida te = new Bebida();
        te.nombre = "Tequila Jose Cuervo";
        listaBebidas.add(te);

        System.out.println( listaBebidas );
        
        System.out.println("pruebas.TestBebida.main() [OK]");
    }
    
}
