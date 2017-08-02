package entidades;

/**
 *
 * @author educacion
 */
public class Aviso {
    // Atributos
    String titulo; // Objeto, no es tipo basico
    float precio; // punto flotante de 32 bits
    /**  
     * <a href='https://docs.oracle.com/javase/7/docs/api/java/lang/Double.html'>
     * Info del Double
     * </a>
     */
    public double graduacionAlcoholica; // punto flotante de 64 bits
    byte presentcion; // Entero 8 bits
    short color; // Entero 16 bits

    /**  
     * <a href='https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html'>
     * Info del Integer
     * </a>
     */
    public  int stock; // Entero 32 bits
    /** TODO: Veremos Pasaje por valor o psje por Referencia */
    public  Integer stockObjeto; // Entero 32 bits
    long unidadesVendidas; // Entero 64 bits
    boolean tinto; // true o false
    /** Categorias son acotads a una letra */
    char categoriaCalidad;
}
