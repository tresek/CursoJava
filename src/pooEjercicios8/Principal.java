package pooEjercicios8;

import java.util.Scanner;

public class Principal {

	public static int buscarPaquete(Paquete t[], int numeroPaquete, int contadorPaquete) {
		int indice = 0;
		boolean encontrado = false;
		for (int i = 0; i < contadorPaquete; i++) {
			if (t[i].getNumeroPaquete() == numeroPaquete) {
				encontrado = true;
				indice = i;
			}
		}
		if (encontrado == false) {
			indice = -1;
		}
		return indice;
	}

	public static int buscarSucursal(Sucursal t[], int numeroSucursal, int contadorSucursal) {
		int indice = 0;
		boolean encontrado = false;
		for (int i = 0; i < contadorSucursal; i++) {
			if (t[i].getNumeroSucursal() == numeroSucursal) {
				encontrado = true;
				indice = i;
			}
		}
		if (encontrado == false) {
			indice = -1;
		}
		return indice;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroSucursal, numeroPaquete, prioridad, opcion;
		int contadorSucursal = 0, contadorPaquete = 0, indiceSucursal, indicePaquete;
		String ciudad, direccion, dni;
		double peso, precioPaquete;
		// declaracion de arreglos
		Sucursal sucursal[] = new Sucursal[50];
		Paquete paquete[] = new Paquete[100];

		do {
			System.out.println("::::::::::::: MENU :::::::::::::::::");
			System.out.println("1.- Crear una nueva secursal");
			System.out.println("2.- Enviar Paquete");
			System.out.println("3.- Consultar sucursal");
			System.out.println("4.- Consultar paquete");
			System.out.println("5.- Mostrar todas las sucursales");
			System.out.println("6.- Mostrar todos los paquetes");
			System.out.println("7.- Salir");

			System.out.println("Ingresa una opcion: ");
			opcion = entrada.nextInt();
			switch (opcion) {
			case 1:
				System.out.print("Digite numero de sucursal: ");
				numeroSucursal = entrada.nextInt();
				entrada.nextLine();
				System.out.print("Digite direccion: ");
				direccion = entrada.nextLine();
				System.out.print("Digite ciudad: ");
				ciudad = entrada.nextLine();

				sucursal[contadorSucursal] = new Sucursal(numeroSucursal, direccion, ciudad);
				contadorSucursal++;
				break;

			case 2:
				System.out.println("Digite el numero de sucursal");
				numeroSucursal = entrada.nextInt();
				entrada.nextLine();
				indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);

				if (indiceSucursal == -1) {
					System.out.println("La sucursal no existe");
				} else {
					System.out.print("Ingresa el numero de paquete");
					numeroPaquete = entrada.nextInt();
					System.out.print("Ingresa el dni de la persona");
					dni = entrada.nextLine();
					numeroPaquete = entrada.nextInt();
					System.out.print("Ingrese el peso del paquete");
					peso = entrada.nextDouble();
					System.out.print("Ingresa la prioridad (0=normal, 1=alta, 2=express) ");
					prioridad = entrada.nextInt();

					paquete[contadorPaquete] = new Paquete(numeroPaquete, dni, peso, prioridad);
					precioPaquete = sucursal[indiceSucursal].calcular_precio(paquete[contadorPaquete]);
					System.out.println("El precio del paquete es " + precioPaquete);

					contadorPaquete++;
				}
				break;
			case 3:
				System.out.print("ingrese el numero de sucursal: ");
				numeroSucursal = entrada.nextInt();
				indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);

				if (indiceSucursal == -1) {
					System.out.println("La sucursal no existe");
				} else {
					System.out.println("Los datos de la sucursal son: ");
					System.out.println(sucursal[indiceSucursal].mostrarDatos());
				}
				break;

			case 4:
				System.out.print("Ingrese numero de paquete ");
				numeroPaquete = entrada.nextInt();

				indicePaquete = buscarPaquete(paquete, numeroPaquete, contadorPaquete);
				if (indicePaquete == -1) {
					System.out.println("El numero de paquete no existe");
				} else {
					System.out.println("Los datos del paquete son: ");
					System.out.println(paquete[indicePaquete].mostrarDatosPaquetes());
				}
				break;

			case 5:
				for (int i = 0; i < contadorSucursal; i++) {
					System.out.println("Los datos de sucursales" + (i + 1));
					System.out.println(sucursal[i].mostrarDatos());
				}
				break;

			case 6:
				for (int i = 0; i < contadorPaquete; i++) {
					System.out.println("Los datos de los paquetes" + (i + 1));
					System.out.println(paquete[i].mostrarDatosPaquetes());
				}
				break;
			case 7: break;
				default: System.out.println("Opcion ingresada incorrecta");
			}
			System.out.println("");
		} while (opcion != 7);

	}

}
