package pruebas;

import entidades.Receta;

/**
 *
 * @author educacion
 */
public class TestValorReferencia {
    public static void main(String[] args) {
        System.out.println("pruebas.TestValorReferencia.main() [..]");
        float elvalor = 33.33f;
        Float elvalor2 = 77.77f;
        String valor3 = "Mas Valor ";
        Receta porReferencia = new Receta();
        porReferencia.nombre = " Facturas ";
       
        System.out.println(" valor = " + elvalor);
        System.out.println(" valor2   = " + elvalor2);
        System.out.println(" valor3   = " + valor3);
        System.out.println(" referencia receta   = " + porReferencia.nombre);
       
        cambiar(elvalor);
        cambiarF(elvalor2);
        cambiarS(valor3);
        cambiarReceta(porReferencia);
        
        System.out.println(" valor = " + elvalor);
        System.out.println(" valor2   = " + elvalor2);
        System.out.println(" valor3   = " + valor3);
        System.out.println(" referencia receta   = " + porReferencia.nombre);
        
        System.out.println("pruebas.TestValorReferencia.main() [OK]");
    }
    public static void cambiar(float uno ){
        uno++;
        System.out.println("      vv =" + uno);        
    }
    public static void cambiarF(Float uno ){
        uno++;
        System.out.println("      FF =" + uno);        
    }
    public static void cambiarS(String uno ){
        uno = uno + " CAMBIANDO EL VALOR ";
        System.out.println("      S  =" + uno);        
    }
    public static void cambiarReceta(Receta uno ){
        uno.nombre = uno.nombre + " CAMBIANDO EL VALOR ";
        System.out.println("      S  =" + uno);        
    }
    
}
