package ejercicio07;

public class Item {
	private String nomProducto;
	private int cantidad;
	
	

	public Item(String nomProducto, int cantidad) {
		super();
		this.nomProducto = nomProducto;
		this.cantidad = cantidad;
	}

	public String getNomProducto() {
		return nomProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	@Override
	public String toString() {
		return "Item [nomProducto=" + nomProducto + ", cantidad=" + cantidad + "]";
	}

	
}
