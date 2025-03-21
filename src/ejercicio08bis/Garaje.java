package ejercicio08bis;

import java.util.ArrayList;

public class Garaje {
	private String codigo;
	private ArrayList<Vehiculo> vehiculosEstacionados;
	private ArrayList<Vehiculo> vehiculosRetirados;
	private Tablero tablero;

	public Resultado estacionarVehiculo(String patente) {
		Resultado result = null;
		Vehiculo v = null;
		v = buscarVehiculoEnEstacionados(patente);

		if (v != null) {
			result = Resultado.VEHICULO_YA_ESTACIONADO;
		} else {
			v = buscarVehiculoEnRetirados(patente);
			if (v != null) {
				if (v.getMesesAdeudados() < Empresa.MESES_TOLERADOS) {
					result = Resultado.INGRESO_OK;
				}
			} else {
				result = Resultado.VEHICULO_NO_HABILITADO;
			}
		}
		return result;
	}

	private Vehiculo buscarVehiculoEnEstacionados(String patente) {
		// TODO Auto-generated method stub
		return null;
	}

	private Vehiculo buscarVehiculoEnRetirados(String patente) {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean esPersonaAutorizada(String dni) {

		// hacer

		return false;
	}
}
