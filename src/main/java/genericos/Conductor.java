package genericos;

import java.util.Date;
import java.util.Objects;

public class Conductor {

    private String dni;
    private String nomnbre;
    private String apellidos;
    private Date fechaCarnetConducir;
    private Date caducidadCarnetConducir;


    public Conductor(String dni, String nomnbre, String apellidos, Date fechaCarnetConducir, Date caducidadCarnetConducir) {
        this.dni = dni;
        this.nomnbre = nomnbre;
        this.apellidos = apellidos;
        this.fechaCarnetConducir = fechaCarnetConducir;
        this.caducidadCarnetConducir = caducidadCarnetConducir;
    }



    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof Conductor) ) return false;
        Conductor conductor = (Conductor) o;
        return Objects.equals(dni, conductor.dni);
    }


    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }




    @Override
    public String toString() {
        return "Conductor{" +
                "dni='" + dni + '\'' +
                '}';
    }
}
