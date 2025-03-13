package ejercicio05;

public class Domicilio {
	private String calle;
	private int codigoPostal;
	private String provincia;

	public Domicilio(String calle, int codigoPostal, String provincia) {
		super();
		this.calle = calle;
		this.codigoPostal = codigoPostal;
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Domicilio [calle=" + calle + ", codigoPostal=" + codigoPostal + ", provincia=" + provincia + "]";
	}

}
