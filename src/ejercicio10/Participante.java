package ejercicio10;

import java.util.ArrayList;

public class Participante {
	private String nombre;
	private int edad;
	private ArrayList<Carta> cartasEnMano;

	public Participante(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.cartasEnMano = new ArrayList<Carta>();
	}

	public boolean tomarCarta(Carta c) {
		return this.cartasEnMano.add(c);
	}

	@Override
	public String toString() {
		return "Participante [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
