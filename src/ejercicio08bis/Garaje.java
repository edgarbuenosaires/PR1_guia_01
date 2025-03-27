package ejercicio08bis;

import java.util.ArrayList;

public class Garaje {
	private String codigo;
	private ArrayList<Vehiculo> estacionados;
	private ArrayList<Vehiculo> retirados;
	private Tablero tablero;

	public Garaje(String codigo, Tablero tablero) {
		this.codigo = codigo;
		this.tablero = tablero;
		this.estacionados = new ArrayList<>();
		this.retirados = new ArrayList<>();
	}

	public Resultado estacionarVehiculo(String patente) {
		Resultado resul = null;
		Vehiculo v = null;
		v = buscarVehiculoEn(estacionados, patente);

		if (v != null) {
			resul = Resultado.VEHICULO_YA_ESTACIONADO;
		} else {
			v = buscarVehiculoEn(retirados, patente);
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
		retirados.remove(v);
		estacionados.add(v);
		tablero.agregarLlave(v.retirarLlave());
	}

	private boolean esPersonaAutorizada(String dni) {
		Vehiculo vehiculo = null;
		int pos = 0;

		while (pos < estacionados.size() && vehiculo == null) {
			if (estacionados.get(pos).tieneAutorizadoA(dni)) {
				vehiculo = estacionados.get(pos);
			}
			pos++;
		}
		return vehiculo != null;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public int getCantVehiculosEstacionados() {
		return this.estacionados.size();
	}

	public void mostrarVehiculosEstacionadosSinLlaveEnTablero() {
		for (Vehiculo v : estacionados) {
			
		}
		
	}
}
