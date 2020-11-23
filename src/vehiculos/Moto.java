package vehiculos;

public class Moto extends Vehiculo {

	private int numeroDeRuedas;
	private String matricula;

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public Moto() {
		this("Blanco");
	}

	public Moto(String color) {

		this(null, color);
	}
	
	public Moto(String modelo, String color) {

		this(modelo, color, 2);
	}
	
	public Moto(String modelo, String color, int ruedas) {
		super(modelo, color);
		numeroDeRuedas = ruedas;
	}

	public String toString() {
		return super.toString() + ", " + numeroDeRuedas + " ruedas";
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((getModelo() == null) ? 0 : getModelo().hashCode());
		return result;
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moto other = (Moto) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (getModelo() == null) {
			if (other.getModelo() != null)
				return false;
		} else if (!getModelo().equals(other.getModelo()))
			return false;
		return true;
	}

	
}
