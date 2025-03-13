package ejercicio03;

public class Principal {
	public static void main(String[] args) {
		Carrera c = new Carrera("Sistema");

		Materia m1 = new Materia("Psicologia", "2", Estado.APROBADA);
		Materia m2 = new Materia("Antropologia", "3", Estado.APROBADA);

		Alumno a1 = new Alumno("Jose", "eljose@gmail.com");
		a1.agregarMateria(m1);
		a1.agregarMateria(m2);

		c.agregarAlumno(a1);
		
		System.out.println("Muestro informe:");
		for (Informe i : c.getInformeMaxMaterias()) {
			System.out.println(i);
		}

	}

}
