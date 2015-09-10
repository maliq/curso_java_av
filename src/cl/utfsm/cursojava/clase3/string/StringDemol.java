package cl.utfsm.cursojava.clase3.string;

public class StringDemol {

	public static void main(String[] args) {
		String palindrome = " recocer ";
		int largo = palindrome.length();
		
		StringBuffer destino = new StringBuffer(largo);
		
		for (int i = (largo - 1); i >= 0; i--) {
			destino.append(palindrome.charAt(i));
		}
		
		System.out.println(destino.toString());
		if(palindrome.equals(destino.toString())){
			System.out.println("es palindrome");
		}
		
		String holo = "holo";
		int primero = holo.indexOf('o');
		int ultimo = holo.lastIndexOf('o');
		System.out.println("primero: "+ primero);
		System.out.println("último: "+ ultimo);
		
		primero = holo.indexOf('o',2);
		ultimo = holo.lastIndexOf('o',2);
		System.out.println("primero: "+ primero);
		System.out.println("último: "+ ultimo);
		
		primero = holo.indexOf("o",2);
		ultimo = holo.lastIndexOf("o",2);
		System.out.println("primero: "+ primero);
		System.out.println("último: "+ ultimo);
		
		System.out.println("Hola".concat(" Mundo"));
		
		destino.append(3);
		destino.insert(3, "X");
		destino.delete(5, 7);
		System.out.println(destino.toString());
		
	}
	

}
