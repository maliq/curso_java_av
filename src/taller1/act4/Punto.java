package taller1.act4;

public class Punto {
	private int x;
	private int y;
	
	public Punto() {
		x = 0;
		y = 0;
	}

	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void trasladar(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void escalar(int factor) {
		x *= factor;
		y *= factor;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
}
