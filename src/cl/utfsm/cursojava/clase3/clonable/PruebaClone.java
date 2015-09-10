package cl.utfsm.cursojava.clase3.clonable;

import java.util.ArrayList;

public class PruebaClone {

	public static void main(String[] args) {
		Stack stack = new Stack();
		ArrayList list = new ArrayList();
		list.add("obj1");
		list.add("obj2");
		list.add("obj3");
		stack.setItems(list);
		
		System.out.println("Contenido de stack");
		for(Object item: stack.getItems())
			System.out.println(item);
		
		Stack stack2 = (Stack) stack.clone();
		stack2.getItems().clear();
		
		System.out.println("Contenido de stack2");
		for(Object item: stack2.getItems())
			System.out.println(item);
		
		
		System.out.println("Contenido de stack");
		for(Object item: stack.getItems())
			System.out.println(item);
		
		Stack stack3 = stack;
		stack3.getItems().clear();
		
		System.out.println("Contenido de stack");
		for(Object item: stack.getItems())
			System.out.println(item);
		

	}

}
