package ejercicio06;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		Carrera c = new Carrera();
		Alumno a1 = new Alumno("Jose", "peperompe@gmail.com");
		Alumno a2 = new Alumno("Maria", "lamaria@gmail.com");

		c.agregarAlumno(a1);
		c.agregarAlumno(a2);

		Materia m1 = new Materia("Psicologia", 4);
		Materia m2 = new Materia("Epistemologia", 5);
		Materia m3 = new Materia("Recursos Humanos", 3);
		Materia m4 = new Materia("Antropologia", 10);
		Materia m5 = new Materia("Biologia", 8);
		Materia m6 = new Materia("Andrologia", 7);
		Materia m7 = new Materia("Administración", 9);
		Materia m8 = new Materia("Tecnología", 8);

		a1.agregarMateria(m1);
		a1.agregarMateria(m2);
		a1.agregarMateria(m3);
		a1.agregarMateria(m4);
		a1.agregarMateria(m5);
		a1.agregarMateria(m6);
		a1.agregarMateria(m7);
		a1.agregarMateria(m8);

		a2.agregarMateria(m1);
		a2.agregarMateria(m2);
		a2.agregarMateria(m3);
		a2.agregarMateria(m4);
		a2.agregarMateria(m5);
		a2.agregarMateria(m6);
		a2.agregarMateria(m7);
		a2.agregarMateria(m8);

		System.out.println("Muestro candidatos con promedio mayor a 10");
		ArrayList<Candidato> candidatos = c.obtenerCandidatos(4);
		for (Candidato cand : candidatos) {
			System.out.println(cand);
		}

	}
}
