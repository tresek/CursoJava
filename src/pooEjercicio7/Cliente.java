package pooEjercicio7;

public class Cliente {
	private String nombre;
	private String apellido;
	private String dni;
	Cuenta cuentas [];
	public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.cuentas = cuentas;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getDni() {
		return dni;
	}
	
	public double consultar_saldo(int n) {
		return cuentas[n].getSaldo();
	}
	
	public void ingresar_dinero(int n, double cantidad) {
		cuentas[n].ingesarDinero(cantidad);
	}
	
	public void retirar_dinero(int n, double cantidad) {
		cuentas[n].retirarDinero(cantidad);
	}
	

}