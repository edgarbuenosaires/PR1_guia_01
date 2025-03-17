package ejercicio06;

import java.util.ArrayList;

public class Carrera {
	private ArrayList<Alumno> alumnos;
	private final int MIN_MAT_APROB = 5;
	private final int MAX_CANT_CANDIDAT = 20;

	public Carrera() {
		this.alumnos = new ArrayList<>();
	}

	public boolean agregarAlumno(Alumno a) {
		return this.alumnos.add(a);
	}

	public ArrayList<Candidato> obtenerCandidatos(double promNotaMinim) {
		ArrayList<Candidato> candidatos = new ArrayList<>();
		Alumno alum = null;
		int pos = 0;

		while (pos < alumnos.size() && candidatos.size() < MAX_CANT_CANDIDAT) {
			alum = alumnos.get(pos);
			if (esCandidatoValido(alum, promNotaMinim)) {
				Candidato can = new Candidato(alum.getNombre(), alum.getMail());
				candidatos.add(can);
			}
			pos++;
		}
		return candidatos;

	}

	private boolean esCandidatoValido(Alumno alum, double promNotaMinim) {
		return alum.tieneMinMaterAprobadasYPromNotaMinim(MIN_MAT_APROB, promNotaMinim);
	}
}
