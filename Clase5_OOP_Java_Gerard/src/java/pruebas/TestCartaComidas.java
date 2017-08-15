package pruebas;

/**<pre>
 * Exceptions
 * TDD:  https://en.wikipedia.org/wiki/Test-driven_development
 * BDD:  https://en.wikipedia.org/wiki/Behavior-driven_development
 * </pre>
 *
 * @author educacion
 */
public class TestCartaComidas {
    public static void main(String[] args) {
        System.out.println("pruebas.TestCartaComidas.main() [..]");
        
        Carta cartaPastas = new Carta();
        cartaPastas.nombre = "La Carta de Pastas";
        
        Plato tallarines = new Plato();
        tallarines.nombre = "TAllarines al Pesto";
        
        Plato ravioles = new Plato();
        ravioles.nombre = "Ravioles con Jamon y Queso";
        cartaPastas.agregar( tallarines );
        cartaPastas.agregar( ravioles );
        
        Carta cartaCarnes = new Carta();
        cartaCarnes.nombre = "La Carta de Carnes";
        Plato asado = new Plato();
        asado.nombre = "Asado parrilla con Arbol Talado de Bosques de Bariloche";
        Plato bifeChori = new Plato();
        bifeChori.nombre = "Bife de Chorizo a la Plancha";
        Plato bondiola = new Plato();
        bondiola.nombre = "Bondiolita de la Casa";
        cartaCarnes.agregar( asado );
        cartaCarnes.agregar( bifeChori );
        cartaCarnes.agregar( bondiola );
        
        System.out.println("pruebas.TestCartaComidas.main() [OK]");
    }
    public static void testDosPlatos(){
        
    }
    public static void testTresPlatos(){
        
    }
    
    
}
