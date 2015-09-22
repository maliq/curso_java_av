package taller1.act9;

import java.io.Serializable;

import taller1.act7.Punto;

public class Circulo extends Forma implements Cloneable{
	private double radio; 
	
	public Circulo(Punto punto) {
		super(punto);
		// TODO Auto-generated constructor stub
	}

	public Circulo(Punto centro, double radio) {
		super(centro);
		this.radio = radio;
	}

	@Override
	public Punto getCentro() {
		return punto;
	}
	
	protected Object clone() {
		Punto punto = (Punto) super.punto.clone();
		return new Circulo(punto,radio);
	}
	
	
	
	

}
