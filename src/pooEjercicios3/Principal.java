package pooEjercicios3;

import java.util.Scanner;

public class Principal {
	public static int indiceCocheMBarato(Vehiculo coches[]) {
		float precio;
		int indice = 0;
		
		precio = coches[0].getPrecio();
		for(int i=0; i< coches.length; i++) {
			if(coches[i].getPrecio() < precio) {
				precio = coches[i].getPrecio();
				indice = i;
			}
		}
		
		return indice;
	}
	
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String marca, modelo;
		float precio;
		int numeroVehiculo, indiceBarato;
		
		System.out.print("Digite numero de vehiculos");
		numeroVehiculo = entrada.nextInt();
		
		//se crea objeto
		Vehiculo coches[] = new Vehiculo [numeroVehiculo];
		
		for(int i=0; i < coches.length; i++ ) {
			entrada.nextLine();
			System.out.println("Ingresa caracteristicas del cache" + ( i+1));
			System.out.print("Ingresa la marca: ");
			marca = entrada.nextLine();
			System.out.print("Ingresa modelo: ");
			modelo = entrada.nextLine();
			System.out.print("Ingresa precio: ");
			precio = entrada.nextInt();
			
			coches[i] = new Vehiculo(marca, modelo, precio);
		}
		
		indiceBarato = indiceCocheMBarato(coches); 
		System.out.println("El auto más barato es: ");
		System.out.println(coches[indiceBarato].mostrarDatos());
	}

}
