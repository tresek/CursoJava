package pooEjercicio7;

import java.util.Scanner;

public class Principal {

	public static int buscarNumeroCuenta(Cuenta cuentas[], int n) {
		int i = 0, indice = 0;
		boolean encontrado = false;

		while ((i < cuentas.length) && (encontrado == false)) {
			if (cuentas[i].getNumeroCuenta() == n) {
				encontrado = true;
				indice = i;
			}
			i++;
		}

		if (encontrado == false) {
			indice = -1;
		}

		return indice;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre, apellido, dni;
		int numeroCuenta, nCuentas, opcion, indiceCuenta;
		double saldo, cantidad;
		Cliente cliente;
		Cuenta cuentas[];

		System.out.println("Digite el nombre del cliente: ");
		nombre = entrada.nextLine();
		System.out.println("Digite el apellido del cliente: ");
		apellido = entrada.nextLine();
		System.out.println("Digite el Dni del cliente: ");
		dni = entrada.nextLine();
		System.out.println("Digite el numero de cuenta: ");
		nCuentas = entrada.nextInt();

		cuentas = new Cuenta[nCuentas];

		// Ingresa el numero de cuenta
		for (int i = 0; i < cuentas.length; i++) {
			System.out.print("Digite los datos para cuenta " + (i + 1));
			System.out.print("Digite numero de la cuenta: ");
			numeroCuenta = entrada.nextInt();
			System.out.print("Digite el saldo de la cuenta: ");
			saldo = entrada.nextDouble();

			cuentas[i] = new Cuenta(numeroCuenta, saldo);
		}

		cliente = new Cliente(nombre, apellido, dni, cuentas);

		do {
			System.out.println(":::::::::: MENU :::::::::::::::");
			System.out.println("1.- Ingresar dinero en la cuenta");
			System.out.println("2.- Retirar dinero de la cuenta");
			System.out.println("3.- Consultar saldo de la cuenta");
			System.out.println("4.- Salir");

			System.out.print("Ingrese la opcion");
			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:
				System.out.print("Digite el numero de cuenta");
				numeroCuenta = entrada.nextInt();
				indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);

				if (indiceCuenta == -1) {
					System.out.println("El numero de cuneta no existe");
				} else {
					System.out.println("Ingrese monto a depositar");
					cantidad = entrada.nextDouble();

					cliente.ingresar_dinero(indiceCuenta, cantidad);
					System.out.println("Deposito realizado de forma exitosa");
					System.out.println("Saldo disponible es" + cliente.consultar_saldo(indiceCuenta));

				}
				break;

			case 2:
				System.out.print("Ingrese numero de la cuenta");
				numeroCuenta = entrada.nextInt();
				indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);

				if (indiceCuenta == -1) {
					System.out.println("El numero de cuneta no existe");
				} else {
					System.out.print("Ingrese cantidad a retirar");
					cantidad = entrada.nextDouble();
					
					if(cantidad > cliente.consultar_saldo(indiceCuenta)) {
						System.out.println("Saldo insuficiente");
					}else {
						cliente.retirar_dinero(indiceCuenta, cantidad);
						System.out.print("Retiro realizado de forma exitosa");
						System.out.print("Saldo disponible es" + cliente.consultar_saldo(indiceCuenta));
					}
					
				}
				break;
				
			case 3: 
				System.out.println("Ingrese numero de la cuenta a consultar");
				numeroCuenta = entrada.nextInt();
				indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);

				if (indiceCuenta == -1) {
					System.out.println("El numero de cuneta no existe");
				} else {
					cliente.consultar_saldo(indiceCuenta);
					System.out.print("Consulta realizado de forma exitosa");
				}
				break;
			case 4: break;	
			default: System.out.println("Error, se confundio la opcion");
			}
			System.out.println("");

		} while (opcion != 4);

	}

}
