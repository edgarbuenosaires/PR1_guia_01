package ejercicio06;

public class Materia {
	private String nomMateria;
	private int notaFinal;

	public Materia(String nomMateria, int notaFinal) {
		super();
		this.nomMateria = nomMateria;
		this.notaFinal = notaFinal;
	}

	public int getNota() {
		return notaFinal;
	}

	public String getNomMateria() {
		return nomMateria;
	}

}
