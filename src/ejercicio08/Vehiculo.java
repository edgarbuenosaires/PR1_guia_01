package ejercicio08;

import java.util.ArrayList;

public class Vehiculo {
	private String patente;
	private Llave llave;
	private boolean tieneLaLlavePuesta;
	private ArrayList<Persona> personasAutorizadas;

	public int getMesesAdeudados() {
		// dado por la catedra
		return 0;
	}

	public Llave retirarLlave() {
		this.tieneLaLlavePuesta = false;
		return this.llave;
	}

	public String getPatente() {
		return patente;
	}

	public boolean esPersonaAutorizada(String dni) {
		boolean esAutorizado = false;
		int i = 0;
		while (i < personasAutorizadas.size() && esAutorizado == false) {
			esAutorizado = personasAutorizadas.get(i).getDni().equalsIgnoreCase(dni);
			i++;
		}
		return esAutorizado;
	}

	public boolean isTieneLaLlavePuesta() {
		return tieneLaLlavePuesta;
	}

}
