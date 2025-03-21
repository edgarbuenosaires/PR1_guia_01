package ejercicio07bis;

public class Producto {
	private String nombre;
	private double precioUnitario;
	private int cantEnSock;

	public Producto(String nombre, double precioUnitario, int cantEnSock) {
		super();
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.cantEnSock = cantEnSock;
	}

	public void reducirCantidad(int cantidad) {
		this.cantEnSock = cantEnSock - cantidad;

	}

	public String getNomProducto() {
		return this.nombre;
	}

	public boolean verificarStock(int cantidad) {
		return this.cantEnSock >= cantidad;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioUnitario=" + precioUnitario + ", cantEnSock=" + cantEnSock + "]";
	}

	
}
