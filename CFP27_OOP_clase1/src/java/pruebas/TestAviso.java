package pruebas;

import entidades.Aviso;

/**
 * <h2>Temas del Curso de OOP con Java Web</h2>
 * <pre>
 * TODO: Clases 
 * TODO: Objetos o Instnancias 
 * TODO: atributos 
 * TODO:  tipos basicos de datos
 * TODO: metodos
 * TODO:  decision, if, switch
 * TODO:  ciclos, while, for
 * TODO: encapsulamiento
 * TODO: constructor
 * TODO: herencia
 * TODO: clase abstract
 * TODO: interfaces
 * TODO: static, unica instancia en memoria RAM
 * TODO: final, constantes
 * TODO: Exception
 * TODO: Polimorfismo, con redefinicion
 * TODO: Composicion, ciclos de vida de relaciones de objetos
 * TODO: Agregacion, ciclos de vida de relaciones de objetos
 * TODO: Collections, List, Set, Map, ArrayList, TreeMap
 * TODO: JDBC: SQL
 * TODO: HTTPServlet, Web, Get, Post, Put, Delete
 * TODO: Filter, sistema de Login
 * </pre>
 */
public class TestAviso {
    
    public static void main(String [] args){
        System.out.println("TEST Aviso: [..]  ");
        Aviso merlot = new Aviso();
        merlot.titulo = "Cristobal Rojo Rubi Intenso y gran complejidad de aromas frutales. ";
        merlot.precio = 750;
        System.out.println( merlot );// por defecto llama al toString
        System.out.println( merlot.toString() ); // no necesrio, por facilidad del lenguje 
        Aviso cabernet = new Aviso();
        cabernet.titulo = "Facundo se vende mucho por su aroma y su sabor. ";
        cabernet.precio = -30; // precio Negativo, mmmm... vemos luego
        System.out.println( cabernet );
        System.out.println("TEST Aviso: [OK]  ");
        
    }
}
