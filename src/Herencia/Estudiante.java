package Herencia;

public class Estudiante extends Padre {

	private String asignaturaFav;
	
	public Estudiante(String nombre, int edad, boolean mayorEdad) {
		super(nombre, edad, mayorEdad);

	}
	
	

	public Estudiante(String nombre, int edad, boolean mayorEdad, String asignaturaFav) {
		super(nombre, edad, mayorEdad);
		System.out.println("Constructor estudiante");
		this.asignaturaFav = asignaturaFav;
	}
	


	@Override
	public void metodo1() {
		// TODO Auto-generated method stub
		super.metodo1();
	}

	@Override
	public String toString() {
		return "Estudiante [asignaturaFav=" + asignaturaFav + ", getNombre()=" + getNombre() + ", getEdad()="
				+ getEdad() + ", isMayorEdad()=" + isMayorEdad() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}



	public String getAsignaturaFav() {
		return asignaturaFav;
	}

	public void setAsignaturaFav(String asignaturaFav) {
		this.asignaturaFav = asignaturaFav;
	}
	
	
}
