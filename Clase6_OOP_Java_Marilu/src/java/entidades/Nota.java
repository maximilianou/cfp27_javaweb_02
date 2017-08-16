
package entidades;

/**
 *
 * @author educacion
 */
public class Nota {
    public static int LIMITE_TEXTO = 50;
    private String texto;
    public String getTexto() {
        return texto;
    }
    public void setTexto(String parametroTexto) throws LimiteDeCaracteresExcedidos {
        if( parametroTexto.length() < LIMITE_TEXTO ){
            this.texto = parametroTexto;
        }else{
            throw new LimiteDeCaracteresExcedidos("La cantidad :"
                    + parametroTexto.length() 
                    + " Excede los carateres: "
                    + LIMITE_TEXTO);
        }
    }
    
}
