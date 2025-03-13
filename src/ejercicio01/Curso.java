package ejercicio01;

import java.util.ArrayList;

public class Curso {
	private static final int MAX_CANT_BECADOS = 5;
	private int ID;
	private String titulo;
	private double precio;
	private int estrellas;
	private Usuario autor;
	private ArrayList<Usuario> suscriptos;
	private ArrayList<Leccion> lecciones;

	public Curso(int iD, String titulo, double precio, int estrellas, Usuario autor) {
		super();
		ID = iD;
		this.titulo = titulo;
		this.precio = precio;
		this.estrellas = estrellas;
		this.autor = autor;
		this.suscriptos = new ArrayList<Usuario>();
		this.lecciones = new ArrayList<Leccion>();
	}

	public String inscribirUsuario(Usuario u) {
		String resultadoInscripcion = "Error";

		if (!u.equals(autor)) {
			if (!existeElUsuarioYaSuscripto(u)) {
				if (!u.esBecado()) {
					suscriptos.add(u);
					resultadoInscripcion = Resultado.SUSCRIPTO_OK.getTexto();
				} else if (cantBecados() < MAX_CANT_BECADOS) {
					suscriptos.add(u);
					resultadoInscripcion = Resultado.SUSCRIPTO_OK.getTexto();
				}

			} else {
				resultadoInscripcion = Resultado.YA_SUSCRIPTO.getTexto();
			}
		} else {
			resultadoInscripcion = Resultado.ES_AUTOR.getTexto();
		}
		return resultadoInscripcion;
	}

	private int cantBecados() {
		int cantBecados = 0;
		for (Usuario u : suscriptos) {
			if (u.esBecado())
				cantBecados++;
		}
		return cantBecados;
	}

	private boolean existeElUsuarioYaSuscripto(Usuario u) {
		boolean usuarioEncontrado = false;
		int i = 0;
		while (i < suscriptos.size() && !usuarioEncontrado) {
			usuarioEncontrado = (suscriptos.get(i).equals(u));
			i++;
		}
		return usuarioEncontrado;
	}

	public int getId() {
		return this.ID;
	}

}
