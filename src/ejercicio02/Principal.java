package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		Hotel h = new Hotel("Pepito", "Balcarce 53");

		Habitacion hab1 = new Habitacion(1, 200);
		Habitacion hab2 = new Habitacion(2, 300);

		h.agregarHabitacion(hab1);
		h.agregarHabitacion(hab2);

		Cliente c1 = new Cliente("Jose", 1);

		Adicional adi1 = new Adicional(TipoAdicional.DESAYUNO, 30, "20/07/85");
		Adicional adi2 = new Adicional(TipoAdicional.ROOM_SERVICE, 50, "25/05/1810");

		hab1.ocupar(c1);
		hab1.agregarAdicional(adi1);

		System.out.println("Se realiza el check out de la habitacion 1");
		System.out.println(h.realizarCheckout(1));

		System.out.println("Imprimo habitaciones disponibles:");
		for (Habitacion hab : h.obtenerHabitacionesDisponibles()) {
			System.out.println(hab);
		}
	}
}
