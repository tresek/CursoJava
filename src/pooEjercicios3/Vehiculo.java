package pooEjercicios3;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private float precio;
	
	public Vehiculo(String marca, String modelo, float precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public String mostrarDatos() {
		return "la marca es : " + marca+ " y su modelo " + modelo + " con un precio de $ " + precio; 
	}

}
