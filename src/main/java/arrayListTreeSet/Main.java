package arrayListTreeSet;

import java.util.ArrayList;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {

        //Introducimos en un ArrayList valores aleatorios
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i< 20; i++){
            arr.add((int)(Math.random()*10+1));
        }

        System.out.println(arr);

        //El TreeSet ordena una coleccion de forma natural o con un comparator y no tiene datos repetidos
        TreeSet<Integer> tre = new TreeSet<>(arr);

        System.out.println(tre);

        //Creamos un conjunto con solo los elementos repetidos
        TreeSet<Integer> numerosRepetidos = new TreeSet<>();
        for(Integer o : arr){
            //Si no coincide el primer y último index es que están repetidas
            if(arr.indexOf(o) != arr.lastIndexOf(o)) numerosRepetidos.add(o);

        }

        System.out.println(numerosRepetidos);

        TreeSet<Integer> numerosNoRepetidos = new TreeSet<>();
        for(Integer o : arr){
            //Si coincide el primer y último index es que no están repetidas
            if(arr.indexOf(o) == arr.lastIndexOf(o)) numerosNoRepetidos.add(o);
        }
        System.out.println(numerosNoRepetidos);


    }
}
