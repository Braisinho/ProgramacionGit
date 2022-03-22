package linkedList;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> listaLinked = new LinkedList<Integer>();

        ArrayList<Integer> listaArray = new ArrayList<Integer>();


        //Rellenamos la Linked


        double inicio = System.currentTimeMillis();

        rellenarLista(listaLinked);

        double fin = System.currentTimeMillis();

        System.out.println(fin-inicio);


        //Rellenamos el ArrayList


        inicio = System.currentTimeMillis();

        rellenarLista(listaArray);

        fin = System.currentTimeMillis();

        System.out.println(fin-inicio);


        //Preparamos la suma transversal


        System.out.println("Suma");
        inicio = System.currentTimeMillis();

        sumaTransversal(listaLinked);

        fin = System.currentTimeMillis();

        System.out.println(fin-inicio);

        inicio = System.currentTimeMillis();

        sumaTransversal(listaArray);

        fin = System.currentTimeMillis();

        System.out.println(fin-inicio);


        //Preparamos la suma con Iterator


        System.out.println("Iterator");
        inicio = System.currentTimeMillis();

        sumaIteracion(listaLinked);

        fin = System.currentTimeMillis();

        System.out.println(fin-inicio);

        inicio = System.currentTimeMillis();

        sumaIteracion(listaArray);

        fin = System.currentTimeMillis();

        System.out.println(fin-inicio);


        //Comparamos el tiempo


        System.out.println("Eliminamos la primera posicion");
        inicio = System.currentTimeMillis();

        elimiarPrimerElemento(listaLinked);

        fin = System.currentTimeMillis();

        System.out.println(fin-inicio);

        inicio = System.currentTimeMillis();

        elimiarPrimerElemento(listaArray);

        fin = System.currentTimeMillis();

        System.out.println(fin-inicio);

        rellenarLista(listaArray);
        rellenarLista(listaLinked);

        System.out.println("Eliminamos la posicion del medio");
        inicio = System.currentTimeMillis();

        eliminarCenrto(listaLinked);

        fin = System.currentTimeMillis();

        System.out.println(fin-inicio);

        inicio = System.currentTimeMillis();

        eliminarCenrto(listaArray);

        fin = System.currentTimeMillis();

        System.out.println(fin-inicio);


    }


    public static void rellenarLista(List<Integer> lista){
        for (int i = 0; i<1000000; i++){
            lista.add(i);
        }
    }


    public static int sumaTransversal(List<Integer> lista){
        int suma = 0;
        for (Integer integer : lista) {
            suma += integer;
        }
        return suma;
    }


    public static int sumaIteracion(List<Integer> lista){
        int suma =0;
        Iterator<Integer> i = lista.iterator();
        while(i.hasNext()){
            suma = suma + i.next();
        }
        return suma;
    }


    public static void elimiarPrimerElemento(List<Integer> lista){
        while(lista.size()>0){
            lista.remove(0);
        }
    }


    public static void eliminarCenrto(List<Integer> lista){
        while(lista.size()>0){
            lista.remove(lista.size()/2);
        }
    }


    public static void elimicarUltimo(List<Integer> lista){
        while(lista.size()>0){
            lista.remove(lista.size()-1);
        }
    }

}

























