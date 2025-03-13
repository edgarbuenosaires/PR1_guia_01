package ejercicio10;

public class JuegoConDisponibilidad {
	private String nomJuego;
	private int cantLugDisponibles;

	public JuegoConDisponibilidad(String nomJuego, int cantLugDisponibles) {
		super();
		this.nomJuego = nomJuego;
		this.cantLugDisponibles = cantLugDisponibles;
	}

	@Override
	public String toString() {
		return "JuegoConDisponibilidad [nomJuego=" + nomJuego + ", cantLugDisponibles=" + cantLugDisponibles + "]";
	}

}
