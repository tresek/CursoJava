package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class UsoEmpleado {

	public static void main(String[] args) {
		ArrayList <Empleado> listaEmpleados = new ArrayList <Empleado>();
		listaEmpleados.add(new Empleado("Freddy", 38, 13456));
		listaEmpleados.add(new Empleado("Rosa", 38, 343));
		listaEmpleados.add(new Empleado("Catalina", 19, 3456));
		listaEmpleados.add(new Empleado("Laura", 6, 2324));
		listaEmpleados.add(new Empleado("Juan", 43, 9887));
		listaEmpleados.add(new Empleado("mario", 16, 4346));
		System.out.println(listaEmpleados.size());
		
		// Recorrer Array con un Iterator
		Iterator <Empleado> mi_iterator = listaEmpleados.iterator();
		while(mi_iterator.hasNext()) {
			System.out.println(mi_iterator.next().dameDatos());
		}
		
		
		/*
		 		 
		for(Empleado e:listaEmpleados) {
			System.out.println(e.dameDatos());
		}
		
		
		// Se crea un array y luego se pasan los datos a la nuevo Array
		Empleado arrayEmpleados [] = new Empleado [listaEmpleados.size()];
		listaEmpleados.toArray(arrayEmpleados);
		
		for(int i=0; i < arrayEmpleados.length; i++) {
			System.out.println(arrayEmpleados[i].dameDatos());
		}
		 */
	}

}

class Empleado{
	private String nombre;
	private int edad;
	private double salario;
	
	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	public String dameDatos() {
		return "El empleado se llama: " + nombre + ", Tiene " + edad + ", Y un salario de: " + salario;
	}
}
