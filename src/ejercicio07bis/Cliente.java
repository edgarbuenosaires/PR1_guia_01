package ejercicio07bis;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String apellido;
	private String dirección;
	private String email;
	private String telefono;
	private ArrayList<Pedido> historialDePedidos;

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

	public boolean confirmarPedido() {

		return false;
	}
}
