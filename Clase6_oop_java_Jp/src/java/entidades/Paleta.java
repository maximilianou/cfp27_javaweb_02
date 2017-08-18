package entidades;

import java.util.ArrayList;

/**
 *
 * @author educacion
 */
public class Paleta {

    public String nombre;
    public int cotaMaxima;
    ArrayList<Pintura> listaPinturas = new ArrayList();

    public void agregar(Pintura unaPintura) throws ExcedidoCantidadDePinturaException {
        if (listaPinturas.size() < cotaMaxima) { // OK
            listaPinturas.add(unaPintura);
        } else { // Excpecion
             throw new ExcedidoCantidadDePinturaException(
                     "Verifique la cantidad de pintura, cota maxima:"
                     + cotaMaxima
                     + " La pintura no ha sido agregada: " 
                     + unaPintura.nombre
                     );
        }
    }

}
