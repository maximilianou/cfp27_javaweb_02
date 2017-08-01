package pruebas;

import entidades.Aviso;

/**
 * <pre>
 *  TODO: Clases
 *  TODO: Objetos e Instancias
 *  TODO: atributos
 *  TODO: metodos
 *  TODO: public, privado
 *  TODO: Herencia
 *  TODO: Interfaces
 *  TODO: Excepciones
 *  TODO: JDBC, SQL, Base de Datos, conectar
 *  TODO: Agregacion
 *  TODO: Composicion
 *  TODO: HTTPServlet, web
 *  TODO: JSON
 *  TODO: Ajax
 *  TODO: Filtros 
 * </pre>
 * 
 * @author educacion
 */
public class TestAviso {
    
    public static void main( String [] args){
        System.out.println("Test Aviso: [..]");
        
        Aviso campera = new Aviso();
        campera.titulo = "Campera Deportiva";
        campera.precio = 2000;
        
        Aviso pantalon = new Aviso();
        pantalon.titulo = "Pantalon Dry Fit";
        pantalon.precio = 1000;
        
        System.out.println( campera );
        System.out.println( pantalon );
        
        System.out.println("Test Aviso: [OK]");
    }
    
}
