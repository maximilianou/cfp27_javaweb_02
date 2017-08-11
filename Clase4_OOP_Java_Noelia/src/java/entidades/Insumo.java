package entidades;

/**
 *
 * @author educacion
 */
public class Insumo implements Comparable<Insumo> {
    public String nombre;

    @Override
    public int compareTo(Insumo t) {
       return this.nombre.compareTo( t.nombre );
    }
    
}
