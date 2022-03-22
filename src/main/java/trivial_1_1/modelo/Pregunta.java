package trivial_1_1.modelo;

public class Pregunta {
	private String enunciado;
	private String respuesta1;
	private String respuesta2;
	private String respuesta3;
	private int correcta;
	
	public Pregunta(String enunciado, String respuesta1, String respuesta2, String respuesta3, int correcta) {
		super();
		this.enunciado = enunciado;
		this.respuesta1 = respuesta1;
		this.respuesta2 = respuesta2;
		this.respuesta3 = respuesta3;
		this.correcta = correcta;
	}
	
	/**
	 * @return the enunciado
	 */
	public String getEnunciado() {
		return enunciado;
	}
	/**
	 * @param enunciado the enunciado to set
	 */
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	/**
	 * @return the respuesta1
	 */
	public String getRespuesta1() {
		return respuesta1;
	}

	/**
	 * @param respuesta1 the respuesta1 to set
	 */
	public void setRespuesta1(String respuesta1) {
		this.respuesta1 = respuesta1;
	}

	/**
	 * @return the respuesta2
	 */
	public String getRespuesta2() {
		return respuesta2;
	}

	/**
	 * @param respuesta2 the respuesta2 to set
	 */
	public void setRespuesta2(String respuesta2) {
		this.respuesta2 = respuesta2;
	}

	/**
	 * @return the respuesta3
	 */
	public String getRespuesta3() {
		return respuesta3;
	}

	/**
	 * @param respuesta3 the respuesta3 to set
	 */
	public void setRespuesta3(String respuesta3) {
		this.respuesta3 = respuesta3;
	}

	/**
	 * @return the correcta
	 */
	public int getCorrecta() {
		return correcta;
	}
	/**
	 * @param correcta the correcta to set
	 */
	public void setCorrecta(int correcta) {
		this.correcta = correcta;
	}


	
	
	
}
