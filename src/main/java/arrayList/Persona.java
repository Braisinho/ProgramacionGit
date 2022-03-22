package arrayList;

import java.util.Objects;

public class Persona implements Comparable{

    private int dni;
    private int edad;
    private String apellidos;
    private String nombre;

    public Persona() {
    }

    public Persona(int dni) {
        this.dni = dni;
    }

    public Persona(int dni, int edad, String apellidos, String nombre) {
        this.dni = dni;
        this.edad = edad;
        this.apellidos = apellidos;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    @Override
    public String toString() {
        return this.nombre + this.apellidos + " con DNI: " + this.dni + " y con edad: " +this.edad;
    }

    @Override
    public int compareTo(Object o){
        Persona persona = (Persona) o;
        return Integer.compare(this.dni, persona.dni);
    }

}













































