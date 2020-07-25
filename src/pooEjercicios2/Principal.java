package pooEjercicios2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Tablero tablero;
		int x, y, opcion;
		int incremento = 0;

		System.out.println("Ingrese las coordenadas de X");
		x = scan.nextInt();
		System.out.println("Ingrese las coordenadas de Y");
		y = scan.nextInt();
		
		tablero = new Tablero(x, y);

		do {
			System.out.println("\n\t.:MENU:.");
			System.out.println("1.- MOVER HACIA ARRIBA");
			System.out.println("2.- MOVER HACIA ABAJO");
			System.out.println("3.- MOVER HACIA DERECHA");
			System.out.println("4.- MOVER HACIA LA IZQUIERDA");
			System.out.println("5.- SALIR");
			System.out.println("DIGITE LA OPCION");
			opcion = scan.nextInt();

			if (opcion != 5) {
				System.out.println("Digite la cantidad de espacios a moverse");
				incremento = scan.nextInt();
			}

			switch (opcion) {
			case 1: tablero.arriba(incremento);
			break;
			case 2: tablero.abajo(incremento);
			break;
			case 3: tablero.derecha(incremento);
			break;
			case 4: tablero.arriba(incremento);
			break;
			case 5: break;
			default: System.out.println("Debes ingresar opciones del 1 al 5 ");
			}
			System.out.println("Posicion actual de (X, Y): (" + tablero.getX()+ ", "+
			tablero.gety()+ ")");

		} while (opcion != 5);
				
		
	}

}
