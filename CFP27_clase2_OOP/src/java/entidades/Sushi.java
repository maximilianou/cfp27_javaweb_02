/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author educacion
 */
public class Sushi {
    public String nombre;
    
    /** La cantidad de piezas Esta acotada por el tipo de dato
     * <a href='https://docs.oracle.com/javase/7/docs/api/java/lang/Byte.html'>
     * Tipo de dato Byte
     * </a>
     */
    public byte cantidaPiezas;
    short coloreo;
    int stock;
    long cantdadDeGranosdeArroz;
    
    /** El precio se rige por la definicion de Float
     * <a href='https://docs.oracle.com/javase/7/docs/api/java/lang/Float.html'>
     * Tipo de dato Float
     * </a>
     */
    public float precio;
    double cantidadMateriaGrasa;
    
    boolean frio;
    char presentacion;
}
