package pooEjercicios10;

public class Medico extends Persona {
	private String titulacion;
	private int AñosExperiencia;
	
	public Medico(String titulacion, int AñosExperiencia, String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
		this.titulacion = titulacion;
		this.AñosExperiencia = AñosExperiencia;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public int getAñosExperiencia() {
		return AñosExperiencia;
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
