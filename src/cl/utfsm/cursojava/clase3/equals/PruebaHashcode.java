package cl.utfsm.cursojava.clase3.equals;

public class PruebaHashcode {

	public static void main(String[] args) {
		Persona persona = new Persona();
		persona.setRol("profesor");
		Persona persona2 = new Persona();
		persona2.setRol("profesor");
		System.out.println("hash p1: "+ persona.hashCode());
		System.out.println("hash p2: "+ persona2.hashCode());
		System.out.println("hash p1 vs p2: "+ (persona.hashCode() == persona2.hashCode()));
	}
}
