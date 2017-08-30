package entidades;

import java.util.ArrayList;

public class Producto {

    public String nombre;
    public int cotaMaximaPeso = 30;

    //public static void obtenerListado() {
    public static ArrayList<Producto> obtenerListado() {
        
        Producto alianza = new Producto();
        alianza.nombre = "Alinanza 18 kilates ! ! ";
        Producto fantasia = new Producto();
        fantasia.nombre = "Fantasia Sin Kilates ! ! ";
        Producto rock = new Producto();
        rock.nombre = "Calabera con lengua afuera ! ! ";

        ArrayList<Producto> listado = new ArrayList();
        listado.add(alianza);
        listado.add(fantasia);
        listado.add(rock);

        return listado;
    }
}
