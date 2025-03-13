package ejercicio05;

import java.util.ArrayList;

public class Escuela {
	private String nombre;
	private Domicilio domicilio;
	private ArrayList<Mesa> mesasDeVotacion;

	public Escuela(String nombre, Domicilio domicilio) {
		super();
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.mesasDeVotacion = new ArrayList<Mesa>();
	}

	public void designarPresidenteDeMesa(Mesa mesa, Persona persona) {
		removerDeOtraMesa(persona);
		mesa.designarPresidente(persona);

	}

	private void removerDeOtraMesa(Persona persona) {
		for (Mesa m : mesasDeVotacion) {
			m.removerVotante(persona);
		}
	}

	public ArrayList<Informe> obtenerInforme() {
		ArrayList<Informe> informes = new ArrayList<Informe>();
		for (Mesa m : mesasDeVotacion) {
			m.generarInforme(informes);
		}
		return informes;
	}

	@Override
	public String toString() {
		return "Escuela [nombre=" + nombre + ", domicilio=" + domicilio + ", mesasDeVotacion=" + mesasDeVotacion + "]";
	}

}
