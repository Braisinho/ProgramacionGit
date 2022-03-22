package comparable;

public class Persona {

    private int dni;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(int dni, int edad, String nombre, String apellido) {
        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
}
