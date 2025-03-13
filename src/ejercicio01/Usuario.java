package ejercicio01;

public class Usuario {
	private int ID;;
	private String nombre;
	private String mail;
	private boolean becado;

	public Usuario(int iD, String nombre, String mail, boolean becado) {
		super();
		ID = iD;
		this.nombre = nombre;
		this.mail = mail;
		this.becado = becado;
	}

	public int getID() {
		return this.ID;
	}

	public boolean esBecado() {
		return this.becado;
	}

	public String getNombre() {
		return nombre;
	}

	public String getMail() {
		return mail;
	}

}
