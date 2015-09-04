package cl.utfsm.cursojava.ejemplo;

public class Usuario {
	// Atributos
	public String nombre;
	public String login;
	private int claveDB;
	
	//Constructores
	public Usuario() {
		nombre = "n.n.";
		claveDB = 1;
	}
	
	
	
	public Usuario(String nombre, int claveDB){
		this.nombre = nombre;
		this.claveDB = claveDB;
	}
	
	public Usuario(String nombre){
		this(nombre,2);
	}
	
	
	//métodos
	
	public int getClaveDB() {
		return claveDB;
	}
	public void setClaveDB(int claveDB) {
		this.claveDB = claveDB;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void login(){
		System.out.println("Login en la DB");
	}
	
}
