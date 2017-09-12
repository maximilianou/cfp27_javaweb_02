package entidades;

import com.google.gson.Gson;
import java.util.ArrayList;
//import java.lang.Object;
/**
 * <pre>
 * Aplicando el ejercicio de Compra
 * Agregacion o Composicion
 * Mas Collection, colecciones.
 * </pre>
 * @author educacion
 */
public class Compra { // extends Object {
    ArrayList<Producto> listaProductos = new ArrayList();
    Cliente elCliente;
    Vendedor elVendedor;
    /**<pre> 
     * Declaracion del agregar
     * Que tiene que tener un Producto.
     * Agregar a una lista de productos de la compra
     * </pre>
     */
    public void agregar(Producto actualProducto){
        listaProductos.add(actualProducto);
    }
/*    
    @Override
    public String toString() {
        Gson convertir = new Gson();
        return convertir.toJson( this );
    }
*/
}
