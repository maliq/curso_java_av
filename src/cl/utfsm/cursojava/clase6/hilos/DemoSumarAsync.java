package cl.utfsm.cursojava.clase6.hilos;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoSumarAsync {
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		SumarAsync sumarAsync = new SumarAsync(6, 7);
		Future<Integer> resultado=executorService.submit(sumarAsync);
		try {
			System.out.println(resultado.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
