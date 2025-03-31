package ejercicio08;

import java.util.ArrayList;

public class Empresa {
	public static final int MESES_TOLERADOS = 4;
	private ArrayList<Garaje> garajes;

	public Empresa() {
		this.garajes = new ArrayList<>();
	}

	public ArrayList<InformeEstadoGarajes> obtenerInformeEstadoGarajes() {
		ArrayList<InformeEstadoGarajes> informe = new ArrayList<>();
		for (Garaje g : garajes) {
			InformeEstadoGarajes i = new InformeEstadoGarajes(g.getCodigo(), g.getCantVehiculosEstacionados());
			informe.add(i);
		}
		return informe;
	}

	public void mostrarVehiculosSinLlave() {
		for (Garaje g : garajes) {
			g.mostrarVehiculosEstacionadosSinLlaveEnTablero();
		}
	}
	

	public boolean agregarGaraje(Garaje garaje) {
		return this.garajes.add(garaje);
	}
}
