package ejercicio09;

import java.util.ArrayList;

public class Artista {
	private static final int LIM_CANCIONES = 5;
	private String id;
	private String nombre;
	private ArrayList<Cancion> canciones;

	public Artista(String id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.canciones = new ArrayList<Cancion>();
	}

	public String mostrarDuracionPromedio() {
		int acum = 0;
		for (Cancion c : canciones) {
			acum += c.getDuracion();
		}
		return acum / canciones.size() + " minutos y " + acum % canciones.size() + " segundos.";
	}

	public boolean esFanDestacado(Usuario u) {
		int cont = 0;
		for (Cancion c : canciones) {
			if (c.usuarioDioLike(u))
				cont++;
		}
		return cont >= (canciones.size() / 2);
	}

	public ArrayList<Cancion> priemras5Canciones() {
		ArrayList<Cancion> primerasCinco = new ArrayList<Cancion>();
		int i = 0;
		while (i < canciones.size() && primerasCinco.size() <= LIM_CANCIONES) {
			primerasCinco.add(canciones.get(i));
			i++;
		}
		return primerasCinco;
	}

	public String mostrar() {
		return "Artista [id=" + id + ", nombre=" + nombre + "]";
	}

}
