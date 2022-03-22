package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Sets {

    //La comprobacion lo hace en base al hashCode
    public static void main(String args[ ]){
        HashSet<String> lista = new HashSet<String>();
        lista.add("Lunes");
        lista.add("Martes");
        lista.add("Miércoles");
        lista.add("Jueves");
        lista.add("Viernes");
        lista.add("Sábado");
        lista.add("Sábado");
        lista.add("Domingo");
        System.out.print("La semana \"desordenada ");
        System.out.println("y sin repeticiones\"");
        Iterator<String> i = lista.iterator();
        while(i.hasNext()) {
            System.out.print(i.next().toString() + " ");
        }
        System.out.println();

        HashSet<Edificio> listaEdificios = new HashSet<Edificio>();

        listaEdificios.add(new Edificio("Villa Perez", 14));
        listaEdificios.add(new Edificio("Villa Perez", 34));
        Iterator<Edificio> j = listaEdificios.iterator();
        while(j.hasNext()) {
            System.out.print(j.next().toString() + " ");
        }



    }
}
