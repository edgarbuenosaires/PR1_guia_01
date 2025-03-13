package ejercicio04;

import java.util.ArrayList;

public class Droide {
	private ArrayList<Droide> droidesFueraDeServicio;
	private ArrayList<Pieza> piezas;
	private boolean enServicio;

	public Droide(boolean enServicio) {
		super();
		this.enServicio = enServicio;
		this.droidesFueraDeServicio = new ArrayList<>();
		this.piezas = new ArrayList<>();
	}

	public boolean agregarDroideFueraDeServicio(Droide d) {
		return (!d.enServicio) ? this.droidesFueraDeServicio.add(d) : false;
	}

	private Pieza buscPiNoOperativa() {
		Pieza piezaNoOperativa = null;
		int pos = 0;

		while (pos < this.piezas.size() && piezaNoOperativa == null) {
			if (!piezas.get(pos).esOperativa()) {
				piezaNoOperativa = piezas.get(pos);
			} else {
				pos++;
			}
		}
		return piezaNoOperativa;
	}

	private Pieza buscPiOperativa(String nombre) {
		Pieza piezaOperativa = null;
		Pieza pieza = null;
		Droide droide = null;
		int pos1 = 0;
		int pos2 = 0;

		while (pos1 < droidesFueraDeServicio.size() && piezaOperativa == null) {
			droide = droidesFueraDeServicio.get(pos1);
			pos2 = 0;
			while (pos2 < droide.getPiezas().size() && piezaOperativa == null) {
				pieza = droide.getPiezas().get(pos2);
				if (pieza.getNombre().equalsIgnoreCase(nombre) && pieza.esOperativa()) {
					piezaOperativa = pieza;
				} else {
					pos2++;
				}
			}
			pos1++;
		}
		return piezaOperativa;

	}

	private ArrayList<Pieza> getPiezas() {
		return piezas;
	}

	public boolean agregarPieza(Pieza p) {
		return this.piezas.add(p);
	}

	public Resultado autoRepararse() {
		Resultado res = null;
		Pieza piezaNoOperativa = buscPiNoOperativa();

		if (piezaNoOperativa != null) {

			Pieza piezaOperativa = buscPiOperativa(piezaNoOperativa.getNombre());
			if (!(piezaOperativa == null)) {
				piezaNoOperativa.reparar();
				piezaOperativa.desactivar();
				res = Resultado.REPARACION_PARCIAL;
			} else {
				res = Resultado.REPARACION_IMPOSIBLE;
			}
		} else {
			res = Resultado.COMPLETAMENTE_OPERATIVO;
		}
		return res;
	}

	// Otra resolucion, que no fue testeada:
	//
	// public String autoRepararse() {
	// int reparaciones = 0;
	// String resultado;
	// for (Pieza pieza : piezasNoOperativas) {
	// for (Droide droide : droides) {
	// if (droide.fueraDeServicio && droide.tiene(pieza))
	// intercambiarPiezas(droide, pieza);
	// reparaciones++;
	// }
	// }
	// if (this.piezasNoOperativas.isEmpty()) {
	// resultado = "Completamente Operativo";
	// } else if (reparaciones > 0 && piezasNoOperativas.size() > 0) {
	// resultado = "Reparacion Parcial";
	// } else {
	// resultado = "Reparacion Imposible";
	// }
	// return resultado;
	// }

}
