package curso.java.funciones;

import java.util.Scanner;

public class PintarMenu {

	public static void pintarMenu(String menu) {
		
		System.out.println(menu);
		
	}
	
	public static void pintarMenu() {
		 pintarMenu("\n 1. Pintar cuadrado."
				+ "\n 2. Validar email."
				+ "\n 3. Serie fibonacci."
				+ "\n 4. Insertar nombres."
				+ "\n 5. Salir.");
	}
	
	public static void pintarMenu(String [] menu) {
		for(String opcion : menu) {
			pintarMenu(opcion);
		}
	}
	
}
