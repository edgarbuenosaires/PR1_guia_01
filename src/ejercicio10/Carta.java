package ejercicio10;

public class Carta {
	private Palo palo;
	private int numero;

	public Carta(Palo palo, int numero) {
		super();
		this.palo = palo;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Carta [palo=" + palo + ", numero=" + numero + "]";
	}

}
