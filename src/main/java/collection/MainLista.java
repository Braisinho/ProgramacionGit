package collection;
import barajaEspañola.Carta;

import java.util.Deque;
import java.util.Stack;
import java.util.Vector;

public class MainLista {

    public static void main(String[] args) {

        Pila pila1 = new Pila();

        Carta a = new Carta(1,"Bastos");
        Carta b = new Carta(2,"Copas");
        Carta c = new Carta(3,"Oros");
        Carta d = new Carta(4,"Espadas");

        pila1.apilar(a);
        pila1.apilar(b);
        pila1.apilar(c);
        pila1.apilar(d);

        System.out.println(pila1.desapilar());
        System.out.println(pila1.cima());


    }
}
