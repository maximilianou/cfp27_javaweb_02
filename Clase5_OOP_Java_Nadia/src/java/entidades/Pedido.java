package entidades;

import java.util.ArrayList;

/**
 *
 * @author educacion
 */
public class Pedido {

    public String nombre;
    public int cotaMaxima;
    ArrayList<Flor> listaFloral = new ArrayList();
    
    public void agregar(Flor parametroFlor) throws Exception {
        //throw new UnsupportedOperationException("Aun no esta Programado."); 
        if( listaFloral.size() < cotaMaxima ){
            listaFloral.add( parametroFlor );
        }else{
            throw new Exception(
                      " Verifique Cota Maxima Pedido:"
                    + cotaMaxima 
                    + " No se Agrego:"
                    + parametroFlor.nombre);
        }
        
    }
    
}
