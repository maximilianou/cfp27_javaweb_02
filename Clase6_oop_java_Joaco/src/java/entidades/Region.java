package entidades;

import java.util.ArrayList;

/**
 *
 * @author educacion
 */
public class Region {

    public String nombre;
    public int cotaMaximaAdultos;
    private ArrayList<Persona> listaPersonas = new ArrayList();

    public void agregarAdulto(Persona unaPersona) throws AdultosCotaMaximaException {
        if( listaPersonas.size() < cotaMaximaAdultos  ){
            // caso de ok, no supera la cota
            listaPersonas.add( unaPersona );
        }else{
            // Aqui debo lanzar la AdultosCotaMaximaException
            throw new AdultosCotaMaximaException(
                    "Excedio la cota, "
                    + cotaMaximaAdultos
                    + " la persona no se agrego: "
                    + unaPersona.nombre );
        }
    }
    
}
