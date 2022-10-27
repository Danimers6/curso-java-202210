package Interfaces;

import EjercicioHerencia.Instrumento;

public class ClaseInterfaces extends Instrumento implements Interfaz1 {

	public ClaseInterfaces(String nombre, String tipo, String marca, double precio) {
		super(nombre, tipo, marca, precio);
		// TODO Auto-generated constructor stub
	}

	public void recoger() {
	
		System.out.println(NUM);
		
	}

	@Override
	public void transportar() {
		
		
		
	}

	
	
}
