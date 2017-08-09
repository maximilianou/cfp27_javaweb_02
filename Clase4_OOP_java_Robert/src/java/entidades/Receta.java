package entidades;

import com.google.gson.Gson;

/**<pre>
 * Hacemos Import del GSON para convertir a JSON nuestras clases
 * http://json.org/
 * 
 * </pre>
 * @author educacion
 */
public class Receta  implements Comparable<Receta> {
    public String nombre;

    @Override
    public String toString() {
        Gson convertir = new Gson();
        return convertir.toJson( this );
    }

    @Override
    public int compareTo(Receta t) {
       return this.nombre.compareTo( t.nombre );
    }
    
    
}
