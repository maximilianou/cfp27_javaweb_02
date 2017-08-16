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
public class LimiteDeCaracteresExcedidos extends  Exception { // RuntimeException {
    // Constructor
    public LimiteDeCaracteresExcedidos(String mensaje) {
        super(mensaje);
    }
    public LimiteDeCaracteresExcedidos() {
    }
    
}
