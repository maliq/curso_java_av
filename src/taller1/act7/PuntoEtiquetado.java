package taller1.act7;

public class PuntoEtiquetado extends Punto {
	String etiqueta;

	public PuntoEtiquetado(double x, double y, String etiqueta) {
		super(x, y);
		this.etiqueta = etiqueta;
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	@Override
	public String toString() {
		return "PuntoEtiquetado [etiqueta=" + etiqueta + ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((etiqueta == null) ? 0 : etiqueta.hashCode()) +
				new String(this.getX() +"" +this.getY()).hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PuntoEtiquetado other = (PuntoEtiquetado) obj;
		if (etiqueta == null) {
			if (other.etiqueta != null)
				return false;
		} else if (!etiqueta.equals(other.etiqueta))
			return false;
		if(other.getX() != this.getX())
			return false;
		if(other.getY() != this.getY())
			return false;
		return true;
	}
	
}
