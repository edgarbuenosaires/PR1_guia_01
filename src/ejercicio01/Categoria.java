package ejercicio01;

import java.util.ArrayList;

public class Categoria {
	private int ID;
	private String nombre;
	private ArrayList<Curso> cursos;

	public Categoria(int iD, String nombre) {
		super();
		ID = iD;
		this.nombre = nombre;
		this.cursos = new ArrayList<Curso>();
	}

	public boolean tieneCurso(int idCurso) {
		return buscarCurso(idCurso) != null;
	}

	private Curso buscarCurso(int idCurso) {
		Curso c = null;
		int i = 0;
		while (i < cursos.size() && c == null) {
			if (cursos.get(i).getId() == idCurso) {
				c = cursos.get(i);
			} else {
				i++;
			}
		}
		return c;
	}

	// Otra forma desarrollada por el profe.
	// public Curso buscarCurso(String idCurso) {
	// Curso curso = null;
	// int pos = 0;
	// Curso c;
	//
	// while (pos < cursos.size() && curso == null) {
	// c = cursos.get(pos);
	// if (c.soyElCurso(idCurso)) {
	// curso = c;
	// } else {
	// pos++;
	// }
	// }
	// return curso;
	// }

	public String inscribirUsuario(int idCurso, Usuario u) {
		Curso cursBuscado = buscarCurso(idCurso);
		return cursBuscado.inscribirUsuario(u);
	}

	public boolean agregarCurso(Curso c) {
		return this.cursos.add(c);
	}

	public int getID() {
		return ID;
	}

	public String getNombre() {
		return nombre;
	}

}
