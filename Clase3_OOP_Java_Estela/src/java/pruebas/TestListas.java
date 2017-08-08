package pruebas;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author educacion
 */
public class TestListas {

    public static void main(String[] args) {
        System.out.println("pruebas.TestListas.main() [..]");
        ArrayList<String> listita = new ArrayList();
        listita.add("Hawai");
        listita.add("CanCum");
        listita.add("Mimamy");
        listita.add("Bariloche");
        listita.add("Fiji");
        listita.add("Mar del Plata");
        listita.add("La Cumbresita");
        listita.add("Mar de ajo");

        System.out.println(listita);

        for (int indice = 0; indice < listita.size(); indice++) {
            System.out.print(" :: " + indice + ":" + listita.get(indice));
        }
        System.out.println();
        Iterator<String> recorriendo = listita.iterator();
        while (recorriendo.hasNext()) {
            System.out.println(" >> " + recorriendo.next());
            Iterator<String> reco = listita.iterator();
            while (reco.hasNext()) {
                System.out.println("    *** " + reco.next());
            }
        }
        System.out.println();
        System.out.println("pruebas.TestListas.main() [OK]");
    }
}
