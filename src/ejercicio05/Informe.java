package ejercicio05;

public class Informe {
	private int numeroDeMesa;
	private int numeroDeOrdenDelVotante;
	private String dni;
	private String apellidoYNombre;

	public Informe(int numeroDeMesa, int numeroDeOrdenDelVotante, String dni, String apellidoYNombre) {
		super();
		this.numeroDeMesa = numeroDeMesa;
		this.numeroDeOrdenDelVotante = numeroDeOrdenDelVotante;
		this.dni = dni;
		this.apellidoYNombre = apellidoYNombre;
	}

	@Override
	public String toString() {
		return "Informe [numeroDeMesa=" + numeroDeMesa + ", numeroDeOrdenDelVotante=" + numeroDeOrdenDelVotante
				+ ", dni=" + dni + ", apellidoYNombre=" + apellidoYNombre + "]";
	}

}
