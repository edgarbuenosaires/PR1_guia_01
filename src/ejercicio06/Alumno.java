package ejercicio06;

import java.util.ArrayList;

public class Alumno {
	private String nomAlumno;
	private String mailAlumno;
	private ArrayList<Materia> materiasAprobadas;

	public boolean tieneMateriasAprobadas(int num) {
		return this.materiasAprobadas.size() >= num;
	}

	public int promedio() {
		int acum = 0;
		for (Materia materia : materiasAprobadas) {
			acum += materia.getNota();
		}
		return acum / materiasAprobadas.size();
	}

	public String getNombre() {
		return this.nomAlumno;
	}

	public String getMail() {
		return this.mailAlumno;
	}
}
