package collection;


import java.util.LinkedList;
import java.util.NoSuchElementException;


public class Pila {
    private LinkedList<Object> pila ;


    public Pila(){
        this.pila = new LinkedList<Object>();
    }


    //Este metodo es igual a Push
    //El metodo add desplaza la posicion existente
    public void apilar(Object e){
        pila.add(0,e);
    }


    //Este metodo es igual a Pop
    public Object desapilar(){
        try {
            return pila.remove();
        }catch (NoSuchElementException e){
            System.out.println("No hay nada que desapilar");
        }
        return null;
    }


    //Este metodo es igual a peek()
    public Object cima(){
        return pila.get(0);
    }


}
