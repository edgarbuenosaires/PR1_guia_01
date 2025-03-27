package ejercicio08bis;

import java.util.ArrayList;

public class Vehiculo {
	private String patente;
	private Llave llave;
	private ArrayList<Persona> autorizadosParaRetirar;

	public Vehiculo(String patente, Llave llave) {
		this.patente = patente;
		this.llave = llave;
		this.autorizadosParaRetirar = new ArrayList<>();
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

	public boolean tieneAutorizadoA(String dni) {
		Persona persona = buscarPersonaPorDni(dni);
		return persona != null;
	}

	private Persona buscarPersonaPorDni(String dni) {
		Persona persona = null;
		int pos = 0;

		while (pos < autorizadosParaRetirar.size() && persona == null) {
			if (autorizadosParaRetirar.get(pos).esDni(dni)) {
				persona = autorizadosParaRetirar.get(pos);
			}
			pos++;
		}
		return null;
	}
}
