package ejercicio03;

import java.util.ArrayList;

public class Informe {
	private String nombre;
	private String mail;
	private int cantMatAprob;

	public Informe(String nombre, String mail, int cantMatAprob) {
		super();
		this.nombre = nombre;
		this.mail = mail;
		this.cantMatAprob = cantMatAprob;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", mail: " + mail + ", Materias aprobadas: " + cantMatAprob + ".";
	}

	// Informe resolucion del profesor. Tiene un objetivo diferente.
	//
	// public class Informe {
	// private int cantMateriasAprobadas;
	// private ArrayList<Alumno_borrar> alumnos;
	//
	// public Informe(int materiasAprobadas) {
	// super();
	// this.cantMateriasAprobadas = materiasAprobadas;
	// this.alumnos = new ArrayList<>();
	// }
	//
	// public boolean agregarAlumno(Alumno_borrar a) {
	// return this.alumnos.add(a);
	//
	// }
	//
	// public int getCantMateriasAprobadas() {
	// return cantMateriasAprobadas;
	// }
	// }

}
