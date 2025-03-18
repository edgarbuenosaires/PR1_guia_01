package ejercicio07bis;

import java.util.ArrayList;

public class Portal {
	private ArrayList<Cliente> clientes;
	private static ArrayList<Producto> productos;

	public Portal() {
		super();
		productos = new ArrayList<>();
		clientes = new ArrayList<>();
	}

	public boolean agregarCliente(Cliente c) {
		return clientes.add(c);
	}

	public boolean agregarProducto(Producto p) {
		return productos.add(p);
	}

	public ArrayList<Producto> procesarPedido(Cliente c) {
		ArrayList<Producto> prodFaltantes = new ArrayList<>();
		Pedido p = c.getPedidoPendiente();
		
		for (Item i : p.getItemsPedidos()) {
			if (verificarStock(i.getNomProducto(), i.getCantidad())) {
				c.confirmarPedido();
			} else {
				Producto producFaltante = new Producto(i.getNomProducto(), 0, i.getCantidad());
				prodFaltantes.add(producFaltante);
				p.removerItem(i);
			}
		}
		return prodFaltantes;
	}

	public static void reducirStock(String nomProd, int cant) {
		Producto pro = buscarProducto(nomProd);
		if (pro != null) {
			pro.reducirCantidad(cant);
		}
	}

	private boolean verificarStock(String nomProducto, int cantidad) {
		Producto prod = buscarProducto(nomProducto);
		boolean hayStock = false;

		if (prod != null) {
			hayStock = prod.verificarStock(cantidad);
		}

		return hayStock;
	}

	private static Producto buscarProducto(String nomProd) {
		Producto pro = null;
		int pos = 0;
		while (pos < productos.size() && pro == null) {
			if (productos.get(pos).getNomProducto().equalsIgnoreCase(nomProd)) {
				pro = productos.get(pos);

			} else {
				pos++;
			}
		}
		return pro;
	}

}
