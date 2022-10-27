package curso.java.objetos;

public class Vestido {

	String color;
	String talla;
	double precio;

	
	
	private Vestido(String color, String talla, double precio) {
		super();
		this.color = color;
		this.talla = talla;
		this.precio = precio;

	}
	
	
	private Vestido() {
		super();
	}
	
	
}
