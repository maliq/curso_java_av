package taller1.act9;

import taller1.act7.Punto;

public class Rectangulo extends Forma implements Cloneable{
	private double ancho;
	private double alto;
	public Rectangulo(Punto arribaIzquerda, double ancho, double alto) {
		super(arribaIzquerda);
		this.ancho = ancho;
		this.alto = alto;
	}
	@Override
	public Punto getCentro() {
		return new Punto(punto.getX() + ancho/2, punto.getY() - alto/2);
	}
	
	protected Object clone() {
		Punto punto = (Punto) super.punto.clone();
		return new Rectangulo(punto,ancho,alto);
	}
	
	
}
