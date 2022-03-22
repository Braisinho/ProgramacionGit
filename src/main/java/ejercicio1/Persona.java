package ejercicio1;

public class Persona implements PuedeCantar {

    @Override
    public void cantar() {
        System.out.println("Do Re Mi Fa Sol La Si Do");
    }
}
