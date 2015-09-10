package cl.utfsm.cursojava.clase3.wrappers;

public class NumerosDemo {
	public static void main(String[] args) {
		Integer pruebaParse;
		Integer uno = new Integer(1);
		String strUno = uno.toString();
		Integer copiaUno = Integer.parseInt(strUno);
		try{
			Float varFloat= Float.parseFloat("1,2");
		}catch(NumberFormatException e){
			System.out.println("Existe un Float que no se pude transformar");
		}
		
		try{
			pruebaParse = Integer.parseInt("asdasd");
			
			
		}catch(NumberFormatException e){
			System.out.println("Existe un Integer que no se pude transformar");
		}catch(UnsupportedOperationException e){
			// nunca se activada, no hay nada que lance esa excepción
			System.out.println("No se pudo eliminar elemento");
		}finally {
			System.out.println("Esto siempre se ejecuta!!");
		}
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
	}
}
