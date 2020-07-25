package poliformismo;

public class Principal {

	public static void main(String[] args) {
//		Vehiculo misVehiculos [] = new Vehiculo [4];
//		misVehiculos[0] = new Vehiculo("GT342","Toyota", "GT");
//		misVehiculos[1] = new VehiculoDeportivo("GS1313", "Nissan", "N543", 800);
//		misVehiculos[2] = new VehiculoFurgoneta(300, "YU76", "Audi", "AA560");
//		misVehiculos[3] = new VehiculoTurismo("UI435", "Renout", "ZA71", 4);
//		
//		for(Vehiculo autos: misVehiculos) {
//			System.out.println(autos.mostrarDatos());
//		}
//		
		
		//Ejemplo de Upcasting
		Vehiculo vehiculo = new VehiculoTurismo("UI435", "Renout", "ZA71", 4);
		System.out.println(vehiculo.mostrarDatos());
		
	}

}
