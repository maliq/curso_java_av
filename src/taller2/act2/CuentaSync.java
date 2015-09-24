package taller2.act2;

public class CuentaSync extends Cuenta{

	public synchronized void girar(int monto){
		int s = this.saldo;
		esperar(1);
		s = s - monto;
		this.saldo = s;
		verSaldo();
	}
	public synchronized void depositar(int monto){
		int s = this.saldo;
		esperar(3);
		s = s + monto;
		this.saldo = s;
		verSaldo();
	}
}
