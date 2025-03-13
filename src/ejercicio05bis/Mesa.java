package ejercicio05bis;

import java.util.ArrayList;

public class Mesa {
	private int numero;
	private Persona presidente;
	private ArrayList<Persona> personas;

	public Mesa(Persona presidente) {
		super();
		this.numero = Padron.generarNumeroMesa();
		this.personas = new ArrayList<>();
		designarPresidente(presidente);
	}

	public boolean agregarPersona(Persona p) {
		return (!estaEnElPadron(p)) ? this.personas.add(p) : false;
	}
	
	
	
	public boolean designarPresidente(Persona p) {
		Mesa mesa;
		mesa = Padron.buscMesaConVotante(p);

		if (mesa != null) {
			mesa.removerPersona(p);
		}

		this.presidente = p;
		return this.personas.add(p);
	}

	public boolean removerPersona(Persona p) {
		return this.personas.remove(p);
	}

	public boolean estaEnElPadron(Persona p) {
		Mesa mesa;
		mesa = Padron.buscMesaConVotante(p);

		if (mesa != null) {
			mesa.removerPersona(p);
		}
		return personas.contains(p);
	}




	
	
	
	
	
	
	

	public void generarInforme(ArrayList<Informe> informes) {
		int orden = 1;

		for (Persona p : personas) {
			Informe inf = new Informe(numero, orden, p.getDni(), p.getNombre(), p.getApellido());
			informes.add(inf);
			orden++;
		}
	}

	public void mostrarMesasConPresidentes() {
		System.out.println("Mesa " + this.numero + " presidente: " + this.presidente);

	}

}