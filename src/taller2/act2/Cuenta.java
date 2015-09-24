package taller2.act2;

public class Cuenta {

	protected int saldo=0;
	public void girar(int monto){
		int s = this.saldo;
		esperar(1);
		s = s - monto;
		this.saldo = s;
		verSaldo();
	}
	public void depositar(int monto){
		int s = this.saldo;
		esperar(3);
		s = s + monto;
		this.saldo = s;
		verSaldo();
	}
	public void verSaldo(){
		System.out.println("Saldo: "+this.saldo);
	}
	
	protected void esperar(int s){
		try {Thread.sleep(s*1000);} catch (InterruptedException e) {}
	}
}
