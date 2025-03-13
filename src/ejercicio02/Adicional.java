package ejercicio02;

public class Adicional {
	private TipoAdicional tipo;
	private double precio;
	private String fecha;

	public Adicional(TipoAdicional tipo, double precio, String fecha) {
		super();
		this.tipo = tipo;
		this.precio = precio;
		this.fecha = fecha;
	}

	public double getPrecio() {
		return precio;
	}

}
