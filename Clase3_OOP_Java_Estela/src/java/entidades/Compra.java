package entidades;

import com.google.gson.Gson;
import java.util.ArrayList;

/**
 *
 * @author educacion
 */
public class Compra {

    public Cliente elCliente;
    public Vendedor elVendedor;
    ArrayList<Producto> listaProductos = new ArrayList();
    
    public void agregar( Producto unProducto ){
        listaProductos.add(unProducto);
    }
    
    @Override
    public String toString() {
        Gson convertir = new Gson();
        return convertir.toJson( this );
    }
    
}
