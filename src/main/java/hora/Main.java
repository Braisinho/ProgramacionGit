package hora;

public class Main {

    public static void main(String[] args) {

        Hora reloj1 = new Hora(10,25);
        reloj1.inc();
        reloj1.inc();

        System.out.println(reloj1.toString());

        HoraExacta reloj2 = new HoraExacta(15,20,40);
        reloj2.inc();
        reloj2.inc();

        System.out.println(reloj2.toString());

        HoraExacta reloj3 = new HoraExacta(15,25,43);
        HoraExacta c = reloj2;
        c.inc();

        System.out.println(reloj3.equals(reloj2) ? "Iguales" : "Diferentes");


    }
}
