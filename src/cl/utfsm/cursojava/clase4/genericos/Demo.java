package cl.utfsm.cursojava.clase4.genericos;

import java.util.ArrayList;

import cl.utfsm.cursojava.ejemplo.Alumno;

public class Demo {

	public static void main(String[] args) {
		
		// antes de java 5
		ArrayList list = new ArrayList();
		list.add("uno");
		//es permitido mezclar tipos
		//list.add(new Alumno("", 2));
		list.add("dos");
		
		String retorno = (String) list.get(0);
		
		// despues de java 5
		ArrayList<String> list1 = new ArrayList<>();
//		list1.add(new Alumno("", 2));
		list1.add("dos");
		retorno = list1.get(0);
		

	}

}
