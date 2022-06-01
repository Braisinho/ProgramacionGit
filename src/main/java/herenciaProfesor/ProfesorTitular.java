package herenciaProfesor;

public class ProfesorTitular extends Profesor{


    public ProfesorTitular(String nombre) {
        super(nombre);
    }

    @Override
    float calcularNomina() {
        return 1000;
    }

}
