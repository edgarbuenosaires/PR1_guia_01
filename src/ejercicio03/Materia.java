package ejercicio03;

public class Materia {
	private String nombre;
	private String cuatrimestre;
	private Estado estado;

	
	
	public Materia(String nombre, String cuatrimestre, Estado estado) {
		super();
		this.nombre = nombre;
		this.cuatrimestre = cuatrimestre;
		this.estado = estado;
	}



	public boolean estaAprobada() {
		return estado == Estado.APROBADA;
	}
}
