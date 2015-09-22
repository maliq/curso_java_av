package cl.utfsm.cursojava.clase6.hilos;

import java.util.concurrent.Callable;

public class SumarAsync implements Callable<Integer>{

	private int a;
	private int b;

	public SumarAsync(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return a+b;
	}

}
