package taller1.act7;

public class Punto implements Cloneable{
	protected double x;
	protected double y;
	
	
	
	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public Object clone(){
		return this.clone();
	}
	
	
}
