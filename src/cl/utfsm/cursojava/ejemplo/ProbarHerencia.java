package cl.utfsm.cursojava.ejemplo;

public class ProbarHerencia {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		usuario.login();
		Alumno alumno = new Alumno("alumno 1", 7);
		alumno.login();
		System.out.println(alumno.getNombre()+ " :"+alumno.promedio
				+ " clave:"+ alumno.getClaveDB());
		
		Usuario u2 = alumno;
		Alumno a2 = (Alumno) usuario;
	}

}
