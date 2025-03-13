package ejercicio10;

import java.util.ArrayList;

public class Mesa {
	private static final int NUM_DE_CARTAS = 4;
	private static final int NUM_MIN_JUGADORES = 2;
	private int numero;
	private int cantMaximaDePatricipantes;
	private ArrayList<Participante> participantesJugando;
	private ArrayList<Carta> mazo;

	public Mesa(int numero, int cantMaximaDePatricipantes) {
		super();
		this.numero = numero;
		this.cantMaximaDePatricipantes = cantMaximaDePatricipantes;
		this.participantesJugando = new ArrayList<Participante>();
		this.mazo = new ArrayList<Carta>();
	}

	public int lugaresDisponibles() {
		return cantMaximaDePatricipantes - participantesJugando.size();
	}

	public boolean agregarParicipante(Participante p) {
		boolean seAgrego = false;
		if (participantesJugando.size() < cantMaximaDePatricipantes) {
			seAgrego = participantesJugando.add(p);
			System.out.println("Se agrego el participante a la mesa.");
		} else {
			System.out.println("No se pueden agregar mas participantes a la mesa.");
		}
		return seAgrego;
	}

	public boolean repartirCartas() {
		boolean seRepartieron = false;
		if (participantesJugando.size() >= NUM_MIN_JUGADORES
				&& (mazo.size() * NUM_DE_CARTAS) > participantesJugando.size()) {
			for (int i = 0; i < NUM_DE_CARTAS; i++) {
				for (Participante p : participantesJugando) {
					p.tomarCarta(mazoRepartir());
				}
			}
			seRepartieron = true;
		}
		return seRepartieron;
	}

	private Carta mazoRepartir() {
		return this.mazo.remove(0);
	}

	@Override
	public String toString() {
		return "Mesa [numero=" + numero + ", cantMaximaDePatricipantes=" + cantMaximaDePatricipantes + "]";
	}

}
