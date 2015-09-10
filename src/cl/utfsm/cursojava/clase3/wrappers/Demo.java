package cl.utfsm.cursojava.clase3.wrappers;

public class Demo {
	public static void main(String[] args) {
		Object[] arreglo = new Object[5];
		arreglo[0] = new Boolean(true);
		arreglo[1] = new Integer(1);
		arreglo[2] = new Double(2.0);
		arreglo[3] = new Character('c');
		arreglo[4] = new String("hola");
		double valor=0;
		for(int i=0;i<5;i++){
			if(arreglo[i] instanceof Number){
				Number n = (Number) arreglo[i];
				valor+= Math.exp(
 					Math.sqrt(n.doubleValue())+
					Math.log(2*n.doubleValue()));
			}
			System.out.println(i
				+"["+arreglo[i].getClass().getName()+"] = "
				+arreglo[i]);
		}
		System.out.println("Suma: "+valor);

	}
}
