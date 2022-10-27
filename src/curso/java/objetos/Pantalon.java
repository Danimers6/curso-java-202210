package curso.java.objetos;

public class Pantalon {

	String color;
	String talla;
	int precio;
	Boton [] botones ;
	
	
	public Pantalon(String color, String talla, int precio, Boton botones[]) {
		super();
		this.color = color;
		this.talla = talla;
		this.precio = precio;
		this.botones = botones;
	}
	
	
	private Pantalon() {
		super();
	}
	
}
