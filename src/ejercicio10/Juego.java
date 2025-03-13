package ejercicio10;

import java.util.ArrayList;

public class Juego {
	private String nombre;
	private ArrayList<Mesa> mesasAsignadas;

	public Juego(String nombre) {
		super();
		this.nombre = nombre;
		this.mesasAsignadas = new ArrayList<Mesa>();
	}

	public int lugaresDisponibles() {
		int acum = 0;
		for (Mesa m : mesasAsignadas) {
			acum += m.lugaresDisponibles();
		}
		return acum;
	}

	public String getNombre() {
		return this.nombre;
	}

	public Resultado agregarloAMesaConMasJugadores(String nomJugador, int edad) {
		Resultado resultado = null;
		Mesa mesa = mesaConMasJugadores();
		if (mesa != null) {
			if (mesa.agregarParicipante(new Participante(nomJugador, edad)))
				resultado = Resultado.ASIGNACION_OK;
		} else {
			resultado = Resultado.SIN_DISPONIBILIDAD;
		}
		return resultado;
	}

	private Mesa mesaConMasJugadores() {
		Mesa buscada = null;
		int numMenorDisponibilidad = Integer.MAX_VALUE;
		for (Mesa m : mesasAsignadas) {
			if (m.lugaresDisponibles() < numMenorDisponibilidad) {
				buscada = m;
				numMenorDisponibilidad = m.lugaresDisponibles();
			}
		}
		return buscada;
	}

}
