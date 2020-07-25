package herencia;

public class Estudiante extends Persona {
	private int codigoEstudiante;
	private float notaFinal;
	
	public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
		// estos son atributos que ya estan  iniciados en clase Persona
		super(nombre, apellido, edad);
		this.codigoEstudiante = codigoEstudiante;
		this.notaFinal = notaFinal;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre " + getNombre() + ", Apellido " + getApellido() + 
				", Edad " + getEdad() + ", Codigo Estudiante " + codigoEstudiante + ", Nota Final " + notaFinal);
	}

}
