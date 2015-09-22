package taller1.act9;

import taller1.act7.Punto;

public abstract class Forma {
	protected Punto punto;
	
	public Forma(Punto punto) {
		super();
		this.punto = punto;
	}
	
	public void mover(double dx, double dy){
		punto = new Punto(punto.getX()+dx, punto.getY()+dy);
	}
	
	public abstract Punto getCentro();
}
