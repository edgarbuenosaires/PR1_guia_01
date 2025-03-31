package ejercicio08;

public class Principal {

	public static void main(String[] args) {
		Empresa e = new Empresa();

		Tablero t1 = new Tablero();
		
		Garaje g1 = new Garaje("Garaje 1", t1);

		e.agregarGaraje(g1);

		Llave l1 = new Llave("AXT 1");
		Vehiculo v1 = new Vehiculo("AXT 1", l1);

		Llave l2 = new Llave("AXT 2");
		Vehiculo v2 = new Vehiculo("AXT 2", l2);

		Llave l3 = new Llave("AXT 3");
		Vehiculo v3 = new Vehiculo("AXT 3", l3);

		Llave l4 = new Llave("AXT 4");
		Vehiculo v4 = new Vehiculo("AXT 4", l4);

		Vehiculo v5 = new Vehiculo("AXT 5", null);

		Vehiculo v6 = new Vehiculo("AXT 6", null);

		g1.agregarVehiculoYLlave(v1, l1);
		g1.agregarVehiculoYLlave(v2, l2);
		g1.agregarVehiculoYLlave(v3, l3);
		g1.agregarVehiculoYLlave(v4, l4);
		g1.agregarVehiculoYLlave(v5, null);

		Persona p1 = new Persona("1111", "Juancito 1 Perez");
		Persona p2 = new Persona("2222", "Juancito 2 Perez");
		Persona p3 = new Persona("3333", "Juancito 3 Perez");
		Persona p4 = new Persona("4444", "Juancito 4 Perez");
		
		v1.agregarPersonaAutorizada(p1);
		v1.agregarPersonaAutorizada(p2);
		v2.agregarPersonaAutorizada(p3);
		v2.agregarPersonaAutorizada(p4);

		System.out.println("\n< < < < < < < INTENTO RETIRAR VEHICULO > > > > > > >");
		System.out.println("los vehiculos estacionados son " + g1.getCantVehiculosEstacionados());
		g1.retirarVehiculo(v1);
		System.out.println("los vehiculos estacionados son " + g1.getCantVehiculosEstacionados());

		System.out.println("\n< < < < < < < INTENTO ESTACIONAR  VEHICULOS: > > > > > > >");
		System.out.println(g1.estacionarVehiculo(v1.getPatente()));
		System.out.println(g1.estacionarVehiculo(v2.getPatente()));
		System.out.println(g1.estacionarVehiculo(v6.getPatente()));

		System.out.println("\n< < < < < < < MUESTRO ESTADO DE LOS GARAJES > > > > > > >");
		for (InformeEstadoGarajes i : e.obtenerInformeEstadoGarajes()) {
			System.out.println(i);
		}

		System.out.println("\n< < < < < < < INTENTO MOSTRAR VEHICULOS ESTACIONADOS SIN LLAVE > > > > > > >");
		e.mostrarVehiculosSinLlave();
		
		System.out.println("\n< < < < < < < INTENTO VERIFICAR SI UN DNI ESTA AUTORIZADO PARA RETIRAR ALGÚN VEHÍCULO > > > > > > >");
		System.out.println(	g1.esPersonaAutorizada("1111"));
		System.out.println(	g1.esPersonaAutorizada("2222"));
		System.out.println(	g1.esPersonaAutorizada("5555"));


	}

}
