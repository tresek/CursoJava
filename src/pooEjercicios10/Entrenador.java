package pooEjercicios10;

public class Entrenador  extends Persona{
 private String estrategia;
 
 public Entrenador(String estrategia, String nombre, String apellido, int edad) {
	 super(nombre, apellido, edad);
	 this.estrategia = estrategia;
	 
 }
 
 public String getEstrategia() {
	 return estrategia;
 }

@Override
public void partidoFutbol() {
	System.out.println("Dirige un partido de futbol");
	
}

@Override
public void entrenamiento() {
	System.out.println("Dirige un Entrenamineto");
	
}

public void planificarEntrenamiento() {
	System.out.println("Planificar entrenamiento");
}
 
	
}
