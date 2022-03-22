package collection;


import java.util.ArrayList;
import java.util.Iterator;

public class Collections {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        ArrayList<String> cars2 = new ArrayList<>();
        cars.add("Volvo");
        cars.add("Ferrari");
        cars.add("Megane");
        cars.add("Alfa");
        cars.add("Citroen");
        System.out.println(cars);
        borrarPares(cars);
        System.out.println(cars2);
        System.out.println();

        ArrayList<Edificio> edificios = new ArrayList<>();

        Edificio casa = new Edificio("Casa", 12);

        edificios.add(new Edificio("Casa", 10));
        edificios.add(new Edificio("Casa", 15));
        edificios.add(new Edificio("Hogar", 20));
        edificios.add(casa);


        System.out.println(edificios.contains(new Edificio("Casa", 10)));
        System.out.println(edificios.contains(new Edificio("Casa", 15)));
        System.out.println(edificios.contains(new Edificio("Caso", 10)));
        System.out.println(edificios.contains(casa));




    }


    public static void borrarPares(ArrayList<String> l){
        Iterator<String> it = l.iterator();
        while (it.hasNext()){
            String s = it.next();
            it.remove();
        }
    }

}
