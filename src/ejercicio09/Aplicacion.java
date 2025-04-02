package ejercicio09;

import java.util.ArrayList;

public class Aplicacion {
	private ArrayList<Artista> artistas;
	private ArrayList<Usuario> usuarios;

	public Aplicacion() {
		artistas = new ArrayList<>();
		usuarios = new ArrayList<>();
	}

	public boolean agregarArtista(Artista a) {
		return this.artistas.add(a);
	}

	public boolean agregarUsuario(Usuario u) {
		return this.usuarios.add(u);
	}

	private int buscarPosUsuario(String nom) {
		boolean encontrado = false;
		int pos = usuarios.size() - 1;

		while (pos >= 0 && !encontrado) {
			if (usuarios.get(pos).esNombreUsuario(nom)) {
				encontrado = true;
			} else {
				pos--;
			}
		}
		return pos;
	}

	public Usuario borrarUsuario(String nom) {
		Usuario u = null;
		int pos = buscarPosUsuario(nom);
		if (usuarios.get(pos) != null) {
			u = usuarios.get(pos);

			for (Artista a : artistas) {
				a.eliminarUsuarioLike(u);
			}
		}
		return (pos >= 0) ? usuarios.remove(pos) : null;
	}

	public void mostrarUsuarios() {
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}

	}

}
