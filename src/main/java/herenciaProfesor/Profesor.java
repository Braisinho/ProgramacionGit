package herenciaProfesor;

public abstract class Profesor extends Persona{

    private String idProfesor;
    private float nomina;

    public Profesor(String nombre) {
        super(nombre);
    }

    abstract float calcularNomina();

}
