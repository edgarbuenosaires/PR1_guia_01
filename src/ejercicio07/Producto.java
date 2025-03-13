package ejercicio07;

public class Producto {
	private String nomProducto;
	private double precioUnitario;
	private int cantEnStock;

	public Producto(String nomProducto, double precioUnitario, int cantEnStock) {
		super();
		this.nomProducto = nomProducto;
		this.precioUnitario = precioUnitario;
		this.cantEnStock = cantEnStock;
	}

	public String getNomProducto() {
		return nomProducto;
	}

	public boolean stockMayorA(int valor) {
		return this.cantEnStock >= valor;
	}

	public void reducirStock(int valor) {
		if (valor <= cantEnStock)
			cantEnStock -= valor;
	}

	@Override
	public String toString() {
		return "Producto [nomProducto=" + nomProducto + ", precioUnitario=" + precioUnitario + ", cantEnStock="
				+ cantEnStock + "]";
	}

}
