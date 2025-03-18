package ejercicio07bis;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Portal portal = new Portal();
		Producto p1 = new Producto("Libro 1", 20.50, 10);
		Producto p2 = new Producto("Libro 1", 20.50, 10);
		Producto p3 = new Producto("Libro 1", 20.50, 10);
		Producto p4 = new Producto("Libro 1", 20.50, 10);
		Producto p5 = new Producto("Libro 1", 20.50, 10);
		Producto p6 = new Producto("Libro 1", 20.50, 10);
		Producto p7 = new Producto("Libro 1", 20.50, 10);
		Producto p8 = new Producto("Libro 1", 20.50, 10);
		Producto p9 = new Producto("Libro 1", 20.50, 10);

		portal.agregarProducto(p1);
		portal.agregarProducto(p2);
		portal.agregarProducto(p3);
		portal.agregarProducto(p4);
		portal.agregarProducto(p5);
		portal.agregarProducto(p6);
		portal.agregarProducto(p7);
		portal.agregarProducto(p8);
		portal.agregarProducto(p9);

		Cliente cli1 = new Cliente("Jose", "Perez", "La Direccion 32", "pepe@pepe.com", "123456");
		portal.agregarCliente(cli1);

		Pedido ped1 = new Pedido("30/07/2025", "15:45", Estado.PENDIENTE);

		Item item1 = new Item("Libro 1", 2);
		Item item2 = new Item("Libro 2", 3);

		ped1.agregarItem(item1);
		ped1.agregarItem(item2);

		cli1.agregarPedido(ped1);

		System.out.println("Intento procesar un pedido");
		ArrayList<Producto> productosFaltantes = portal.procesarPedido(cli1);

		for (Producto prod : productosFaltantes) {
			System.out.println(prod);
		}

		System.out.println("Intento confirmar el pedido");
		cli1.confirmarPedido();
	}

}
