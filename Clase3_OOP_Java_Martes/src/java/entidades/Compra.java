package entidades;

import com.google.gson.Gson;

/**
 *
 * @author educacion
 */
public class Compra {

    public Cliente elCliente;
    public Vendedor elVendedor;

    public String toString() {
        Gson convertir = new Gson();
        return convertir.toJson(this);
    }

}
