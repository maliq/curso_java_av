package taller2.act2;

class Operacion<T extends Cuenta> implements Runnable{
	private int monto;
	private T cuenta;
	public Operacion(T c, int m){
		monto = m;
		cuenta = c;
	}
	
	public void run() {
		if(monto>0)
			cuenta.depositar(monto);
		else
			cuenta.girar(-monto);
	}
}

