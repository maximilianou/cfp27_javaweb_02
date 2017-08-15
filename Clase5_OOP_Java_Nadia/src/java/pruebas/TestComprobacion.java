
package pruebas;

/**
 *
 * @author educacion
 */
public class TestComprobacion {
    public static void main(String[] args) {
        System.out.println("Comprobacion de foto .. [..]");
        //Verificar luz 
        //enfoque
        //encuadre 
        //color
        Foto unaFoto  = new Foto ();
        
        unaFoto.luz = 1;
        unaFoto.enfoque = 15;
        unaFoto.color = 70;
        
        Foto otraFoto  = new Foto ();
        
        otraFoto.luz = -3;
        otraFoto.enfoque = 0;
        otraFoto.color = 30;
        
        ValidadorFoto elvalidador = new ValidadorFoto();
        elvalidador.luminosidad(unaFoto);
        elvalidador.gradoEnfoque(unaFoto);
        elvalidador.nivelColor(unaFoto);
        
         ValidadorFoto elotrovalidador = new ValidadorFoto();
        elotrovalidador.luminosidad(otraFoto);
        elotrovalidador.gradoEnfoque(otraFoto);
        elotrovalidador.nivelColor(otraFoto);
        
        
                
        
        
        
        
        System.out.println("Comprobacion de foto .. [OK]");
        
    }
    
    
    
}
