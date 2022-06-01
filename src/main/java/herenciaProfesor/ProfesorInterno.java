package herenciaProfesor;

public class ProfesorInterno extends Profesor{
    public ProfesorInterno(String nombre) {
        super(nombre);
    }

    @Override
    float calcularNomina() {
        return 800;
    }
}
