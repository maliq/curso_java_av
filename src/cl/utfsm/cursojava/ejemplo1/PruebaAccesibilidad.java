package cl.utfsm.cursojava.ejemplo1;

import cl.utfsm.cursojava.ejemplo.Usuario;

public class PruebaAccesibilidad {
	public static void main(String[] args) {
//		Acceso a atributos
		Usuario usuario= new Usuario();
		usuario.nombre = new String("marcelo");
		usuario.login = "maliq";
//		usuario.claveDB = 12345;
		usuario.setClaveDB(12345);
		System.out.println(usuario.getClaveDB());
		
		
//		acceso a métodos
		String nombre = usuario.getNombre();
		System.out.println(nombre);
		
		Usuario usuario2 = new Usuario("con nombre", 123);
		System.out.println("con params: "+ usuario2.getNombre());
		
		Usuario usuario3 = new Usuario();
		System.out.println("sin params: "+ usuario3.getNombre()+ "clave: "+ usuario3.getClaveDB());
		
		Usuario usuario4 = new Usuario("solo nombre");
		System.out.println("solo nombre params: "+ usuario4.getNombre()+ "clave: "+ usuario4.getClaveDB());
		
	}
}
