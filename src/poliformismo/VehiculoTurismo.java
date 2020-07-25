package poliformismo;

public class VehiculoTurismo extends Vehiculo {
	private int nPuerta;
	
	public VehiculoTurismo(String matricula, String marca, String modelo, int nPuerta) {
		super(matricula, marca, modelo);
		this.nPuerta = nPuerta;
		
	}

	public int getNpuerta() {
		return nPuerta;
	}

	@Override
	public String mostrarDatos() {
		return "Matricula: " + matricula + ", Marca: " + marca + ", Modelo: " + modelo + ", Numero de puerta: " + nPuerta; 
		
	}
	
}
