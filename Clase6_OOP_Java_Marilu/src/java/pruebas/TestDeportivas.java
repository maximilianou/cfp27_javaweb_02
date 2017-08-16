package pruebas;

import entidades.LimiteDeCaracteresExcedidos;
import entidades.Nota;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * < pre>
 * Exception, RuntimeException, NullPointerException, ArithmeticException,
 * FileNotFoundException TDD:
 * https://en.wikipedia.org/wiki/Test-driven_development BDD:
 * https://en.wikipedia.org/wiki/Behavior-driven_development Herrammienta de
 * Testing: http://www.seleniumhq.org/
 * </pre>
 *
 * @author educacion
 */
public class TestDeportivas {

    public static void main(String[] args) {
        System.out.println("pruebas.TestDeportivas.main() [..]");
        testExcepcionesUno();
        // Categorias
        testCategorias();
        // Notas pertenecen a una Categoria
        // Nota tiene texto de no mas de 50 caracteres.
        testNotasLimiteCaracteresOK();
        testNotasLimiteCaracteresERROR();

        // Nota puede tener una imagen de 200px x 150px.
        System.out.println("pruebas.TestDeportivas.main() [OK]");
    }

    private static void testNotasLimiteCaracteresOK() {
        System.out.println("  pruebas.TestDeportivas.testNotasLimiteCaracteresOK() [..]");
        Nota decate2001 = new Nota();
        try {
            decate2001.setTexto("Lo muchachos demostraron.");
            System.out.println("Cantidad Texto: " + decate2001.getTexto().length());
        } catch (LimiteDeCaracteresExcedidos ex) {
            System.out.println("Upa!! con el texto!! " + ex.getMessage());
        }
        System.out.println("  pruebas.TestDeportivas.testNotasLimiteCaracteresOK() [OK]");
    }

    private static void testNotasLimiteCaracteresERROR() {
        System.out.println("  pruebas.TestDeportivas.testNotasLimiteCaracteresERROR() [..]");
        Nota amateur = new Nota();
        try {
            amateur.setTexto("La XXI Copa Mundial de Fútbol Sub-20 se llevó a cabo del 20 de mayo al 11 de junio de 2017. El país que acogió el evento fue Corea del Sur que fue designado el 5 de diciembre de 20131​2​ y se llevó a cabo en 6 ciudades del país. Los jugadores seleccionables son aquellos que nacieron el 1 de enero de 1997 o después de esa fecha.3​ Serbia, campeón de la edición anterior, no podrá defender su título ya que no pudo pasar las rondas clasificatorias de la UEFA.\n"
                    + "La selección de Inglaterra logró su primer título en su historia al vencer en la final del torneo 1-0 a la selección de Venezuela, que fue la sorpresa del torneo al disputar por primera vez en su historia una final de un torneo FIFA y al vencer a selecciones con mayor trayectoria en el fútbol como Alemania, Japón, Estados Unidos y Uruguay.");
            System.out.println("Cantidad Texto: " + amateur.getTexto().length());
        } catch (LimiteDeCaracteresExcedidos ex) {
            System.out.println("Upa!! con el texto!! " + ex.getMessage());
        }
        System.out.println("  pruebas.TestDeportivas.testNotasLimiteCaracteresERROR() [OK]");
    }

    public static void testExcepcionesUno() {
        System.out.println("  pruebas.TestDeportivas.testExcepcionesUno() [..]");
        try {
            // Ver que es una RuntimeException, commo ArithmeticException
            System.out.println(29 / 3);
            try {
                //System.out.println( Math.sqrt( -1 ) );
                System.out.println(53 / 0);
            } catch (ArithmeticException ae) {
                System.out.println("No se puede Dividir por Cero: " + ae.getMessage());
            }
        } catch (Exception ex) {
            System.out.println("Excepcion General: " + ex.getMessage());
        } finally {
            System.out.println("Libero Recursos Tomados para esta operacion");
        }
        System.out.println("  pruebas.TestDeportivas.testExcepcionesUno() [OK]");
    }

    private static void testCategorias() {
        System.out.println("pruebas.TestDeportivas.testCategorias() [..]");

        System.out.println("pruebas.TestDeportivas.testCategorias() [OK]");
    }

}
