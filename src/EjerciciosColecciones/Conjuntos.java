package EjerciciosColecciones;

import java.util.HashSet;
import java.util.Set;

import curso.java.objetos.Boton;

public class Conjuntos {

	public static void main(String[] args) {

		Set<String> colores = new HashSet<String>();
		
		boolean added = colores.add("Amarillo");
		System.out.println(added);
		
		added = colores.add(new String("Amarillo"));
		colores.add("Amarillo");
		
		Set <Boton> botones = new HashSet<Boton>();
		Boton boton1 = new Boton("","");
		Boton boton2 = new Boton("","");
		
		System.out.println(botones.add(boton1));
		System.out.println(botones.add(boton2));
		
		
	}

}
