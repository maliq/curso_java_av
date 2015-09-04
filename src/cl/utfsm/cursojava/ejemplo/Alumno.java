package cl.utfsm.cursojava.ejemplo;

public class Alumno extends Usuario {
	public int promedio;
	
	public Alumno(String nom, int promedio) {
		super(nom);
		this.promedio = promedio;
	}
	
	//@Override
	public void login() {
		super.login();
		System.out.println("Se logeo un alumno");
	}
	
	public void nada(){}

}
