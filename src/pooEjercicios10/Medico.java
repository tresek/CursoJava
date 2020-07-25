package pooEjercicios10;

public class Medico extends Persona {
	private String titulacion;
	private int A�osExperiencia;
	
	public Medico(String titulacion, int A�osExperiencia, String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
		this.titulacion = titulacion;
		this.A�osExperiencia = A�osExperiencia;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public int getA�osExperiencia() {
		return A�osExperiencia;
	}
	
	public void curarLesion() {
		System.out.println("curar las lecciones");
	}
	
	@Override
	public void partidoFutbol() {
		System.out.println("curar lesiones en los partidos");
	}

	@Override
	public void entrenamiento() {
		System.out.println("Da asistencia en entrenamiento");
		
	}
	
	
	
	
	
}
