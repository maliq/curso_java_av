package cl.utfsm.cursojava.clase6.hilos;

public class PrintAsync implements Runnable {
	String prefix;

	public PrintAsync(String prefix) {
		this.prefix = prefix;
	}

	@Override
	public void run() {
		for(int i=0; i<=50;i++)
			System.out.println(prefix+i);
	}

}
