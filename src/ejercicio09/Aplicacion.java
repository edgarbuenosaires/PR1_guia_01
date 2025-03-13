package ejercicio09;

import java.util.ArrayList;

public class Aplicacion {
	private ArrayList<Artista> artistas;
	private ArrayList<Usuario> usuarios;

	public Aplicacion() {
		super();
		this.artistas = new ArrayList<Artista>();
		this.usuarios = new ArrayList<Usuario>();
	}

	public Usuario borrarUsuario(String nomUsuario) {
		return usuarios.remove(buscarIdxNomUsuario(nomUsuario));
	}

	private int buscarIdxNomUsuario(String nomUsuario) {
		int idx = 0;
		int i = 0;
		boolean encontrado = false;
		while (i < usuarios.size() && !encontrado) {
			if (usuarios.get(i).getNomUuario().equalsIgnoreCase(nomUsuario)) {
				encontrado = true;
				idx = i;
			}
			i++;
		}
		return idx;
	}

	public void mostrarArtistas() {
		for (Artista a : artistas) {
			System.out.println(a.mostrar());
		}
	}
}
