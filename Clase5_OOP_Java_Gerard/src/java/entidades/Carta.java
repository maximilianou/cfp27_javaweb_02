package entidades;

import java.util.ArrayList;

/**
 *
 * @author educacion
 */
public class Carta {
    public String nombre;
    
    ArrayList<Plato> listaPlatos = new ArrayList();
    public int cotaMaxima;
    
    public void agregar(Plato parametroPlato) throws Exception {
        //throw new UnsupportedOperationException("Aun No Programado, aguantaaAaA!!."); 
        if( listaPlatos.size() < cotaMaxima ){
          listaPlatos.add(parametroPlato);
        }else{
            throw new Exception("Verifique Cantidad de Platos Menor a: "
                    + cotaMaxima + " No Ha sido Agregado El Plato:" 
                    + parametroPlato.nombre );
        }
    }
}
