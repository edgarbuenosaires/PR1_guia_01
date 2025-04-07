package ejercicio10;

import java.util.ArrayList;

public class Mesa {
	private static final int CARTAS_A_REPARTIR = 4;
	private static final int MIN_CANT_JUGADORES = 2;
	private static final int CARTAS_POR_PALO = 12;
	private int numeroMesa;
	private int cantMaximaDeParticipantes;
	private ArrayList<Participante> jugadores;
	private ArrayList<Carta> mazo;

	public Mesa(int numeroMesa, int cantMaximaDeParticipantes) {
		super();
		this.numeroMesa = numeroMesa;
		this.cantMaximaDeParticipantes = cantMaximaDeParticipantes;
		this.jugadores = new ArrayList<>();
		this.mazo = new ArrayList<>();
	}

	public boolean repartirCartas() {
		boolean realizado = false;

		if (jugadores.size() >= MIN_CANT_JUGADORES && mazo.size() >= (jugadores.size() * CARTAS_A_REPARTIR)) {
			for (int i = 0; i < CARTAS_A_REPARTIR; i++) {
				for (int j = 0; j < jugadores.size(); j++) {
					jugadores.get(j).recibeCarta(mazo.remove(i));
				}
			}
			realizado = true;
		}
		System.out.println("La cantidad de jugadores es " + jugadores.size() + " " + realizado);
		return realizado;
	}

	public int getDisponibilidad() {
		return cantMaximaDeParticipantes - jugadores.size();
	}

	public boolean asignar(Participante jugador) {
		return jugadores.add(jugador);
	}

	public void generarCartas() {
		for (int i = 0; i < Palo.values().length; i++) {
			for (int j = 0; j < CARTAS_POR_PALO; j++) {
				Carta c = new Carta(Palo.values()[i], j + 1);
				mazo.add(c);
			}
		}
		System.out.println("CARTAS GENERADAS. Mesa " + numeroMesa);
	}
}
