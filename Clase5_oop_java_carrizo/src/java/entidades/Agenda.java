package entidades;

import java.util.ArrayList;

/**
 *
 * @author educacion
 */
public class Agenda {

    public String nombre;
    public int cantidadMaximaTurnos;
    ArrayList<Turno> listaTurnos = new ArrayList();

    // Metodo Constructor
    public Agenda() {
        System.out.println("Agenda Creando..");
    }

    public void agregar(Turno parametroTurno) throws Exception {
        //throw new UnsupportedOperationException("Aun No He Programado este Metodo agregar."); 
        if ( listaTurnos.size() < cantidadMaximaTurnos ) {
            listaTurnos.add(parametroTurno);
            System.out.println("Agenda:" + nombre + " Turno Agregado:" + parametroTurno.nombre);
        } else {
            throw new Exception("Excede la Cantidad Maxima, Medico:"+nombre+" Paciente:"+parametroTurno.nombre);
        }
    }

}
