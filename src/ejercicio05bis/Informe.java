package ejercicio05bis;

public class Informe {
	private int nroMesa;
	private int nroOrdenPersona;
	private String dni;
	private String nombre;
	private String apellido;

	public Informe(int nroMesa, int nroOrdenPersona, String dni, String nombre, String apellido) {
		super();
		this.nroMesa = nroMesa;
		this.nroOrdenPersona = nroOrdenPersona;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "N. de mesa: " + nroMesa + ", Orden: " + nroOrdenPersona + ", DNI: " + dni + ", Nombre: " + nombre
				+ ", Apellido: " + apellido + ".\n";
	}

}
