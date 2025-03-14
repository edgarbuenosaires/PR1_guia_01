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
		darBajaDelPadron(p);
		return personas.add(p);
	}

	public boolean designarPresidente(Persona p) {
		darBajaDelPadron(p);
		this.presidente = p;
		return this.personas.add(p);
	}

	public void darBajaDelPadron(Persona p) {
		Mesa mesa;
		mesa = Padron.buscMesaConVotante(p);

		if (mesa != null) {
			if (mesa.getPresidente().getDni().equalsIgnoreCase(p.getDni())) {
				mesa.eliminarPresidente();
			}
			mesa.removerPersona(p);
		}

	}

	private void eliminarPresidente() {
		this.presidente = null;

	}

	private Persona getPresidente() {
		return this.presidente;
	}

	public boolean removerPersona(Persona p) {
		return this.personas.remove(p);
	}

	public boolean tieneALaPersona(Persona p) {
		Persona buscada = null;
		Persona persona = null;
		int pos = 0;

		while (pos < personas.size() && buscada == null) {
			persona = personas.get(pos);
			if (persona.getDni().equalsIgnoreCase(p.getDni())) {
				buscada = persona;
			} else {
				pos++;
			}
		}
		return buscada != null;
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