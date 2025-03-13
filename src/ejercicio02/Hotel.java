package ejercicio02;

import java.util.ArrayList;

public class Hotel {
	private String nombre;
	private String direccion;
	private ArrayList<Habitacion> habitaciones;

	public Hotel(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.habitaciones = new ArrayList<>();
	}

	public ArrayList<Habitacion> obtenerHabitacionesDisponibles() {
		ArrayList<Habitacion> habitacionesDisponibles = new ArrayList<>();
		for (Habitacion h : habitaciones) {
			if (h.estaDisponible()) {
				habitacionesDisponibles.add(h);
			}
		}
		return habitacionesDisponibles;
	}

	public double realizarCheckout(int numHabitacion) {
		double resultado = -1;
		Habitacion h = buscarHabitacion(numHabitacion);
		if (h != null && !h.estaDisponible()) {
			resultado = h.calcularTotal();
		}
		return resultado;
	}

	private Habitacion buscarHabitacion(int numHabitacion) {
		Habitacion buscada = null;
		int pos = 0;

		while (pos < this.habitaciones.size() && buscada == null) {
			if (habitaciones.get(pos).sosHabitacion(numHabitacion)) {
				buscada = habitaciones.get(pos);
			} else {
				pos++;
			}
		}
		return buscada;
	}

	public boolean agregarHabitacion(Habitacion h) {
		return this.habitaciones.add(h);

	}

}
