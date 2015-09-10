package cl.utfsm.cursojava.clase3.string;

public class CharacterDemo {

	public static void main(String[] args) {
		Character a = new Character('a');
		Character a2 = new Character('a');
		Character b = new Character('b');
		int diferencia = a.compareTo(b);
		if (diferencia == 0)
			System.out.println("a es igual a b.");
		else if (diferencia < 0)
			System.out.println("a es menor que b.");
		else if (diferencia > 0)
			System.out.println("a es mayor que b.");
		
		System.out.println("resultado de compareTo: "+ diferencia);
		
		if (a.compareTo(a2) == 0){
			System.out.println("a es igual a a2.");
		} else{
			System.out.println("a es distinto a a2.");
		}
		
		if (Character.isUpperCase(a.charValue())){
			System.out.println("El caracter" + a.toString() + "es mayúscula");
		} else{
			System.out.println("El caracter" + a.toString() + "es minúscula");
		}
	}
}
