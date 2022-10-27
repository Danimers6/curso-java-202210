package Herencia;

public class Padre {

	private String nombre;
	private int edad;
	private boolean mayorEdad;
	
	
	public Padre(String nombre, int edad, boolean mayorEdad) {
		super();
		System.out.println("Constructor ClasePadre");
		this.nombre = nombre;
		this.edad = edad;
		this.mayorEdad = mayorEdad;
	}
	
	public void metodo1() {
		System.out.println("Llamando a metodo 1 clase padre");
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isMayorEdad() {
		return mayorEdad;
	}
	public void setMayorEdad(boolean mayorEdad) {
		this.mayorEdad = mayorEdad;
	}
	
	
	
}
