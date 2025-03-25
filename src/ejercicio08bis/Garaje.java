package ejercicio08bis;

import java.util.ArrayList;

public class Garaje {
	private String codigo;
	private ArrayList<Vehiculo> vehiculosEstacionados;
	private ArrayList<Vehiculo> vehiculosRetirados;
	private Tablero tablero;

	public Garaje(String codigo, Tablero tablero) {
		this.codigo = codigo;
		this.tablero = tablero;
		this.vehiculosEstacionados = new ArrayList<>();
		this.vehiculosRetirados = new ArrayList<>();
	}

	public Resultado estacionarVehiculo(String patente) {
		Resultado resul = null;
		Vehiculo v = null;
		v = buscarVehiculoEn(vehiculosEstacionados, patente);

		if (v != null) {
			resul = Resultado.VEHICULO_YA_ESTACIONADO;
		} else {
			v = buscarVehiculoEn(vehiculosRetirados, patente);
			if (v != null) {
				if (v.getMesesAdeudados() < Empresa.MESES_TOLERADOS) {
					ingresarVehiculo(v);
					resul = Resultado.INGRESO_OK;
				} else {
					resul = Resultado.NO_ESTACIONA_ADEUDA;
				}
			} else {
				resul = Resultado.VEHICULO_NO_HABILITADO;
			}
		}
		return resul;
	}

	private Vehiculo buscarVehiculoEn(ArrayList<Vehiculo> vehiculos, String patente) {
		Vehiculo v = null;
		int pos = 0;

		while (pos < vehiculos.size() && v == null) {
			if (vehiculos.get(pos).esPatente(patente)) {
				v = vehiculos.get(pos);
			}
			pos++;
		}
		return v;
	}

	private void ingresarVehiculo(Vehiculo v) {
		vehiculosRetirados.remove(v);
		vehiculosEstacionados.add(v);
		tablero.agregarLlave(v.retirarLlave());
	}

	private boolean esPersonaAutorizada(String dni) {

		// hacer

		return false;
	}
}
