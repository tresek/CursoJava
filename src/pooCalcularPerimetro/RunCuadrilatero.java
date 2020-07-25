package pooCalcularPerimetro;

public class RunCuadrilatero {

	public static void main(String[] args) {
		Cuadrilatero cuadrilatero = new Cuadrilatero(4, 6);
		float perimetro = cuadrilatero.getPerimetro();
		System.out.println(perimetro);
	}

}
