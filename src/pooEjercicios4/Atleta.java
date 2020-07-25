package pooEjercicios4;

public class Atleta {
	private int numeroAtleta;
	private String nombre;
	private float tiempoCarrera;
	
	
	public Atleta(int numeroAtleta, String nombre, float tiempoCarrera) {
		super();
		this.numeroAtleta = numeroAtleta;
		this.nombre = nombre;
		this.tiempoCarrera = tiempoCarrera;
	}
	
	public float getTiempoCarrera() {
		return tiempoCarrera;
	}
	
	public String mostrarDatosGanador() {
		return "El numero de atleta " +numeroAtleta+ ", nombre " +nombre+ ", con un tiempo de carrera " +tiempoCarrera;
	}
	
	

}
