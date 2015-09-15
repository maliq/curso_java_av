package taller1.act5;

import java.util.LinkedList;

public class Cola {
	private LinkedList<Nodo> linkedList;
	
	public Cola() {
		linkedList = new LinkedList<>();
	}
	
	public void agregar(Nodo s) {
		linkedList.addLast(s);
	}
	
	public void remover() {
		linkedList.removeFirst();
	}
	
	public Iterador iterator(){
		return new Iterador();
	}

	public static class Nodo{
		private String s;
		public Nodo(String s) {
			this.s = s;
		}
		
		@Override
		public String toString() {
			return s;
		}
	}
	
	public class Iterador{
		private int index= 0;
		
		public Iterador() {
			index = 0;
		}

		public boolean hasNext() {
			return index < linkedList.size();
		}
	
		public Nodo next() {
			// TODO Auto-generated method stub
			return linkedList.get(index++);
		}
	}
}
