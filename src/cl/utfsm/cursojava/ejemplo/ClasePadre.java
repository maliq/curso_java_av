package cl.utfsm.cursojava.ejemplo;

public class ClasePadre {
	public int i = 3;

	public static void main(String[] args) {
		ClasePadre clasePadre = new ClasePadre();
		ClaseAnidada anidada = clasePadre.new ClaseAnidada();
		anidada.j = 5;
		anidada.printJ();
	}
	
	public class ClaseAnidada{
		public int j = 4;
		public void printJ() {
			System.out.println(j);
		}
	}
}


