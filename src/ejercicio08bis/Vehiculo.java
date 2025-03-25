package ejercicio08bis;

import java.util.ArrayList;

public class Vehiculo {
	private String patente;
	private Llave llave;
	private ArrayList<Persona> personasAutorizParaRetirarlo;

	public Vehiculo(String patente, Llave llave) {
		this.patente = patente;
		this.llave = llave;
		this.personasAutorizParaRetirarlo = new ArrayList<>();
	}

	public int getMesesAdeudados() {
		return 3;
	}

	public Llave retirarLlave() {
		Llave temp = this.llave;
		this.llave = null;
		return temp;
	}

	public boolean esPatente(String pate) {
		return this.patente.equalsIgnoreCase(pate);
	}
}
