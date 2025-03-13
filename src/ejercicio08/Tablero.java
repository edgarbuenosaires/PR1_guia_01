package ejercicio08;

import java.util.ArrayList;

public class Tablero {
	private ArrayList<Llave> llaveDeEstacionados;

	public Llave devolverLlave(String patente) {
		// provisto por la catedra
		return null;
	}

	public boolean agregarLlave(Llave llave) {
		return this.llaveDeEstacionados.add(llave);
	}

	public boolean estaLaLlave(String patente) {
		int i = 0;
		boolean estaLaLlave = false;
		while (i < llaveDeEstacionados.size() && !estaLaLlave) {
			estaLaLlave = (llaveDeEstacionados.get(i).getPatente().equalsIgnoreCase(patente));
			i++;
		}
		return estaLaLlave;
	}
}
