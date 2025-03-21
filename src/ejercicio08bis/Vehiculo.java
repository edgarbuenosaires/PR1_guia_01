package ejercicio08bis;

import java.util.ArrayList;

public class Vehiculo {
	private String patente;
	private Llave llave;
	private ArrayList<Persona> personasAutorizParaRetirarlo;

	public Vehiculo(String patente, Llave llave) {
		super();
		this.patente = patente;
		this.llave = llave;
		this.personasAutorizParaRetirarlo = new ArrayList<>();
	}

	public int getMesesAdeudados() {
		return 3;
	}
}
