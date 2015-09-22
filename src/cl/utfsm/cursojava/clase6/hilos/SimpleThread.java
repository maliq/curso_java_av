package cl.utfsm.cursojava.clase6.hilos;

public class SimpleThread extends Thread {
		public SimpleThread(String str) {
			super(str);
		}

		public void run() {
			for (int i = 0; i < 10; i++)
				System.out.println("Este es el thread : " + getName());
		}

		public static void main(String args[]){
			SimpleThread miThread = new SimpleThread("1--- Hilo de prueba");
			SimpleThread thread2 = new SimpleThread("2--- Hilo de prueba");
			miThread.start();
			thread2.start();
		}
	}
