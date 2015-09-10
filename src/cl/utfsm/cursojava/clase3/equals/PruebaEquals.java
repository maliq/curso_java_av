package cl.utfsm.cursojava.clase3.equals;

public class PruebaEquals {

	public static void main(String[] args) {
		Persona persona = new Persona();
		persona.setRol("profesor");
		Persona persona2 = new Persona();
		persona2.setRol("profesor");
		System.out.println("vs p2: "+ persona.equals(persona2));
		System.out.println("vs p1: "+ persona2.equals(persona));
		System.out.println("p1 == p2: "+ (persona2 == persona));
		System.out.println("vs null: "+ persona.equals(null));
		System.out.println("vs si mismo: "+ persona.equals(persona));
		
		
		
		// igualdad e identicos con Integer
		Integer Un = new Integer(1), otroUn = new Integer(1);
		if (Un.equals(otroUn))
			System.out.println("objetos son iguales");
		if(Un == otroUn)
			System.out.println("objetos son idénticos");
		otroUn = Un;
		if(Un == otroUn)
			System.out.println("'Ahora!' objetos son idénticos");

	}

}
