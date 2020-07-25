package exepcione;

public class Division {
	private int numerador;
	private int denominador;
	
	public Division(int numerador, int denominador) throws OperacionDivision  {
		if(denominador == 0) {
			throw new OperacionDivision ("Denominador es igual a cero");
		}
			
		
		this.denominador = denominador;
		this.numerador = numerador;
		
		
	}

}
