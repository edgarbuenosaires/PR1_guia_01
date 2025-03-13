package ejercicio10;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Juego> juegos;

	public Empresa() {
		super();
		this.juegos = new ArrayList<Juego>();
	}

	public ArrayList<JuegoConDisponibilidad> obtenerDisponibilidadJuegos() {
		ArrayList<JuegoConDisponibilidad> jcd = new ArrayList<JuegoConDisponibilidad>();
		for (Juego j : juegos) {
			if (j.lugaresDisponibles() > 0) {
				JuegoConDisponibilidad elJuego = new JuegoConDisponibilidad(j.getNombre(), j.lugaresDisponibles());
				jcd.add(elJuego);
			}
		}
		return jcd;
	}

	public Resultado acomodarJugador(String nomJugador, int edad, String nomJuego) {
		Resultado resultado = null;
		Juego j = buscarJuego(nomJuego);
		if (j != null) {
			resultado = j.agregarloAMesaConMasJugadores(nomJugador, edad);
		} else {
			resultado = Resultado.JUEGO_NO_ENCONTRADO;
		}
		return resultado;
	}

	private Juego buscarJuego(String nomJuego) {
		Juego buscado = null;
		int i = 0;
		while (i < juegos.size() && buscado == null) {
			if (juegos.get(i).getNombre().equalsIgnoreCase(nomJuego))
				buscado = juegos.get(i);
			i++;
		}
		return buscado;
	}

}
