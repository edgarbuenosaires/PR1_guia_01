package ejercicio07bis;

import java.util.ArrayList;

public class Pedido {
	private String fecha;
	private String hora;
	private Estado estado;
	private ArrayList<Item> itemsPedidos;

	public boolean estaPendiente() {
		return this.estado == Estado.PENDIENTE;
	}

}
