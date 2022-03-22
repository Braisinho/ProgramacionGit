package trivial.modelo;

public class Pregunta {

    private String enunciado;
    private String respuesta1;
    private String respuesta2;
    private String respuesta3;
    private int correcta;

    public Pregunta() {
    }

    public Pregunta(String enunciado, String respuesta1, String respuesta2, String respuesta3, int correcta) {
        this.enunciado = enunciado;
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.correcta = correcta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String getRespuesta1() {
        return respuesta1;
    }

    public String getRespuesta2() {
        return respuesta2;
    }

    public String getRespuesta3() {
        return respuesta3;
    }

    public int getCorrecta() {
        return correcta;
    }
}
