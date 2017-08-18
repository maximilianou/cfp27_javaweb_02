package pruebas;

import entidades.Adulto;
import entidades.AdultosCotaMaximaException;
import entidades.Persona;
import entidades.Region;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * < pre>
 * Exception, RuntimeException,
 *             ArithmeticException, NullPointerException,
 * FileNotFoundException, AccessDeniedException
 * TDD:  https://en.wikipedia.org/wiki/Test-driven_development
 * BDD:  https://en.wikipedia.org/wiki/Behavior-driven_development
 * </pre>
 *
 * @author educacion
 */
public class TestSaludRegional {

    public static void main(String[] args) {
        System.out.println("pruebas.TestSaludRegional.main() [..]");

        testRegionalAdultosOK();

        testRegionalAdultosERROR();

        //testRegionalMenoresOK();
        //testRegionalMenoresERROR();
        System.out.println("pruebas.TestSaludRegional.main() [OK]");
    }

    private static void testRegionalAdultosOK() {
        System.out.println("pruebas.TestSaludRegional.testRegionalAdultosOK() [..]");
        try {
            // Aqui voy a programar lo que quiero que funcione
            Region santelmo = new Region();
            santelmo.nombre = "San Telmo";
            santelmo.cotaMaximaAdultos = 2;

            Persona roberto = new Adulto();
            roberto.nombre = "Roberto Garcia";
            Persona marce = new Adulto();
            marce.nombre = "Marcela Martinez";

            santelmo.agregarAdulto(roberto);
            santelmo.agregarAdulto(marce);
        } catch (AdultosCotaMaximaException ex) {
            System.out.println("!!! Error !!! " + ex.getMessage());
        }

        System.out.println("pruebas.TestSaludRegional.testRegionalAdultosOK() [OK]");
    }

    private static void testRegionalAdultosERROR() {
        System.out.println("pruebas.TestSaludRegional.testRegionalAdultosERROR() [..]");
        try {
            // Aqui voy a programar lo que quiero que funcione
            Region montserrat = new Region();
            montserrat.nombre = "San Telmo";
            montserrat.cotaMaximaAdultos = 2;

            Persona pedrito = new Adulto();
            pedrito.nombre = "Pedro Gaviota";
            Persona julieta = new Adulto();
            julieta.nombre = "Julieta Zloslnickj";
            Persona martina = new Adulto();
            martina.nombre = "Martina Navratilova";

            montserrat.agregarAdulto(pedrito);
            montserrat.agregarAdulto(julieta);
            montserrat.agregarAdulto(martina);

        } catch (AdultosCotaMaximaException ex) {
            System.out.println("!!! Error !!! " + ex.getMessage());
        }
        System.out.println("pruebas.TestSaludRegional.testRegionalAdultosERROR() [OK]");
    }

}
