package taller1.act7;

public class DemoPuntoEtiquetado {

	public static void main(String[] args) {
		PuntoEtiquetado punto1 = new PuntoEtiquetado(3, 2, "a");
		PuntoEtiquetado punto2 = new PuntoEtiquetado(2, 3, "a");
		PuntoEtiquetado punto3 = new PuntoEtiquetado(3, 2, "b");
		PuntoEtiquetado punto4 = new PuntoEtiquetado(3, 2, "a");
		
		System.out.println("1 eq 2:"+punto1.equals(punto2));
		System.out.println("1 == 2:"+(punto1.hashCode()== punto2.hashCode()));
		System.out.println("1 eq 3:"+punto1.equals(punto3));
		System.out.println("1 == 3:"+(punto1.hashCode()== punto3.hashCode()));
		System.out.println("1 eq 4:"+punto1.equals(punto4));
		System.out.println("1 == 4:"+(punto1.hashCode()== punto4.hashCode()));
	}

}
