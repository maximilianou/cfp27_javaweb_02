package pruebas;
import entidades.Aviso;
/**
 * @author educacion
 */
public class TestAviso {
        /** <pre> Suma binria, comportamiento con signo
        1000 0000 0000 0000
        1000 0000 0000 0001
        ....
        1111 1111 1111 1111 // -1 decimal
        0000 0000 0000 0000 // 0 decimal 
        0000 0000 0000 0001 // 1 decimal
        0000 0000 0000 0010 // 2 decimal
        0000 0000 0000 0011 // 3 decimal
        0000 0000 0000 0100 // 4 decimal
        ...
        0111 1111 1111 1111
        </pre>
        */
    public static void main(String [] args){
        System.out.println("Test Aviso, Tipos Basicos de Datos[..]");
        Aviso zira = new Aviso();
        Aviso malbec = new Aviso();
        zira.stock = Integer.MAX_VALUE;
        System.out.println(" el estock masimo :" + zira.stock);
        zira.stock++; // Quiero ver que pasa, si sumo al maximo
        System.out.println(" el estock masimo :" + zira.stock);
        System.out.println(" menor entero :" + Integer.MIN_VALUE);
        
        System.out.println("Test Aviso, Tipos Basicos de Datos[OK]");
        System.out.println("Test Aviso, Tipos Basicos de Datos[OK]");
    }
    
}

