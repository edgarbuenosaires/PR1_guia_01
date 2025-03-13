package ejercicio01;

import java.util.ArrayList;

public class OrtDemy {
	private ArrayList<Usuario> usuarios;
	private ArrayList<Categoria> categorias;

	public OrtDemy() {
		super();
		this.usuarios = new ArrayList<Usuario>();
		this.categorias = new ArrayList<Categoria>();
	}

//	Forma sugerida por el profe
	
//	public Resultado_borrar suscribirseACurso(String idUsuario, String idCurso) {
//		Resultado_borrar resultado = Resultado_borrar.SUSCRIPTO_OK;
//		Usuario_borrar usuario;
//		Curso_borrar curso;
//
//		usuario = buscarUsuario(idCurso);
//		if (usuario != null) {
//			curso = buscarCurso(idCurso);
//			if (curso != null) {
//				if (!curso.superaBecados()) {
//					if (!curso.esElAutor(usuario)) {
//						if (!curso.estaRegistrado(usuario)) {
//							curso.suscribir(usuario);
//						} else {
//							resultado = Resultado_borrar.YA_SUSCRIPTO;
//						}
//
//					} else {
//						resultado = Resultado_borrar.ES_AUTOR;
//					}
//				} else {
//					resultado = Resultado_borrar.MAX_BECADOS;
//				}
//			} else {
//				resultado = Resultado_borrar.CURSO_INEX;
//			}
//
//		} else {
//			resultado = Resultado_borrar.USUARIO_INEX;
//		}
//
//		return resultado;
//	}
	
	public String suscribirseACurso(int idUsuario, int idCurso) {
		Usuario u = buscarUsuario(idUsuario);

		// con operador ternario

		return ((u == null)) ? Resultado.USUARIO_INEX.getTexto() : buscarCategoriaConCursoEInscribir(idCurso, u);
	}

	private String buscarCategoriaConCursoEInscribir(int idCurso, Usuario u) {
		Categoria categBuscada = null;
		int pos = 0;
		while (pos < categorias.size() && categBuscada == null) {
			if (categorias.get(pos).tieneCurso(idCurso)) {
				categBuscada = categorias.get(pos);
			}
			pos++;
		}

		// con operador ternario

		return ((categBuscada == null) ? Resultado.CURSO_INEX.getTexto()
				: categBuscada.inscribirUsuario(idCurso, u));

	}

	public boolean agregarUsuario(Usuario u) {
		return this.usuarios.add(u);
	}

	public boolean agregarCaterogia(Categoria c) {
		return this.categorias.add(c);
	}

	private Usuario buscarUsuario(int idUsuario) {
		Usuario u = null;
		int pos = 0;
		
		while (pos < usuarios.size() && u == null) {
			if (usuarios.get(pos).getID() == idUsuario) {
				u = usuarios.get(pos);
			}
			pos++;
		}
		return u;
	}

}
