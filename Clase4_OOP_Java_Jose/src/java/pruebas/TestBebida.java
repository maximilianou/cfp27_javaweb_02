package pruebas;

import entidades.*;
import java.util.*;

/**
 *<pre>
 * https://en.wikipedia.org/wiki/Test-driven_development
 * https://en.wikipedia.org/wiki/Behavior-driven_development
 * http://www.seleniumhq.org/
 * http://www.oracle.com/technetwork/java/javase/downloads/index.html
 * 
 * 
 * </pre>
 * @author educacion
 */
public class TestBebida {
    
    public static void main(String[] args) {
        System.out.println("pruebas.TestBebida.main() [..]");
        //ArrayList<Bebida> listaBebidas = new ArrayList();
        TreeSet<Bebida> listaBebidas = new TreeSet();
        
        Bebida ron = new Bebida();
        ron.nombre = "Ron Havana";
        listaBebidas.add(ron);

        Bebida vodka = new Bebida();
        vodka.nombre = "Vodka Absolute";
        listaBebidas.add(vodka);
        
        Bebida te = new Bebida();
        te.nombre = "Tequila Jose Cuervo";
        listaBebidas.add(te);
        listaBebidas.add(te);
        listaBebidas.add(te);
        listaBebidas.add(te);

        System.out.println( listaBebidas );
        
//        for( int indice = 0; indice < listaBebidas.size(); indice++ ){
//            System.out.print( " :"+ indice + "::" + listaBebidas.get(indice) );
//        }
        System.out.println("");
        
        Iterator recorrer = listaBebidas.iterator();
        while( recorrer.hasNext() ){
            System.out.print( " =" + recorrer.next() );
        }
        System.out.println("");
        
        System.out.println("pruebas.TestBebida.main() [OK]");
    }
    
}
