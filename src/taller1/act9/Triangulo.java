package taller1.act9;

import taller1.act7.Punto;

public class Triangulo extends Forma {
	private Punto b;
	private Punto c;

	public Triangulo(Punto a,Punto b, Punto c) {
		super(a);
		this.b =b;
		this.c =c; 
	}

	@Override
	public Punto getCentro() {
		double xCentro = (super.punto.getX() +b.getX() +c.getX())/3;
		double yCentro = (super.punto.getY() +b.getY() +c.getY())/3;
		return new Punto(xCentro, yCentro);
	}

}
