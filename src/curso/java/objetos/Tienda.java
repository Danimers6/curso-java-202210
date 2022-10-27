package curso.java.objetos;

public class Tienda {

	private String nombre;
	
	public Tienda(String nombre) {
		super();
		this.nombre = nombre;
	}



	public static void main(String[] args) {

		Tienda tienda1 = new Tienda("Tienda 1");
		Maniqui [] maniquis = tienda1.crearTienda();
		

	}

	private Maniqui[] crearTienda() {
		
		Boton boton1 = new Boton("negro","redondo");
		Boton boton2 = new Boton("verde","redondo");
		Boton boton3 = new Boton("rojo","cuadrado");
		Boton boton4 = new Boton("azul","redondo");
		
		Boton [] botonesCamisa1 = {boton1,boton2};
		Boton [] botonesCamisa2 = {boton1,boton3,boton4};
		
		Camisa camisa1 = new Camisa("Negra","L",40, botonesCamisa1);
		Camisa camisa2 = new Camisa("Negra","M",60,botonesCamisa2);
		
		Pantalon pantalon = new Pantalon("Vaquero","40",50, boton4);
		
		Maniqui [] maniquis = {};
		return maniquis;
	}

}
