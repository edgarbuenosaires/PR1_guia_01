package ejercicio07;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String apellido;
	private String dirección;
	private String email;
	private String telefono;
	private ArrayList<Pedido> historialDePedidos;

	public Cliente(String nombre, String apellido, String dirección, String email, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dirección = dirección;
		this.email = email;
		this.telefono = telefono;
		this.historialDePedidos = new ArrayList<>();
	}

	public boolean agregarPedido(Pedido p) {
		return historialDePedidos.add(p);
	}

	public Pedido getPedidoPendiente() {
		return buscarPedidoPendiente();
	}

	private Pedido buscarPedidoPendiente() {
		Pedido pedidoPendiente = null;
		int pos = 0;

		while (pos < historialDePedidos.size() && pedidoPendiente == null) {
			if (historialDePedidos.get(pos).estaPendiente()) {
				pedidoPendiente = historialDePedidos.get(pos);
			}
			pos++;
		}
		return pedidoPendiente;
	}

	public void confirmarPedido() {
		Pedido ped = buscarPedidoPendiente();
		Item i = null;
		int pos = 0;

		while (pos < ped.getItemsPedidos().size()) {
			i = ped.getItemsPedidos().get(pos);
			Portal.reducirStock(i.getNomProducto(), i.getCantidad());
			pos++;
		}
		ped.confirmar();
	}

	public void mostrarPedidos() {
		for (Pedido pedido : historialDePedidos) {
			pedido.muestroItemsdelPedido();
		}

	}
}
