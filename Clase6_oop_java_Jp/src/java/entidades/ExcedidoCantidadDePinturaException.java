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
public class ExcedidoCantidadDePinturaException extends Exception {//extends RuntimeException {

    public ExcedidoCantidadDePinturaException(String mensaje) {
        super(mensaje);
    }
    
}
