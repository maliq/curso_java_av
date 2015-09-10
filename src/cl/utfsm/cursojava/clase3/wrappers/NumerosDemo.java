package cl.utfsm.cursojava.clase3.wrappers;

public class NumerosDemo {
	public static void main(String[] args) {
		Integer uno = new Integer(1);
		String strUno = uno.toString();
		Integer copiaUno = Integer.parseInt(strUno);
		Integer pruebaParse = Integer.parseInt("46476");
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
	}
}
