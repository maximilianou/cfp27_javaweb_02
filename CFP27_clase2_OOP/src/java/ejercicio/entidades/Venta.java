package ejercicio.entidades;

import com.google.gson.Gson;

/**
 *
 * @author educacion
 */
public class Venta {
    public int numero;
    public Cliente cliente;
    public Envio esteEnvio;

    @Override
    public String toString() {
        Gson conversor = new Gson();
        return conversor.toJson(this); //To change body of generated methods, choose Tools | Templates.
    }
    
}
