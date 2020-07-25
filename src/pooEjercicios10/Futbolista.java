package pooEjercicios10;

public class Futbolista extends Persona {
	private int dorsal;
	private String posicion;
	
	public Futbolista(int dorsal, String posicion, String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
		this.dorsal = dorsal;
		this.posicion = posicion;
	}

	public int getDorsal() {
		return dorsal;
	}

	public String getPosicion() {
		return posicion;
	}
	
	@Override
	public void partidoFutbol() {
		System.out.println("Juega partido de futbol");
	}
	
	@Override
	public void entrenamiento() {
		System.out.println("entrena");
	}
	
	public void entrevista() {
		System.out.println("entrevista");
	}

	
	
	
}
