package pruebas;

import entidades.*;
import java.util.*;

/**<pre>
 *  TDD - Test Driven Development
 *  Una forma de programar, pensando en como se va a utilizar.
 * https://en.wikipedia.org/wiki/Test-driven_development
 * 
 * BDD - Behavior Driven Development
 *  Una forma e encarar las cosas en funcion de su USO
 * https://en.wikipedia.org/wiki/Behavior-driven_development
 *</pre>
 * @author educacion
 */
public class TestListas {
    public static void main(String[] args) {
        System.out.println("pruebas.TestListas.main() [..]");
        
        //ArrayList<Object> recetas = new ArrayList();
        //ArrayList<Receta> recetas = new ArrayList();
        TreeSet<Receta> recetas = new TreeSet();

        Receta heladoFrutos = new Receta();
        heladoFrutos.nombre = "Helado Frutos del Bosque";
//        Ingrediente manteca = new Ingrediente();
//        recetas.add( manteca );
        Receta pastaFrola = new Receta();
        pastaFrola.nombre = "Tarta Pasta Frola de Membrillo";

        Receta pan = new Receta();
        pan.nombre = "Pan Casero";
        
        recetas.add(heladoFrutos);
        recetas.add(pastaFrola);
        recetas.add(pan);
        recetas.add(pan);
        recetas.add(pan);
        System.out.println(recetas);

//        for( int indice = 0; indice < recetas.size() ; indice++ ){
//            System.out.print(" :: "+ indice+":"+ recetas.get(indice).nombre );
//        }        
        System.out.println();
        
        Iterator<Receta> recorrer = recetas.iterator();
        while( recorrer.hasNext() ){
            System.out.print( " > " + recorrer.next().nombre );
        }
        System.out.println();
        
        System.out.println("pruebas.TestListas.main() [OK]");
    }
}
