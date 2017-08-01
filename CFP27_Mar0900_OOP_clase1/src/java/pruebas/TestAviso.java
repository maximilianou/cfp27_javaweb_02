package pruebas;

import entidades.Aviso;

/**
 * <pre>
 * TODO: Clases
 * TODO: Objetos o INstancias
 * TODO: atributos
 * TODO:   tipos basicos de datos
 * TODO: metodos
 * TODO:   decision, if, switch
 * TODO:   ciclos, for, while
 * TODO: Herencia
 * TODO: Interfaces
 * TODO: Excepciones
 * TODO: API, Collections, List, Set, Map, ArrayList, TreeMap
 * TODO: JDBC, SQL
 * TODO: HTTPServlet
 * TODO: Agregacion
 * TODO: Composicion
 * TODO: Filtros
 * </pre>
 * @author educacion
 */
public class TestAviso {
    
    public static void main(String[]args){
        System.out.println("TEST Aviso: [..]");
        Aviso reyna = new Aviso();
        reyna.titulo = "Arepa, Reina Pepeada!!";
        reyna.precio = 100;
        System.out.println("" + reyna.titulo);
        System.out.println("" + reyna.precio);
        
        Aviso domino = new Aviso();
        domino.titulo = "Arepa, Protos Negros y Queso Blanco!!";
        domino.precio = 90;
        System.out.println("" + domino.titulo);
        System.out.println("" + domino.precio);
        
        System.out.println("TEST Aviso: [OK]");
    }
    
}
