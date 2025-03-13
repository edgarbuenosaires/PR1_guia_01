package ejercicio07;

import java.util.ArrayList;

public class Pedido {
	private String fecha;
	private String hora;
	private Estado estado;
	private ArrayList<Item> items;

	public ArrayList<Item> obtenerItems() {
		ArrayList<Item> itemsPedidos = new ArrayList<Item>();
		for (Item item : items) {
			itemsPedidos.add(item);
		}
		return itemsPedidos;
	}

	public void pasaAConfirmado() {
		this.estado = Estado.CONFIRMADO;
	}

	public void remover(Item i) {
		this.items.remove(i);
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void descontarCantidadPedida() {
		for (Item item : items) {
			item.descontarCantidadPedida();
		}
	}

	@Override
	public String toString() {
		return "Pedido [fecha=" + fecha + ", hora=" + hora + ", estado=" + estado + "]";
	}

}
