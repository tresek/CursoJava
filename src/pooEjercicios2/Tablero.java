package pooEjercicios2;

public class Tablero {
	private int x;
	private int y;
	private int incremento;

	public Tablero(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void arriba(int incremento) {
		y += incremento;
	}

	public void abajo(int incremento) {
		y -= incremento;
	}

	public void derecha(int incremento) {
		x += incremento;
	}

	public void izquierda(int incremento) {
		x -= incremento;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int gety() {
		return this.y;
	}
	
}
