package ejercicio05;

public class Principal {
	public static void main(String[] args) {

		Padron padron = new Padron();
		Domicilio d1 = new Domicilio("Sarmiento", "5870", "Cordoba");

		Escuela e1 = new Escuela("Brizuela", d1);
		Escuela e2 = new Escuela("Normal", d1);

		padron.agregarEscuela(e1);
		padron.agregarEscuela(e2);

		Persona p1 = new Persona("Jose", "Gomez", "1234", Genero.MASCULINO, "20/04/90", d1);
		Persona p2 = new Persona("Maria", "Gutierrez", "2345", Genero.FEMENINO, "20/07/70", d1);
		Persona p3 = new Persona("Nery", "Peloso", "3456", Genero.NO_BINARIO, "03/08/67", d1);

		Mesa m1 = new Mesa(p1); // PRESIDENTE JOSE GOMEZ
		Mesa m2 = new Mesa(p2); // PRESIDENTA MARIA GUTIERREZ

		e1.agregarMesa(m1);
		e2.agregarMesa(m2);

		m1.agregarPersona(p2);
		m1.agregarPersona(p2);
		m2.agregarPersona(p3);

		System.out.println("Muestro informe");
		padron.mostrarInforme();

		System.out.println("\nMuestro mesas con presidentes.");
		padron.mostrarMesasConPresidentes();

		System.out.println("\nEnvio a Jose Gomez a la mesa 2");
		e2.designarPresidenteDeMesa(m2, p1);

		System.out.println("\nMuestro mesas con presidentes.");
		padron.mostrarMesasConPresidentes();
	}
}
