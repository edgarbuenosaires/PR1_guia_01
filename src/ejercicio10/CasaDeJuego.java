package ejercicio10;

import java.util.ArrayList;

public class CasaDeJuego {
	private ArrayList<Juego> juegos;

	public CasaDeJuego() {
		super();
		this.juegos = new ArrayList<>();
	}

	public Resultado acomodarJugador(String nombre, int edad, String nomJuego) {
		Resultado resultado = null;
		Juego juegoBuscado = buscarJuego(nomJuego);
		Participante jugador = new Participante(nombre, edad);

		if (juegoBuscado != null) {
			if (juegoBuscado.getDisponibilidad() > 0) {
				juegoBuscado.asignar(jugador);
				resultado = Resultado.ASIGNACION_OK;
			} else {
				resultado = Resultado.SIN_DISPONIBILIDAD;
			}

		} else {
			resultado = Resultado.JUEGO_NO_ENCONTRADO;
		}
		return resultado;
	}

	private Juego buscarJuego(String nomJuego) {
		Juego juego = null;
		int pos = 0;
		while (pos < this.juegos.size() && juego == null) {
			if (juegos.get(pos).getNombre().equalsIgnoreCase(nomJuego)) {
				juego = juegos.get(pos);
			}
			pos++;
		}
		return juego;
	}

	public ArrayList<DisponibilidadJuegos> obtenerDisponibilidadJuegos() {
		ArrayList<DisponibilidadJuegos> informe = new ArrayList<>();
		for (Juego juego : juegos) {
			DisponibilidadJuegos disponibilidad = new DisponibilidadJuegos(juego.getNombre(),
					juego.getDisponibilidad());
			informe.add(disponibilidad);
		}
		return informe;

	}

	public boolean agregarJuego(Juego j) {
		return juegos.add(j);
	}

	public void generarCartas() {
		for (Juego juego : juegos) {
			juego.generarCartas();
		}

	}

	public void repartirCartas() {
		for (Juego juego : juegos) {
			juego.repartirCartas();
		}
	}
}
