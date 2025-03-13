package ejercicio09;

import java.util.ArrayList;

public class Cancion {
	private String id;
	private String nombre;
	private int duracionEnSegundos;
	private ArrayList<Usuario> usuariosQueDieronLike;

	public Cancion(String id, String nombre, int duracionEnSegundos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.duracionEnSegundos = duracionEnSegundos;
		this.usuariosQueDieronLike = new ArrayList<Usuario>();
	}

	public int getDuracion() {
		return this.duracionEnSegundos;
	}

	public boolean usuarioDioLike(Usuario u) {
		boolean encontrado = false;
		int i = 0;
		while (i < usuariosQueDieronLike.size() && encontrado == false) {
			encontrado = (usuariosQueDieronLike.get(i) == u);
			i++;
		}
		return encontrado;
	}

	@Override
	public String toString() {
		return "Cancion [id=" + id + ", nombre=" + nombre + ", duracionEnSegundos=" + duracionEnSegundos + "]";
	}

}
