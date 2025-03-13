package ejercicio01;

public enum Resultado {
	CURSO_INEX("El curso no existe"), USUARIO_INEX("El usuario no existe"), YA_SUSCRIPTO(
			"El usuario ya esta suscirpto al curso"), ES_AUTOR(
					"El usuario que intenta suscribirse es el autor del curso"), MAX_BECADOS(
							"Cantidad maxima de becados"), SUSCRIPTO_OK(
									"El usuario se sucribio exitosamente al curso.");

	private String texto;

	private Resultado(String t) {
		this.texto = t;
	}

	public String getTexto() {
		return this.texto;
	}
}
