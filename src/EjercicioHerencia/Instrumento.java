package EjercicioHerencia;

import curso.java.funciones.Utils;

public class Instrumento {

	private String nombre;
	private String tipo;
	private String marca;
	private double precio;
	private boolean estaAfinado = false;
	
	public void afinar() {
		
		int tirada = Utils.tirarDado(10);
			if ( tirada > 8) {
				System.out.println("El instrumento "+this.nombre+ " no esta afinado.");
				this.estaAfinado= false;
			}else {
				
				System.out.println("El instrumento "+this.nombre+ " esta afinado.");
				this.estaAfinado = true;
			}
		
	}
	
	public Instrumento(String nombre, String tipo, String marca, double precio) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.marca = marca;
		this.precio = precio;
	}



	public boolean isAfinado() {
		return estaAfinado;
	}
	
	
	public void setEstaAfinado(boolean estaAfinado) {
		this.estaAfinado = estaAfinado;
	}

	public void tocar() {
		
		System.out.println("Tocando el instrumento "+this.nombre + (isAfinado()?" CORRECTAMENTE ":" MAL"));
	}
	
	
	
	
	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", tipo=" + tipo + ", marca=" + marca + ", precio=" + precio
				+ ", estaAfinado=" + estaAfinado + "]";
	}

	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
