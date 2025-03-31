package ejercicio08bis;

public class Llave {
	private String patenteDelVehiculo;

	public Llave(String patenteDelVehiculo) {
		super();
		this.patenteDelVehiculo = patenteDelVehiculo;
	}

	public boolean esPatente(String patente) {
		return this.patenteDelVehiculo.equalsIgnoreCase(patente);
	}

	@Override
	public String toString() {
		return "Llave [patenteDelVehiculo=" + patenteDelVehiculo + "]";
	}
	
	
}
