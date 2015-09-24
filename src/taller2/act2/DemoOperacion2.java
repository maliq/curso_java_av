package taller2.act2;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class DemoOperacion2 {

	public DemoOperacion2() {
		// TODO Auto-generated constructor stub
	}
	
	public void operacion(){
		Cuenta cuenta = new Cuenta();
		cuenta.depositar(1000);
		Operacion<Cuenta> op1 = new Operacion<>(cuenta, 100);
		Operacion<Cuenta> op2 = new Operacion<>(cuenta, -100);
		
		Executor executor = Executors.newFixedThreadPool(2);
		executor.execute(op1);
		executor.execute(op2);
	}
	
	public void operacionSync(){
		CuentaSync cuenta = new CuentaSync();
		cuenta.depositar(1000);
		Operacion<CuentaSync> op1 = new Operacion<>(cuenta, 100);
		Operacion<CuentaSync> op2 = new Operacion<>(cuenta, -100);
		Executor executor = Executors.newFixedThreadPool(2);
		executor.execute(op1);
		executor.execute(op2);
	}
	
	public void operacionForceSync(){
		Cuenta cuenta = new Cuenta();
		cuenta.depositar(1000);
		Operacion<Cuenta> op1 = new Operacion<>(cuenta, 100);
		Operacion<Cuenta> op2 = new Operacion<>(cuenta, -100);
		Executor executor = Executors.newFixedThreadPool(1);
		executor.execute(op1);
		executor.execute(op2);
	}
	
	public static void main(String[] args) {
		DemoOperacion2 demoOperacion = new DemoOperacion2();
//		demoOperacion.operacion();
//		demoOperacion.operacionSync();
		demoOperacion.operacionForceSync();

	}

}
