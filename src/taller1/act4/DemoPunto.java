package taller1.act4;

public class DemoPunto {

	public static void main(String[] args) {
		Punto punto =new Punto(1,1);
		punto.trasladar(2, 4);
		
		Punto punto2 =new Punto(1,1);
		punto2.escalar(6);
		
		System.out.println(punto);
		System.out.println(punto2);
	}

}
