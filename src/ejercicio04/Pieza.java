package ejercicio04;

public class Pieza {
	private String nombre;
	private boolean operativa;

	public Pieza(String nombre, boolean operativa) {
		super();
		this.nombre = nombre;
		this.operativa = operativa;
	}

	public boolean esOperativa() {
		return this.operativa;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void desactivar() {
		this.operativa = false;
	}

	public void reparar() {
		this.operativa = true;
	}

}
