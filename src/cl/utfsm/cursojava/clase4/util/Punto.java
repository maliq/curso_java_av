package cl.utfsm.cursojava.clase4.util;

public class Punto implements Comparable{
	int x;
	int y;
	
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
		@Override
		public int compareTo(Object o) {
			if(o instanceof Punto){
				Punto otro = (Punto) o;
				return this.x - otro.x;
			}else
				throw new IllegalArgumentException();
		}

		@Override
		public String toString() {
			return "Punto [x=" + x + ", y=" + y + "]";
		}
}
