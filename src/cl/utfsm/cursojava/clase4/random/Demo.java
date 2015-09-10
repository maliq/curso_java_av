package cl.utfsm.cursojava.clase4.random;

import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

public class Demo {
public static void main(String[] args) {
	Vector v = new Vector();
	Random r = new Random(100);
	for(int k=0;k<1000;k++){                        
		Double d=new Double(r.nextDouble());
		v.add(d);
	}
	Enumeration e = v.elements();
	double prom=0;
	int cont=0;
	while(e.hasMoreElements()){
		Double d=(Double)e.nextElement();
		prom+=d.doubleValue();
		cont++;
	}
	prom=prom/cont;
	System.out.println("Promedio : "+prom);

}
}
