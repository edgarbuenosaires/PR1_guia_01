package ejercicio10;

public class Principal {

	public static void main(String[] args) {
		CasaDeJuego casino = new CasaDeJuego();

		Juego j1 = new Juego("Chinchon");
		Juego j2 = new Juego("Truco");
		casino.agregarJuego(j1);
		casino.agregarJuego(j2);

		Mesa m1 = new Mesa(1, 3);
		Mesa m2 = new Mesa(2, 4);
		Mesa m3 = new Mesa(3, 3);
		Mesa m4 = new Mesa(4, 4);

		j1.agregarMesa(m1);
		j1.agregarMesa(m2);
		j2.agregarMesa(m3);
		j2.agregarMesa(m4);

		for (DisponibilidadJuegos juego : casino.obtenerDisponibilidadJuegos()) {
			System.out.println(juego);
		}

		System.out.println(casino.acomodarJugador("Juan", 25, "Truco"));
		System.out.println(casino.acomodarJugador("Juan", 35, "Truco"));
		System.out.println(casino.acomodarJugador("Juan", 35, "Truco"));
		System.out.println(casino.acomodarJugador("Juan", 35, "Truco"));
		System.out.println(casino.acomodarJugador("Juan", 35, "Truco"));
		System.out.println(casino.acomodarJugador("Juan", 35, "Truco"));
		System.out.println(casino.acomodarJugador("Juan", 35, "Truco"));
		System.out.println(casino.acomodarJugador("Juan", 35, "Truco"));
		System.out.println(casino.acomodarJugador("María", 25, "Chinchon"));
		System.out.println(casino.acomodarJugador("Juan", 40, "Ajedrez"));

		for (DisponibilidadJuegos juego : casino.obtenerDisponibilidadJuegos()) {
			System.out.println(juego);
		}

		casino.generarCartas();

		casino.repartirCartas();

	}

}
