package ejercicio08;

public class Persona {
	private String dni;
	private String nombreCompleto;

	public Persona(String dni, String nombreCompleto) {
		super();
		this.dni = dni;
		this.nombreCompleto = nombreCompleto;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombreCompleto=" + nombreCompleto + "]";
	}

	public String getDni() {
		// TODO Auto-generated method stub
		return this.dni;
	}

}
