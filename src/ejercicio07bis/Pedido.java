package ejercicio07bis;

import java.util.ArrayList;

public class Pedido {
	private String fecha;
	private String hora;
	private Estado estado;
	private ArrayList<Item> itemsPedidos;

	public Pedido(String fecha, String hora, Estado estado) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.estado = estado;
		this.itemsPedidos = new ArrayList<>();
	}

	public boolean agregarItem(Item i) {
		return itemsPedidos.add(i);
	}

	public boolean estaPendiente() {
		return this.estado == Estado.PENDIENTE;
	}

	public ArrayList<Item> getItemsPedidos() {
		return itemsPedidos;
	}

	public boolean removerItem(Item i) {
		return this.itemsPedidos.remove(i);
	}

	public void confirmar() {
		this.estado = Estado.CONFIRMADO;
	}

}
