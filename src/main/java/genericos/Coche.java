package genericos;

import java.util.Objects;

public class Coche {

    private String matricula;
    private String marca;
    private String modelo;
    private int year;
    private String color;

    public Coche(String matricula, String marca, String modelo, int year, String color) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof Coche) ) return false;
        Coche coche = (Coche) o;
        return Objects.equals(matricula, coche.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula;
    }
}
