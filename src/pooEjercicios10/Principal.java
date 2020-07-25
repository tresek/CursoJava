package pooEjercicios10;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	static ArrayList<Persona> persona = new ArrayList<Persona>();
	static Scanner leer = new Scanner(System.in);

//Tipo de metamorfismo
	static Persona futbolista1 = new Futbolista(9, "delantero", "Gonzalo", "Higuain", 29);
	static Persona futbolista2 = new Futbolista(21, "delantero", "Paulo", "Dybala", 23);
	static Persona entrenador = new Entrenador("defensiva", "Edduardo", "Bombalet", 49);
	static Persona medico = new Medico("Kinesiologo", 10, "Juan", "Mora", 50);

	public static void main(String[] args) {
		// se agregan los metodos al arreglo persona
		persona.add(futbolista1);
		persona.add(futbolista2);
		persona.add(entrenador);
		persona.add(medico);
		menu();

	}

	public static void menu() {
		int option;
		do {
			System.out.println(":::::::::: Menu :::::::::::");
			System.out.println("1.- Viaje de equipo");
			System.out.println("2.- Entrenamiento");
			System.out.println("3.- Partido de futbol");
			System.out.println("4.- Planificar entrenamiento");
			;
			System.out.println("5.- Entrevista");
			System.out.println("6.- Curar Lesion ");
			System.out.println("7.- Salir");
			System.out.println("Ingrese el numeor de la opcion");
			option = leer.nextInt();

			switch (option) {
			case 1:
				System.out.println("");
				viajarEquipo();
				break;
			case 2: System.out.println("");
				entrenarEquipo();
				break;
			case 3: // partido de futbol
				break;
			case 4: // planificar entrenamiento
				break;
			case 5: // entrevista;
				break;
			case 6: // curara lesion
				break;
			case 7:
				break;
			default:
				System.out.println("Error,  Se equivoco en la opcion de menu");

			}

		} while (option != 7);
	}

	public static void viajarEquipo() {
		for (Persona equipo : persona) {
			System.out.println(equipo.getNombre() + " " + equipo.getApellido());
			equipo.viajar();
		}

	}

	public static void entrenarEquipo() {
		for (Persona equipo : persona) {
			System.out.println(equipo.getNombre() + " " + equipo.getApellido());
			equipo.entrenamiento();
		}
	}

}
