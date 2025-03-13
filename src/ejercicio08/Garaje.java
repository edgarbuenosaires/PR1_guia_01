package ejercicio08;

import java.util.ArrayList;

public class Garaje {
	private static final int LIMITE_MESES_ADEUDADOS = 3;
	private String codigo;
	private ArrayList<Vehiculo> vehiculosEstacionados;
	private ArrayList<Vehiculo> vehiculosRetirados;
	private Tablero tablero;

	public Resultado estacionarVehiculo(String patente) {
		Resultado resultado = null;
		Vehiculo v = buscarVehiculo(vehiculosEstacionados, patente);
		if (v == null) {
			v = buscarVehiculo(vehiculosRetirados, patente);
			if (v != null && v.getMesesAdeudados() <= LIMITE_MESES_ADEUDADOS) {
				procesarIngreso(v);
				resultado = Resultado.INGRESO_OK;
			} else {
				resultado = Resultado.VEHICULO_NO_HABILITADO;
			}
		} else {
			resultado = Resultado.VEHICULO_YA_ESTACIONADO;
		}
		return resultado;
	}

	private void procesarIngreso(Vehiculo v) {
		tablero.agregarLlave(v.retirarLlave());
		vehiculosEstacionados.add(v);
		vehiculosRetirados.remove(v);

	}

	private Vehiculo buscarVehiculo(ArrayList<Vehiculo> vehiculos, String patente) {
		int i = 0;
		Vehiculo buscado = null;
		while (i < vehiculos.size() && buscado == null) {
			if (vehiculos.get(i).getPatente().equalsIgnoreCase(patente))
				buscado = vehiculos.get(i);
			i++;
		}
		return buscado;
	}

	public boolean esPersonaAutorizada(String dni) {
		boolean esAutorizado = false;
		int i = 0;
		while (i < vehiculosEstacionados.size() && esAutorizado == false) {
			esAutorizado = vehiculosEstacionados.get(i).esPersonaAutorizada(dni);
			i++;
		}
		return esAutorizado;
	}

	public void obtenerInformeEstadoGaraje() {
		System.out.println(
				"Codigo: " + this.codigo + " tiene " + vehiculosEstacionados.size() + " vehiculos estacionados.");

	}

	public void mostrarVehiculosSinLlave() {
		System.out.println("VEHICULOS SIN LLAVE:");
		for (Vehiculo v : vehiculosEstacionados) {
			if (!this.tablero.estaLaLlave(v.getPatente()))
				System.out.println(this.codigo + " vehiculo " + v.getPatente());
		}

	}
}
