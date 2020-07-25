package exepcione;

// extendemos de la clase padre
public class OperacionDivision extends Exception {
	public OperacionDivision(String mensaje) {
		//haceos el llamado a la clase padre con super, y pasamos el atributo mensaje
		super(mensaje);
	}
}
