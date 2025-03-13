package ejercicio07;

public class Item {
	private Producto producto;
	private int cantidadPedida;

	public Item(Producto producto, int cantidadPedida) {
		super();
		this.producto = producto;
		this.cantidadPedida = cantidadPedida;
	}

	public String getNombreProducto() {
		return this.producto.getNomProducto();
	}

	public int getCantidadPedida() {
		return cantidadPedida;
	}

	public void descontarCantidadPedida() {
		this.producto.reducirStock(cantidadPedida);

	}

}
