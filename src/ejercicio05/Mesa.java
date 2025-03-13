package ejercicio05;

import java.util.ArrayList;

public class Mesa {
	private int numeroDeMesa;
	private Persona presidente;
	private ArrayList<Persona> personasVotantes;

	public Mesa(int numero, Persona presidente) {
		super();
		this.numeroDeMesa = numero;
		this.presidente = presidente;
		this.personasVotantes = new ArrayList<Persona>();
	}

	@Override
	public String toString() {
		return "Mesa [numero=" + numeroDeMesa + ", presidente=" + presidente + ", personasVotantes=" + personasVotantes
				+ "]";
	}

	public void designarPresidente(Persona persona) {
		personasVotantes.add(persona);
		presidente = persona;

	}

	public void removerVotante(Persona persona) {
		for (Persona p : personasVotantes) {
			if (p == persona) {
				personasVotantes.remove(p);
				if (presidente == persona)
					presidente = null;
			}
		}

	}

	public ArrayList<Informe> generarInforme(ArrayList<Informe> informes) {
		for (Persona persona : personasVotantes) {
			informes.add(persona.generarInforme(numeroDeMesa, personasVotantes.indexOf(persona)));
		}
		return informes;

	}

}
