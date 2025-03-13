package ejercicio03;

import java.util.ArrayList;




public class Carrera {
	private String nombre;
	private ArrayList<Alumno> alumnos;

	public Carrera(String nombre) {
		super();
		this.nombre = nombre;
		this.alumnos = new ArrayList<>();
	}

	public boolean agregarAlumno(Alumno a) {
		return this.alumnos.add(a);
	}

	public ArrayList<Informe> getInformeMaxMaterias() {
		ArrayList<Informe> informeMaxMaterias = new ArrayList<>();

		for (Alumno a : alumnos) {
			if (a.tieneAprobadas()) {
				Informe i = new Informe(a.getNombre(), a.getMail(), a.getMatAprob());
				informeMaxMaterias.add(i);
			}
		}
		return informeMaxMaterias;
	}
// 	Resolucion del profesor
//	public Informe getInformeMaxMaterias() {
//		Informe inf = new Informe(cantMaxDeMateriasAprobadas());
//		for (Alumno_borrar a : alumnos) {
//			if (a.getMateriasAprobadas() == cantMaxDeMateriasAprobadas())
//				inf.agregarAlumno(a);
//		}
//		return inf;
//	}
	
	private int cantMaxDeMateriasAprobadas() {
		int max = 0;

		for (Alumno a : alumnos) {
			if (a.getMatAprob() > max) {
				max = a.getMatAprob();
			}
		}
		return max;
	}
}
