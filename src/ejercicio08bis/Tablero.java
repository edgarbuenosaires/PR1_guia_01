package ejercicio08bis;

import java.util.ArrayList;

public class Tablero {
	private ArrayList<Llave> llavesDeVehiculosEstacionados;

	public Tablero() {
		this.llavesDeVehiculosEstacionados = new ArrayList<>();
	}

	public Llave devovlerLlave(String patente) {
		return llavesDeVehiculosEstacionados.remove(buscarPosDeLlave(patente));
	}

	private int buscarPosDeLlave(String patente) {
		int pos = 0;
		boolean encontrada = false;
		while (pos < llavesDeVehiculosEstacionados.size() && !encontrada) {
			encontrada = llavesDeVehiculosEstacionados.get(pos).esPatente(patente);
			pos++;
		}
		return (encontrada) ? pos : null;
	}

	public void agregarLlave(Llave llave) {
		this.llavesDeVehiculosEstacionados.add(llave);

	}
}
