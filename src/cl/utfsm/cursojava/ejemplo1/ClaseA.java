package cl.utfsm.cursojava.ejemplo1;

public class ClaseA implements MiInterfaz {

	@Override
	public void method1() {
		System.out.println("A1");
	}

	@Override
	public int method2() {
		System.out.println("A2");
		return 0;
	}

	@Override
	public String method3() {
		System.out.println("A3");
		return null;
	}

}
