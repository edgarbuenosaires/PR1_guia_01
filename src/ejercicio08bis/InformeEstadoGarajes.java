package ejercicio08bis;

public class InformeEstadoGarajes {
	private String codigoGaraje;
	private int cantVehiculosEstacionados;

	public InformeEstadoGarajes(String codigoGaraje, int cantVehiculosEstacionados) {
		super();
		this.codigoGaraje = codigoGaraje;
		this.cantVehiculosEstacionados = cantVehiculosEstacionados;
	}

	@Override
	public String toString() {
		return "InformeEstadoGarajes [codigoGaraje=" + codigoGaraje + ", cantVehiculosEstacionados="
				+ cantVehiculosEstacionados + "]";
	}

}
