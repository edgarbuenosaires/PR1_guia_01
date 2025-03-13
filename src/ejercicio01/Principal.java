package ejercicio01;

public class Principal {

	public static void main(String[] args) {

		OrtDemy inst = new OrtDemy();
		Usuario u1 = new Usuario(1, "Pepe", "pepeMail", true);
		Usuario u2 = new Usuario(2, "Mari", "MariaMail", false);
		Usuario u3 = new Usuario(3, "Jose", "joseMail", true);
		
		Categoria ca1 = new Categoria(1, "La categoria");
		
		Curso cu1 = new Curso(11, "Alto Curso", 100, 5, u1);
		Curso cu2 = new Curso(12, "El curso", 50, 2, u1);

		inst.agregarUsuario(u1);
		inst.agregarUsuario(u2);
		inst.agregarUsuario(u3);
		
		inst.agregarCaterogia(ca1);

		ca1.agregarCurso(cu1);
		ca1.agregarCurso(cu2);
		
		System.out.println(inst.suscribirseACurso(2, 11));

	}

}
