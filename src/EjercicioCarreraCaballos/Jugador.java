package EjercicioCarreraCaballos;

import curso.java.funciones.Utils;

public class Jugador {

	private String nombre;
	private double saldo;
	private Apuesta apuesta;
	
	
	
	public Jugador(String nombre, double saldo) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
	}

	public Jugador(String nombre, double saldo, Apuesta apuesta) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		this.apuesta = apuesta;
	}
	
	public void apostar(Caballo [] caballos) {
		int cantidad = 0;
		int dorsal = 0;
		boolean apuestaCorrecta = false;
		
		do {
			cantidad = Integer.parseInt(Utils.pideValor("Cuanto quieres aposatr?"));
			apuestaCorrecta = compruebaApuesta(cantidad);
		}while(!apuestaCorrecta);
		
		String texto = "Por que quieres apostar?";
		for (Caballo caballo : caballos) {
			texto+=caballo.getDorsal()+" , ";
		}
		apuestaCorrecta = false;
		do {
			dorsal = Integer.parseInt(Utils.pideValor(texto));
			apuestaCorrecta = compruebaDorsal(dorsal,caballos);
		} while (!apuestaCorrecta);
		
		
		Apuesta apuesta = new Apuesta(cantidad,dorsal);
		this.setApuesta(apuesta);
	}
	
	
	private boolean compruebaDorsal () {
		
	}
	
	private boolean compruebaApuesta(double cantidad) {
		return cantidad<=this.saldo && cantidad>0;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Apuesta getApuesta() {
		return apuesta;
	}
	public void setApuesta(Apuesta apuesta) {
		this.apuesta = apuesta;
	}
	
	
}
