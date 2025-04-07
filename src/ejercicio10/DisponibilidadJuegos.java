package ejercicio10;

public class DisponibilidadJuegos {
	private String nomJuego;
	private int disponibilidad;

	public DisponibilidadJuegos(String nomJuego, int disponibilidad) {
		super();
		this.nomJuego = nomJuego;
		this.disponibilidad = disponibilidad;
	}

	@Override
	public String toString() {
		return nomJuego + " Disp: " + disponibilidad + ".";
	}

}
