package pruebas;

import entidades.Turno;
import entidades.Agenda;

/**
 * < pre>
 * Tema: Excepciones
 * Ejemplo basado en agenda de turnos
 * TDD https://en.wikipedia.org/wiki/Test-driven_development
 * BDD https://en.wikipedia.org/wiki/Behavior-driven_development
 * <pre>
 * @author educacion
 */
public class TestTurnos {

    public static void main(String[] args) {
        System.out.println("pruebas.TestTurnos.main() [..]");
        try {
            Agenda clinico = new Agenda();
            clinico.nombre = "Perez, Romina Julieta";
            clinico.cantidadMaximaTurnos = 2; // Limito Turnos

            Turno primerTurno = new Turno();
            primerTurno.nombre = "Edgardo";
            clinico.agregar(primerTurno);

            Turno segundoTurno = new Turno();
            segundoTurno.nombre = "Vicky";
            clinico.agregar(segundoTurno);

            Agenda traumatologo = new Agenda();
            traumatologo.nombre = "Garcia, Hector Daniel";
            traumatologo.cantidadMaximaTurnos = 2; // Limito Turnos
            
            Turno traumaTurno = new Turno();
            traumaTurno.nombre = "Carrizo";
            traumatologo.agregar(traumaTurno);

            Turno tramaticoTurno = new Turno();
            tramaticoTurno.nombre = "Mica";
            traumatologo.agregar(tramaticoTurno);
            
            Turno extraTurno = new Turno();
            extraTurno.nombre = "Roberto";
            traumatologo.agregar(extraTurno);
            System.out.println("Todos los Turnos Agregados --------- -------");
        } catch (Exception ex) {
          System.out.println("Verifique el Error Generico " + ex.getMessage());
          //ex.printStackTrace();
        }
        System.out.println("pruebas.TestTurnos.main() [OK]");
    }
}
