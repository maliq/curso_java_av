package cl.utfsm.cursojava.clase3.equals;

public class Persona {
	private String rol;
	private String nombre;
	private String telefono;

	@Override
	public boolean equals(Object o){
		if(!(o instanceof Persona))
			return false;
		else{
			Persona op = (Persona) o;
			return this.getRol().equals(op.getRol());
		}
	}
	
	@Override
	public int hashCode() {
		return this.rol.hashCode();
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
}

