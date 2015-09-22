package cl.utfsm.cursojava.clase6.hilos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoPrintAsync {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		PrintAsync task1 = new PrintAsync("a");
		PrintAsync task2 = new PrintAsync("b");
		executorService.execute(task1);
		executorService.execute(task2);
	}

}
