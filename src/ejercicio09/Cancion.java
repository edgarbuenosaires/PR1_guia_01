package ejercicio09;

import java.util.ArrayList;

public class Cancion {
	private String id;
	private String nombre;
	private int duración;
	private ArrayList<Usuario> usuariosLike;

	public Cancion(String id, String nombre, int duración) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.duración = duración;
		this.usuariosLike = new ArrayList<>();
	}

	public boolean agregarLikeDeUsuario(Usuario u) {
		return this.usuariosLike.add(u);
	}

	public int getDuración() {
		return this.duración;
	}

	public boolean elUsuarioDioLike(Usuario u) {
		boolean existeElUsuario = false;
		int pos = 0;

		while (pos < usuariosLike.size() && !existeElUsuario) {
			existeElUsuario = usuariosLike.get(pos) == u;
			pos++;
		}
		return existeElUsuario;
	}

	public void eliminarUsuarioLike(Usuario u) {
		usuariosLike.remove(u);
	}

	@Override
	public String toString() {
		return "Cancion [id=" + id + ", nombre=" + nombre + ", duración=" + duración + "]";
	}

}
