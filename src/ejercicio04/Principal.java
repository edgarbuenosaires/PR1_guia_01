package ejercicio04;

public class Principal {
	public static void main(String[] args) {
		Droide d1 = new Droide(true);
		Droide d2 = new Droide(false);
		Droide d3 = new Droide(false);

		Pieza p1 = new Pieza("mirada", false);
		Pieza p2 = new Pieza("visor", true);
		Pieza p3 = new Pieza("mirada", true);

		d1.agregarPieza(p1);
		d2.agregarPieza(p2);
		d3.agregarPieza(p3);

		d1.agregarDroideFueraDeServicio(d2);
		d1.agregarDroideFueraDeServicio(d3);

		System.out.println("Comprobacion de autoreparacion de drodide");
		System.out.println(d1.autoRepararse());

	}
}
