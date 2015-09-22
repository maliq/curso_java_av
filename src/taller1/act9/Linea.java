package taller1.act9;

import taller1.act7.Punto;

public class Linea extends Forma {
	private Punto hasta;

	public Linea(Punto desde, Punto hasta) {
		super(desde);
		this.hasta = hasta;
	}

	@Override
	public Punto getCentro() {
		double xCentro = (super.punto.getX() +hasta.getX())/2;
		double yCentro = (super.punto.getY() +hasta.getY())/2;
		return new Punto(xCentro, yCentro);
	}

}
