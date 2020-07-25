package pooEjercicio7;

public class Cuenta {
	private int numeroCuenta;
	private double saldo;
	
	public Cuenta(int numeroCuenta, double saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void ingesarDinero(double cantidad) {
		saldo += cantidad;
	}

	public double getSaldo() {
		return saldo;
	}

	public void retirarDinero(double cantidad) {
		saldo -=  cantidad;
	}
	
	
	
	
}
