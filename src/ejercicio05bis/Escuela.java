package ejercicio05bis;

import java.util.ArrayList;

public class Escuela {
	private String nombre;
	private Domicilio domicilio;
	private ArrayList<Mesa> mesas;

	public Escuela(String nombre, Domicilio domicilio) {
		super();
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.mesas = new ArrayList<>();
	}
	
	public void designarPresidenteDeMesa(Mesa m, Persona p) {
		Mesa mBuscada;
		mBuscada = Padron.buscMesaConVotante(p);
		if (mBuscada != null) {
			mBuscada.removerPersona(p);
		}
		m.designarPresidente(p);
	}

	public Mesa buscarMesaConVotante(Persona p) {
		Mesa mesaBusc = null;
		Mesa mesa;
		int pos = 0;

		while (pos < mesas.size() && mesaBusc == null) {
			mesa = mesas.get(pos);
			if (mesa.estaEnElPadron(p)) {
				mesaBusc = mesa;
			} else {
				pos++;
			}
		}
		return mesaBusc;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public ArrayList<Informe> obtenerInforme() {
		ArrayList<Informe> informes = new ArrayList<>();

		for (Mesa m : mesas) {
			m.generarInforme(informes);
		}
		return informes;
	}

	public boolean agregarMesa(Mesa m) {
		return this.mesas.add(m);
	}

	public void mostrarMesasConPresidentes() {
		for (Mesa m : mesas) {
			m.mostrarMesasConPresidentes();
		}
	}

	public String getNombre() {
		return this.nombre;
	}

}
