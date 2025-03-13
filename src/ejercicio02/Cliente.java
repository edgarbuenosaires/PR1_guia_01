package ejercicio02;

public class Cliente {
	private String nombre;
	private int diasDeEstadia;

	public Cliente(String nombre, int diasDeEstadia) {
		super();
		this.nombre = nombre;
		this.diasDeEstadia = diasDeEstadia;
	}

	public int getDiasDeEstadia() {
		return diasDeEstadia;
	}

}
