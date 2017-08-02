package ejercicio.pruebas;

import ejercicio.entidades.Comprador;
import ejercicio.entidades.Producto;
import ejercicio.entidades.Vendedor;

/**
 * <pre>
 * Ejercicio:
 * Para hacer una compra necestio un Comprador,, Vendedor, y Producto y recien ahi hago la Compra que los Asoscia
 * TODO: Agregar Atributos a las clases
 * TODO: Generar Compra con Asociacion de Comprador, Vendedor y Producto
 * </pre>
 * @author educacion
 */
public class TestCompra {
 public static void main(String[]args){
     System.out.println("Test Compra [..]");
     Comprador nuevoComprador = new Comprador();
     Vendedor nuevoVendedor = new Vendedor();
     Producto productoActual = new Producto();
     
     
     System.out.println("Test Compra [OK]");
 }   
}
