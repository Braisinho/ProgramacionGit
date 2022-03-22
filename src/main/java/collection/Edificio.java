package collection;


import java.util.Objects;

public class Edificio {

    String nombre;
    int tamaño;

    public Edificio(String nombre, int tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof Edificio) ) return false;
        Edificio edificio = (Edificio) o;
        return this.nombre.equals(edificio.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "nombre='" + nombre + '\'' +
                ", tamaño=" + tamaño +
                '}';
    }

}
