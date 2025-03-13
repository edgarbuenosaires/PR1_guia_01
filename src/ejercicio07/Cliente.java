package ejercicio07;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private String email;
	private String telefono;
	private ArrayList<Pedido> historialDePedidos;

	public Pedido getPedidoPendiente() {
		// provisto por la catedra.
		return null;
	}

	public void confirmarPedido() {
		Pedido elPedido = buscarElPedido();
		if (elPedido != null) {
			elPedido.descontarCantidadPedida();
			elPedido.pasaAConfirmado();
		}
	}

	private Pedido buscarElPedido() {
		int i = 0;
		Pedido elPedido = null;
		while (i < historialDePedidos.size() && elPedido == null) {
			if (historialDePedidos.get(i).getEstado() == Estado.PENDIENTE)
				elPedido = historialDePedidos.get(i);
			i++;
		}
		return elPedido;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", email=" + email
				+ ", telefono=" + telefono + "]";
	}

}
