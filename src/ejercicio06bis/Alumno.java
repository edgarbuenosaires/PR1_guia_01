package ejercicio06bis;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private String mail;
	private ArrayList<Materia> materias;
	private final int NOTA_PARA_APROBAR = 4;

	public Alumno(String nom, String mail) {
		materias = new ArrayList<>();
		this.nombre = nom;
		this.mail = mail;
	}

	public boolean agregarMateria(Materia m){
		return this.materias.add(m);
	}
	
	public boolean tieneMinMaterAprobadasYPromNotaMinim(int mIN_MAT_APROB, double promNotaMinim) {
		int materiasAprobadas = 0;
		double sumatoriaNotasAprobadas = 0;

		for (Materia m : materias) {
			if (m.getNota() >= NOTA_PARA_APROBAR) {
				materiasAprobadas++;
				sumatoriaNotasAprobadas += m.getNota();
			}
		}
		return ((materiasAprobadas > 0) ? (sumatoriaNotasAprobadas / materiasAprobadas) >= promNotaMinim : false);
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getMail() {
		return this.mail;
	}


	
	
	
	
}
