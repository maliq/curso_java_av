package taller2.act2;

public class DemoOperacion {

	public DemoOperacion() {
		// TODO Auto-generated constructor stub
	}
	
	public void operacion(){
		Cuenta cuenta = new Cuenta();
		cuenta.depositar(1000);
		Thread t1,t2;
		Operacion<Cuenta> op1 = new Operacion<>(cuenta, 100);
		Operacion<Cuenta> op2 = new Operacion<>(cuenta, -100);
		t1 = new Thread(op1);
		t2 = new Thread(op2);

		t1.start();
		t2.start();
	}
	
	public void operacionSync(){
		CuentaSync cuenta = new CuentaSync();
		cuenta.depositar(1000);
		Thread t1,t2;
		Operacion<CuentaSync> op1 = new Operacion<>(cuenta, 100);
		Operacion<CuentaSync> op2 = new Operacion<>(cuenta, -100);
		t1 = new Thread(op1);
		t2 = new Thread(op2);

		t1.start();
		t2.start();
	}
	
	public static void main(String[] args) {
		DemoOperacion demoOperacion = new DemoOperacion();
//		demoOperacion.operacion();
		demoOperacion.operacionSync();

	}

}
