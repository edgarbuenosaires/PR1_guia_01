package ejercicio10;

import java.util.ArrayList;

public class Juego {
	private String nombreJuego;
	private ArrayList<Mesa> mesasAsignadas;

	public Juego(String nombreJuego) {
		super();
		this.nombreJuego = nombreJuego;
		this.mesasAsignadas = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombreJuego;
	}

	public int getDisponibilidad() {
		int disponibilidad = 0;
		for (Mesa mesa : mesasAsignadas) {
			disponibilidad += mesa.getDisponibilidad();
		}
		return disponibilidad;
	}

	public boolean asignar(Participante jugador) {
		boolean asignacionOk = false;
		int pos = 0;
		while (pos < mesasAsignadas.size() && !asignacionOk) {
			if (mesasAsignadas.get(pos).getDisponibilidad() > 0) {
				asignacionOk = mesasAsignadas.get(pos).asignar(jugador);
			}
			pos++;
		}
		return asignacionOk;
	}

	public boolean agregarMesa(Mesa m) {
		return mesasAsignadas.add(m);
	}

	public void generarCartas() {
		for (Mesa mesa : mesasAsignadas) {
			mesa.generarCartas();
		}

	}

	public void repartirCartas() {
		for (Mesa mesa : mesasAsignadas) {
			mesa.repartirCartas();
		}

	}

}
