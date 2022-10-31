package EjerciciosColecciones;

import java.util.ArrayList;


public class Colecciones {

	public static void main(String[] args) {

		//UNA LISTA NOS PERMITE AÑADIR OBJETOS DE CUALQUIER TIPO
		
		ArrayList<String> lista1 = new ArrayList<String>();
		lista1.add("Holi");
		lista1.add("Cara");
		lista1.add("Coli");
		
		lista1.add(1,"Willyrex");
		
		for (String string : lista1) {
			System.out.println(string);
		}
		
		System.out.println(lista1.size());
		System.out.println(lista1.isEmpty());
		System.out.println(lista1.contains("Holi"));
		System.out.println(lista1.get(1));
		
		lista1.set(0, "Hey");
		
	}

}
