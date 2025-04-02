package ejercicio09;

import java.util.ArrayList;

public class Artista {
	private static final int CANT_PRIMERAS_CANCIONES = 5;
	private String id;
	private String nombre;
	private ArrayList<Cancion> canciones;

	public Artista(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.canciones = new ArrayList<>();
	}

	public boolean agregarCancion(Cancion c) {
		return this.canciones.add(c);
	}

	public String mostrarDuracionPromedio() {
		int acum = 0;
		int minutos = 0;
		int segundos = 0;
		for (Cancion cancion : canciones) {
			acum += cancion.getDuración();
		}
		if (acum > 60) {
			minutos = acum / 60;
		}
		segundos = acum % 60;
		return "La duración promedio es " + minutos + " minutos, " + segundos + " segundos.";
	}

	public boolean esFanDestacado(Usuario u) {
		return numCancionesQueDioLike(u) >= (canciones.size() / 2);
	}

	private int numCancionesQueDioLike(Usuario u) {
		int cant = 0;
		for (Cancion c : canciones) {
			if (c.elUsuarioDioLike(u)) {
				cant++;
			}
		}
		return cant;
	}

	public ArrayList<Cancion> primerasCanciones() {
		ArrayList<Cancion> primerasCanciones = new ArrayList<>();
		int fin = (canciones.size() > CANT_PRIMERAS_CANCIONES) ? CANT_PRIMERAS_CANCIONES : canciones.size();
		for (int i = 0; i < fin; i++) {
			primerasCanciones.add(canciones.get(i));
		}
		return primerasCanciones;
	}

	public void eliminarUsuarioLike(Usuario u) {
		for (Cancion c : canciones) {
			c.eliminarUsuarioLike(u);
		}
	}
}
