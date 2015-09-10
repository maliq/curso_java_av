package cl.utfsm.cursojava.clase3.clonable;

import java.util.ArrayList;

public class Stack implements Cloneable{
	private ArrayList items;
	public ArrayList getItems() {
		return items;
	}
	public void setItems(ArrayList items) {
		this.items = items;
	}
	//  código de los métodos y constructor de Stack
	protected Object clone() {
		try {
			// clona el stack
			Stack s = (Stack) super.clone();
			// clona el vector
			s.items = (ArrayList) items.clone(); 		
			// return the clone
			return s;
		} catch (CloneNotSupportedException e) {
			// esto no debiera suceder
			 throw new InternalError();
		}
	}

}
