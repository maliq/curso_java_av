package cl.utfsm.cursojava.clase4;

public class PruebaPrecision {
	public static void main(String[] args) {
		// los floats declados se deben declarar con F
		float a = 1.2F;
		// mientras que los doubles, peuden ser sin anda.
		double b = 1.2;
		
		int c = 3;
		int e = 5;
		
		// cuando se mezclan diferentes tipos, retorna el 
		// de mayor presición
		int d1 = (int) (c/a);
		int d2 = (int) (c * a);
		int d3 = (int) (c + a);
		
		int d4 = c / e;  // aproxima a la parte entera 0.6
		System.out.println(d4);
		
		float c2 = c; 
		float d5 = c2 / e;  // aproxima a la parte entera 0.6
		System.out.println(d5);
		
	}
}
