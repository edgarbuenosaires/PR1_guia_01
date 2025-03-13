package ejercicio08;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Garaje> garajes;

	public void obtenerInfomeEstadoGarajes() {
		for (Garaje g : garajes) {
			g.obtenerInformeEstadoGaraje();
		}
	}

	public void mostrarVehiculosSinLlave() {
		for (Garaje g : garajes) {
			g.mostrarVehiculosSinLlave();
		}
	}
}
