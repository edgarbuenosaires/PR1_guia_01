package ejercicio05bis;

import java.util.ArrayList;

public class Padron {
	private static int numMesa = 1;
	private static ArrayList<Escuela> escuelas;

	public Padron() {
		super();
		Padron.escuelas = new ArrayList<>();
	}

	public static Mesa buscMesaConVotante(Persona p) {
		Mesa mesBusc = null;
		Mesa mesa = null;
		int pos = 0;

		while (pos < escuelas.size() && mesBusc == null) {
			mesa = escuelas.get(pos).buscarMesaConVotante(p);
			if (mesa != null) {
				mesBusc = mesa;
			} else {
				pos++;
			}
		}
		return mesBusc;
	}
	
	public boolean agregarEscuela(Escuela e) {
		return ((buscarEscuela(e) == null) ? Padron.escuelas.add(e) : false);
	}

	private Escuela buscarEscuela(Escuela e) {
		Escuela escBusc = null;
		int pos = 0;
		while (pos < escuelas.size() && escBusc == null) {
			if (escuelas.get(pos).getNombre().equalsIgnoreCase(e.getNombre())) {
				escBusc = escuelas.get(pos);
			} else {
				pos++;
			}
		}
		return escBusc;
	}

	public static int generarNumeroMesa() {
		return numMesa++;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	public void mostrarInforme() {
		for (Escuela e : escuelas) {
			System.out.println(e.obtenerInforme() + "\n");
		}
	}

	public void mostrarMesasConPresidentes() {
		for (Escuela e : escuelas) {
			e.mostrarMesasConPresidentes();
		}
	}

}
