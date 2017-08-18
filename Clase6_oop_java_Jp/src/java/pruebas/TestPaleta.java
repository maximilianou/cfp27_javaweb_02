package pruebas;

import entidades.ColorVioleta;
import entidades.Pintura;
import entidades.ColorBlanco;
import entidades.ExcedidoCantidadDePinturaException;
import entidades.Paleta;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Excepciones, RuntimeException ArithmeticException, NullPointerException
 * FileNotFoundException, AccessDeniedException TDD
 * https://en.wikipedia.org/wiki/Test-driven_development BDD
 * https://en.wikipedia.org/wiki/Behavior-driven_development
 *
 * @author educacion
 */
public class TestPaleta {

    public static void main(String[] args) {
        System.out.println("pruebas.TestPaleta.main() [..]");
        testRuntimeExceptionOK();
        testPaletaBlanca();
        testPaletaVioleta();
        testPaletaDurazno();
        System.out.println("pruebas.TestPaleta.main() [OK]");
    }

    private static void testPaletaBlanca() {
        System.out.println("pruebas.TestPaleta.testPaletaBlanca() [..]");
        try {
            Paleta paletaBlanca = new Paleta();
            paletaBlanca.nombre = "Paleta Blanca";
            paletaBlanca.cotaMaxima = 5;
            Pintura unablanca = new ColorBlanco();
            unablanca.nombre = "Blanco";

            paletaBlanca.agregar(unablanca);
            paletaBlanca.agregar(unablanca);
            paletaBlanca.agregar(unablanca);
            paletaBlanca.agregar(unablanca);

        } catch (ExcedidoCantidadDePinturaException ex) {
            System.out.println("CUIDADO!!!:: " + ex.getMessage());
        }
        System.out.println("pruebas.TestPaleta.testPaletaBlanca() [OK]");
    }

    private static void testPaletaVioleta() {
        System.out.println("pruebas.TestPaleta.testPaletaVioleta() [..]");
        try {
            Paleta paletaVioleta = new Paleta();
            paletaVioleta.nombre = "Paleta Violeta";
            paletaVioleta.cotaMaxima = 3;
            Pintura unavioleta = new ColorVioleta();
            unavioleta.nombre = "Violeta";
            
            paletaVioleta.agregar(unavioleta);
            paletaVioleta.agregar(unavioleta);
            paletaVioleta.agregar(unavioleta);
            paletaVioleta.agregar(unavioleta);
            paletaVioleta.agregar(unavioleta);
            paletaVioleta.agregar(unavioleta);
            
        } catch (ExcedidoCantidadDePinturaException ex) {
            System.out.println("CUIDADO!!!:: " + ex.getMessage());
        }
        System.out.println("pruebas.TestPaleta.testPaletaVioleta() [OK]");
    }

    private static void testPaletaDurazno() {
        System.out.println("pruebas.TestPaleta.testPaletaDurazno() [..]");

        System.out.println("pruebas.TestPaleta.testPaletaDurazno() [OK]");
    }

    public static void testRuntimeExceptionOK() {
        System.out.println("  pruebas.TestPaleta.testRuntimeExceptionOK() [..]");
        try {
            System.out.println(35 / 2);
            System.out.println(35 / 0);
        } catch (ArithmeticException ae) {
            System.out.println("Especifica : " + ae.getMessage());
        } finally {
            System.out.println("Libero Recursos compartidos !! ");
        }
        System.out.println("  pruebas.TestPaleta.testRuntimeExceptionOK() [OK]");
    }

}
