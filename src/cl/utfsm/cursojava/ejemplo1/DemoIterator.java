package cl.utfsm.cursojava.ejemplo1;

import java.util.Iterator;

public class DemoIterator implements Iterator<Object> {

	private String[] cartas = {"2", "3", "4", "5", "6", "7",
		"8", "9", "10", "Sota", "Reina", "Rey", "As" };

	private int actual= 0;
	
	@Override
	public boolean hasNext() {
		if(actual == cartas.length)
			return false;
		else{
			return true;
		}
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		//String carta = cartas[actual];
		//actual++;
		//return carta;
		return cartas[actual++];
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
	
	public static void main(String[] args) {
		DemoIterator demoIterator= new DemoIterator();
		while(demoIterator.hasNext()){
			System.out.println(demoIterator.next());
		}
	}

}
