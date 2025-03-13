package ejercicio07;

import java.util.ArrayList;

public class Portal {
	ArrayList<Cliente> clientes;
	ArrayList<Producto> productos;

	public Portal() {
		super();
		this.clientes = new ArrayList<Cliente>();
		this.productos = new ArrayList<Producto>();
	}

	public ArrayList<Producto> procesarPedido(Cliente elCliente) {
		ArrayList<Producto> productosFaltantes = new ArrayList<>();
		Pedido elPedido = elCliente.getPedidoPendiente();
		for (Item i : elPedido.obtenerItems()) {
			if (!hayStock(i.getNombreProducto(), i.getCantidadPedida())) {
				productosFaltantes.add(new Producto(i.getNombreProducto(), 0, 0));
				elPedido.remover(i);
			}
		}
		elCliente.confirmarPedido();
		return productosFaltantes;
	}

	private boolean hayStock(String nomProducto, int cantidadSolicitada) {
		Producto elProducto = buscarProducto(nomProducto);
		return elProducto != null && elProducto.stockMayorA(cantidadSolicitada);
	}

	private Producto buscarProducto(String nomProducto) {
		int i = 0;
		Producto productoBuscado = null;
		while (i < productos.size() && productoBuscado == null) {
			if (productos.get(i).getNomProducto().equalsIgnoreCase(nomProducto))
				productoBuscado = productos.get(i);
			i++;
		}
		return productoBuscado;
	}
}
