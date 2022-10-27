package EjercicioHerencia;

public class Guitarra extends Instrumento {

	private int numCuerdas = 5;
	private String material;
	
	public Guitarra(String nombre, String tipo, String marca, double precio, int numCuerdas, String material) {
		super(nombre, tipo, marca, precio);
		this.numCuerdas = numCuerdas;
		this.material = material;
	}


	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}


	@Override
	public void tocar() {
		System.out.println("Se esta rocando la guitarra"+ (isAfinado()?" CORRECTAMENTE ":" MAL"));
	}


	@Override
	public String toString() {
		return "Guitarra [numCuerdas=" + numCuerdas + ", material=" + material + ", " + super.toString()
				+ "]";
	}
	
	
	
}
