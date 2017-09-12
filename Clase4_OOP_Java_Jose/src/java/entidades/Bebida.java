
package entidades;

/**
 *
 * @author educacion
 */
public class Bebida implements Comparable<Bebida>{

    public String nombre;

    @Override
    public String toString() {
       return "" + nombre; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Bebida t) {
       return this.nombre.compareTo(t.nombre);
    }
    
    
}
