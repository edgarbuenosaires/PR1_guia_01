package ejercicio08bis;

public class Persona {
	private String dni;
	private String nombreCompleto;

	public Persona(String dni, String nombreCompleto) {
		this.dni = dni;
		this.nombreCompleto = nombreCompleto;
	}

	public boolean esDni(String dni2) {
		return this.dni.equalsIgnoreCase(dni2);
	}

}
