package pruebas;

import entidades.*;
import java.util.*;


/**<pre>
 * Desrrollo desde el Testing
 * https://en.wikipedia.org/wiki/Test-driven_development
 * https://en.wikipedia.org/wiki/Behavior-driven_development
 * http://www.seleniumhq.org/
 * 
 * Clase de Collections en Java
 * 
 * </pre>
 *
 * @author educacion
 */
public class TestInsumos { // extends java.lang.Object {
    public static void main(String[] args) {
        System.out.println("pruebas.TestInsumos.main()  [..]");
//        ArrayList<Insumo> listaInsumos = new ArrayList();
        TreeSet<Insumo> listaInsumos = new TreeSet();
//        ArrayList<Object> listaInsumos = new ArrayList();
        System.out.println( listaInsumos );
        
        Insumo pen = new Insumo();
        pen.nombre = "Pendrive 100mbps kingston 32gb";
        listaInsumos.add(pen);
        Insumo auricu = new Insumo();
        auricu.nombre = "Auticulres con bluetooth Super";
        listaInsumos.add(auricu);
        Insumo tec = new Insumo();
        tec.nombre = "Teclado Ergonomico Wireless ";
        listaInsumos.add(tec);
        listaInsumos.add(tec);
        listaInsumos.add(tec);
//        String unTexto = "otro pendrive ";        
//        listaInsumos.add(  unTexto );
//        for( int indice = 0 ; indice < listaInsumos.size() ; indice++ ){
//            System.out.print("  =" + indice + "="+ listaInsumos.get(indice) );
//        }        
        System.out.println("");
        Iterator recorer = listaInsumos.iterator();
        while( recorer.hasNext() ){
            System.out.print(" ::" + recorer.next() );
        }
        System.out.println("");
        
        System.out.println("pruebas.TestInsumos.main()  [OK]");
    }
}
