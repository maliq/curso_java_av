package taller1.act5;

public class ColaDemo {

	public static void main(String[] args) {
		Cola cola = new Cola();
		cola.agregar(new Cola.Nodo("primero"));
		cola.agregar(new Cola.Nodo("segundo"));
		cola.agregar(new Cola.Nodo("tercero"));
		
		Cola.Iterador iterador= cola.iterator();
		while(iterador.hasNext()){
			System.out.println(iterador.next());
		}
		cola.remover();
		
		iterador= cola.iterator();
		while(iterador.hasNext()){
			System.out.println(iterador.next());
		}

	}

}
