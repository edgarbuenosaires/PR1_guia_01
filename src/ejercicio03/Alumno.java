package ejercicio03;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private String mail;
	private ArrayList<Materia> materiasCursadas;

	public Alumno(String nombre, String mail) {
		super();
		this.nombre = nombre;
		this.mail = mail;
		this.materiasCursadas = new ArrayList<>();
	}

	public boolean agregarMateria(Materia m) {
		return this.materiasCursadas.add(m);
	}

	public boolean tieneAprobadas() {
		boolean tieneAprobadas = false;
		int pos = 0;

		while (pos < this.materiasCursadas.size() && !tieneAprobadas) {
			tieneAprobadas = (materiasCursadas.get(pos).estaAprobada());
			pos++;
		}
		return tieneAprobadas;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getMail() {
		return this.mail;
	}

	public int getMatAprob() {
		int cont = 0;
		for (Materia m : materiasCursadas) {
			if (m.estaAprobada()) {
				cont++;
			}
		}
		return cont;
	}

}
