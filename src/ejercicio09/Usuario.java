package ejercicio09;

public class Usuario {
	private String nombreUsuario;
	private EstadoUsuario estado;

	public Usuario(String nombreUsuario, EstadoUsuario estado) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.estado = estado;
	}

	public boolean esNombreUsuario(String nom) {
		return this.nombreUsuario.equalsIgnoreCase(nom);
	}

	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", estado=" + estado + "]";
	}

}
