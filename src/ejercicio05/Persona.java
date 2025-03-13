package ejercicio05;

public class Persona {
	private String nombre;
	private String apellido;
	private String DNI;
	private Genero genero;
	private String fechaNacimiento;
	private Domicilio domicilio;

	public Persona(String nombre, String apellido, String dNI, Genero genero, String fechaNacimiento,
			Domicilio domicilio) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		DNI = dNI;
		this.genero = genero;
		this.fechaNacimiento = fechaNacimiento;
		this.domicilio = domicilio;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", genero=" + genero
				+ ", fechaNacimiento=" + fechaNacimiento + ", domicilio=" + domicilio + "]";
	}

	public Informe generarInforme(int numeroDeMesa, int numeroDeOrden) {
		Informe inf = new Informe(numeroDeMesa, numeroDeOrden, DNI, nombreCompleto());
		return inf;

	}

	private String nombreCompleto() {
		return this.nombre + " " + this.apellido;
	}

}
