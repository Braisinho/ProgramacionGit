package escrituraFicheiro;


import java.io.Serializable;
import java.util.Collection;
import java.util.Hashtable;

public class Pelirrojo implements Serializable {

    //Transient se aplica a una tributo de una clase que implementa serializable para que este no se incluya en el fichero.

    private int inteligencia;
    private transient String nombre ;
    private double altura ;

    public Pelirrojo(int inteligencia, String nombre, double altura){
        this.inteligencia = inteligencia;
        this.altura = altura;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pelirrojo{" +
                "inteligencia=" + inteligencia +
                ", nombre='" + nombre + '\'' +
                ", altura=" + altura +
                '}';
    }


}
