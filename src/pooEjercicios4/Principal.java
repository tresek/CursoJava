package pooEjercicios4;

import java.util.Scanner;

public class Principal {

	public static int indiceGanador(Atleta atletas[]) {
		float tiempoCarrera;
		int indice = 0;

		tiempoCarrera = atletas[indice].getTiempoCarrera();
		for (int i = 0; i < atletas.length; i++) {
			if (atletas[i].getTiempoCarrera() < tiempoCarrera) {
				tiempoCarrera = atletas[i].getTiempoCarrera();
				indice = i;

			}
		}

		return indice;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre;
		int numeroAtleta, nAtleta, indiceAtletaGanador;
		float tiempoCarrera;

		System.out.println("Ingresa el numero de atletas");
		nAtleta = entrada.nextInt();

		// Crear objetos

		Atleta atletas[] = new Atleta[nAtleta];

		for (int i = 0; i < atletas.length; i++) {
			entrada.nextLine();
			System.out.println("Ingresa los datos de los atletas" + (i + 1));
			System.out.print("Ingresa nombre de Atleta: ");
			nombre = entrada.nextLine();
			System.out.print("Ingresa numero de Atleta: ");
			numeroAtleta = entrada.nextInt();
			System.out.print("Ingresa tiempo de carrera: ");
			tiempoCarrera = entrada.nextFloat();

			atletas[i] = new Atleta(numeroAtleta, nombre, tiempoCarrera);

		}
		indiceAtletaGanador = indiceGanador(atletas);
		System.out.println("Los datos del Atleta ganador es:");
		System.out.println("El ganador es: " + atletas[indiceAtletaGanador].mostrarDatosGanador());

	}

}
