package ejercicio09;

public class Principal {

	public static void main(String[] args) {
		Aplicacion a = new Aplicacion();

		Artista a1 = new Artista("art01", "Juana la primera");
		Artista a2 = new Artista("art02", "Juana la segunda");
		Artista a3 = new Artista("art03", "Juana la tercera");
		Artista a4 = new Artista("art04", "Juana la cuarta");

		Usuario u1 = new Usuario("pepe01", EstadoUsuario.HABILITADO);
		Usuario u2 = new Usuario("pepe02", EstadoUsuario.PRUEBA_GRATIS);

		a.agregarArtista(a1);
		a.agregarArtista(a2);
		a.agregarArtista(a3);
		a.agregarArtista(a4);

		a.agregarUsuario(u1);
		a.agregarUsuario(u2);

		Cancion ca1 = new Cancion("cancion01", "La primera", 300);
		ca1.agregarLikeDeUsuario(u1);
		ca1.agregarLikeDeUsuario(u2);
		Cancion ca2 = new Cancion("cancion02", "La segunda", 250);
		ca2.agregarLikeDeUsuario(u2);
		Cancion ca3 = new Cancion("cancion03", "La tercera", 150);
		ca3.agregarLikeDeUsuario(u2);
		ca3.agregarLikeDeUsuario(u1);

		Cancion ca4 = new Cancion("cancion04", "La cuarta", 200);
		ca4.agregarLikeDeUsuario(u1);
		Cancion ca5 = new Cancion("cancion05", "La quinta", 450);

		a1.agregarCancion(ca1);
		a1.agregarCancion(ca2);
		a1.agregarCancion(ca3);

		a2.agregarCancion(ca4);
		a2.agregarCancion(ca5);

		System.out.println("\n< < < < < < < MUESTRO LA DURACION PROMEDIO DEL ARTISTA 1 > > > > > > >");
		System.out.println(a1.mostrarDuracionPromedio());

		System.out.println("\n< < < < < < < MUESTRO LA DURACION PROMEDIO DEL ARTISTA 2 > > > > > > >");
		System.out.println(a2.mostrarDuracionPromedio());

//		System.out.println("\n< < < < < < < INTENTO BORRAR AL USUARIO 1 > > > > > > >");
//		System.out.println(a.borrarUsuario("pepe01"));

		System.out.println("\n< < < < < < < ES EL USUARIO 1 FAN DESTACADO DEL ARTISTA 1 > > > > > > >");
		System.out.println(a1.esFanDestacado(u1));
		System.out.println("\n< < < < < < < ES EL USUARIO 2 FAN DESTACADO DEL ARTISTA 2 > > > > > > >");
		System.out.println(a2.esFanDestacado(u2));

		System.out.println("\n< < < < < < < MUESTRO LAS PRIMERAS CANCIONES DEL ARTISTA 1 > > > > > > >");
		for (Cancion c : a1.primerasCanciones()) {
			System.out.println(c);
		}

		System.out.println("\n< < < < < < < MUESTRO LAS PRIMERAS CANCIONES DEL ARTISTA 2 > > > > > > >");
		for (Cancion c : a2.primerasCanciones()) {
			System.out.println(c);
		}

		System.out.println("\n< < < < < < < MUESTRO TODOS LOS USUARIOS > > > > > > >");
		a.mostrarUsuarios();
	}

}
