package ejercicio06;

import java.util.ArrayList;

public class Carrera {
	private static final int PROMEDIO_MINIMO = 7;
	private static final int MINIMO_MATERIAS_APROBADAS = 5;
	private static final int NUM_MAX_DE_CANDIDATOS = 20;
	private ArrayList<Alumno> alumnos;

	public ArrayList<Candidato> obtenerCandidatos(int promMinimo) {
		ArrayList<Candidato> candidatosAptos = new ArrayList<Candidato>();
		Alumno alu = null;
		int i = 0;
		while (i < alumnos.size() && candidatosAptos.size() < NUM_MAX_DE_CANDIDATOS)
			alu = alumnos.get(i);
		if (alu.tieneMateriasAprobadas(MINIMO_MATERIAS_APROBADAS) && alu.promedio() >= PROMEDIO_MINIMO)
			candidatosAptos.add(new Candidato(alu.getNombre(), alu.getMail()));
		return candidatosAptos;
	}
}
