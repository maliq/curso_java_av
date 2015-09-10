package cl.utfsm.cursojava.clase4.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoSort {
	
	public static void main(String[] args) {
		List<Punto> puntos = new ArrayList<>();
		for(int i=0;i<5;i++){
			puntos.add(new Punto(2*i,i*i));
		}
		Collections.sort(puntos);
		for(int i=0;i<5;i++)
			System.out.println(puntos.get(i));

	}

}
