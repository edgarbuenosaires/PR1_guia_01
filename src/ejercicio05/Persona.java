package ejercicio05;

public class Persona {
	private String nombre;
	private String apellido;
	private String dni;
	private Genero genero;
	private String fechaDeNacimiento;
	private Domicilio domicilio;

	public Persona(String nombre, String apellido, String dni, Genero genero, String fechaDeNacimiento,
			Domicilio domicilio) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.genero = genero;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.domicilio = domicilio;
	}

	public String getDni() {
		return this.dni;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	@Override
	public String toString() {
		return nombre + " " + apellido + " " + dni + " " + genero + " " + fechaDeNacimiento;
	}

}
