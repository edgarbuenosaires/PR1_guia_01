package ejercicio09;

public class Usuario {
	private String nomUsuario;
	private Estado estado;

	public Usuario(String nomUsuario, Estado estado) {
		super();
		this.nomUsuario = nomUsuario;
		this.estado = estado;
	}

	public String getNomUuario() {
		return this.nomUsuario;
	}

	public Estado getEstado() {
		return estado;
	}

}
