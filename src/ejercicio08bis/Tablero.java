package ejercicio08bis;

import java.util.ArrayList;

public class Tablero {
	private ArrayList<Llave> llavesDeVehiculosEstacionados;

	public Tablero() {
		this.llavesDeVehiculosEstacionados = new ArrayList<>();
	}

	public void agregarLlave(Llave llave) {
		this.llavesDeVehiculosEstacionados.add(llave);
	}

	public Llave devovlerLlave(String patente) {
		Llave buscada = null;
		int pos = 0;

		while (pos < llavesDeVehiculosEstacionados.size() && buscada == null) {
			if (llavesDeVehiculosEstacionados.get(pos).esPatente(patente)) {
				buscada = llavesDeVehiculosEstacionados.get(pos);
			}
			pos++;
		}
		llavesDeVehiculosEstacionados.remove(buscada);
		return buscada;

	}

	public boolean estaLlaveDelVehiculoPatante(String patente) {
		int pos = 0;
		boolean encontrada = false;

		while (pos < llavesDeVehiculosEstacionados.size() && llavesDeVehiculosEstacionados.get(pos) != null
				&& !encontrada) {
			encontrada = llavesDeVehiculosEstacionados.get(pos).esPatente(patente);
			pos++;
		}
		return encontrada;
	}
}
