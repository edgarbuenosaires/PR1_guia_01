package ejercicio06;

public class Materia {
	private String nombre;
	private double notaFinal;

	public Materia(String nombre, int notaFinal) {
		this.nombre = nombre;
		this.notaFinal = notaFinal;
	}

	public double getNota() {
		return this.notaFinal;
	}

}
