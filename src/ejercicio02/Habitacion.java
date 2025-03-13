package ejercicio02;

import java.util.ArrayList;

public class Habitacion {
	private int numero;
	private double precio;
	private boolean estaOcupada;
	private Cliente cliente;
	private ArrayList<Adicional> adicionales;

	public Habitacion(int numero, double precio) {
		super();
		this.numero = numero;
		this.precio = precio;
		this.estaOcupada = false;
		this.cliente = null;
		this.adicionales = new ArrayList<>();
	}

	public double calcularTotal() {
		double total = 0;
		if (cliente != null) {
			total += cliente.getDiasDeEstadia() * precio;
			total += calcularPrecioAdicionales();
		}
		return total;
	}

	private double calcularPrecioAdicionales() {
		double totalAdicionales = 0;
		for (Adicional a : adicionales) {
			totalAdicionales += a.getPrecio();
		}
		return totalAdicionales;
	}

	public boolean estaDisponible() {
		return !estaOcupada;
	}

	public boolean sosHabitacion(int numHabitacion) {
		return this.numero == numHabitacion;
	}

	public boolean agregarAdicional(Adicional adi) {
		return this.adicionales.add(adi);
	}

	public void ocupar(Cliente c) {
		this.estaOcupada = true;
		this.cliente = c;
	}

	@Override
	public String toString() {
		return "Habitacion [numero=" + numero + ", precio=" + precio + ", estaOcupada=" + estaOcupada + ", cliente="
				+ cliente + ", adicionales=" + adicionales + "]";
	}

}
