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
        
        testDosPlatos();
        testTresPlatos();
        
        System.out.println("pruebas.TestCartaComidas.main() [OK]");
    }
    public static void testDosPlatos(){
      System.out.println("TestCartaComidas.testDosPlatos() [..]");
      try{
        Carta cartaPastas = new Carta();
        cartaPastas.nombre = "La Carta de Pastas";
        Plato tallarines = new Plato();
        tallarines.nombre = "TAllarines al Pesto";
        Plato ravioles = new Plato();
        ravioles.nombre = "Ravioles con Jamon y Queso";
        cartaPastas.agregar( tallarines );
        cartaPastas.agregar( ravioles );
      }catch(Exception ex){
          System.out.println("Error, Verifique la cantidad de platos."+ ex.getMessage());
      }
      System.out.println("TestCartaComidas.testDosPlatos() [OK]");
    }
    public static void testTresPlatos(){
      System.out.println("TestCartaComidas.testTresPlatos() [..]");
      try{
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
      }catch(Exception ex){
          System.out.println("Error, Verifique la cantidad de platos."+ ex.getMessage());
      }
      System.out.println("TestCartaComidas.testTresPlatos() [OK]");
        
    }
    
    
}
