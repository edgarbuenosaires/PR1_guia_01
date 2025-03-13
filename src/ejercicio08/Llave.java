package ejercicio08;

public class Llave {
	private String patenteDelVehiculo;

	public Llave(String patenteDelVehiculo) {
		super();
		this.patenteDelVehiculo = patenteDelVehiculo;
	}

	public String getPatente() {
		return this.patenteDelVehiculo;
	}

	@Override
	public String toString() {
		return "Llave [patenteDelVehiculo=" + patenteDelVehiculo + "]";
	}

}
