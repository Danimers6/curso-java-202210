package curso.java.objetos;

// alt + shift + s para generar los get y set


public class ClaseA {

	private int numero1;
	private int numero2;
	private String nombre;
	
	public ClaseA(String nombre) {
		this.nombre = nombre;
	}
	
	public ClaseA(int numero1 , int numero2, String nombre) {
		super();
	}
	
	void funcion1() {
		
		System.out.println("Funcion 1");
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public String getNombre() {
		return nombre;
	}
	
	
}
