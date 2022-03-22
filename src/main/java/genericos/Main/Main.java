package genericos.Main;

import genericos.AlquilerHoy;
import genericos.Coche;
import genericos.Conductor;
import genericos.Dupla;

import java.util.Date;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Dupla<Coche, Conductor>, AlquilerHoy> alquileres = new HashMap<>();
        Coche coche1 = new Coche("8684GKW", "Citroen", "Picaso", 2014, "Blanco");
        Coche coche2 = new Coche("4646FQR", "Ford", "Focus", 2008, "Azul");
        Coche coche3 = new Coche("8684GKW", "Mercedes", "Clase A", 2022, "Morado");

        Conductor conductor1 = new Conductor("46289242V", "Brais", "Ferro", new Date(2018,11,15), new Date(2022,11,15));
        Conductor conductor2 = new Conductor("12345678F", "Juan", "Perez", new Date(2015,10,13), new Date(2022,05,15));
        Conductor conductor3 = new Conductor("46289242V", "Marcelino", "Alvarez", new Date(2018,11,15), new Date(2022,11,15));

        alquileres.put(new Dupla<>(coche1,conductor1), new AlquilerHoy(16, 21, 150000));
        System.out.println(alquileres);
        alquileres.put(new Dupla<>(coche3,conductor2),new AlquilerHoy(14,22,165000));
        System.out.println(alquileres);
        alquileres.put(new Dupla<>(coche3,conductor3), new AlquilerHoy(15,16,150000));
        System.out.println(alquileres);
    }
}
