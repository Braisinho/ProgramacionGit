package herenciaProfesor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Profesor> profesores = new ArrayList<>();

        ProfesorInterno a = new ProfesorInterno("Elias");
        ProfesorTitular b = new ProfesorTitular("Brais");
        profesores.add(a);
        profesores.add(b);
        System.out.println(profesores);
    }
}
