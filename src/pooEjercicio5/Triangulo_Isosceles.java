package pooEjercicio5;

public class Triangulo_Isosceles {
	private double base;
	private double lado;
	
	public Triangulo_Isosceles(double base, double lado) {
		super();
		this.base = base;
		this.lado = lado;
	}
	
	public double obtenerPerimetro() {
		double perimetro = 2 * lado + base;
		return perimetro;
	}
	
	public double obtenerArea() {
		return lado * base;
	}
	
	public double mostrarDatos() {
		double area = 
		return "La base es: " + base + lado;
	}

}
