package curso.java.inicio;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		

		Scanner pedir = new Scanner(System.in);
		int opcion = 0;
		int tamaCuadrado;
		String email;
			
		do {
			
			System.out.println("\n \tMenu: ");
			System.out.println("\n \t1. Pintar cuadrado.");
			System.out.println("\n \t2. Validar email.");
			System.out.println("\n \t3. Serie fibonacci.");
			System.out.println("\n \t4. Insertar nombres.");
			System.out.println("\n \t5. Salir.");
			

			System.out.print("Seleccione una opcion : ");
			opcion = pedir.nextInt();
			
			if(opcion <1 | opcion >5) {
				System.err.println("Tiene que ser entre 1 y 5");
			}
			
			
			switch(opcion) {
			case 1: pintaCuadrado();
				break;
			case 2: pedirEmail();
				break;
			case 3: serieFibonacci();
				break;
			case 4: System.out.println();
				break;
			case 5: System.out.println();
				break;
			default: System.out.println("Opcion incorrecta");
			}
			
		}while(opcion!=5);
		

		System.out.println("FIN DEL PROGRAMA.");
		
	}
	
	static void pintaCuadrado() {
		int tamaCuadrado;
		Scanner pedir = new Scanner(System.in); 
		
		System.out.print("Introduce tamaño de cuadrado : ");
		tamaCuadrado = pedir.nextInt();
			
			for (int fila = 0; fila < tamaCuadrado; fila++) {
				for (int columna = 0; columna < tamaCuadrado; columna++) {
					if(fila==0|| fila==tamaCuadrado-1 || columna == 0 || columna==tamaCuadrado-1 )
					System.out.print("*");
					else
						System.out.print(" ");
				}

				System.out.println("");
				
			}
		
	
	}
	
	static void pedirEmail() {
		String email;
		String mensajeError = "";
		Scanner pedir = new Scanner(System.in); 
		
		
		System.out.print("Introduce un email : ");
		email = pedir.nextLine();
		email = email.trim();
		
		// COMPROBAR QUE NO HAYA ESPACIOS EN BLANCO
		if (email.contains(" ")) {
			mensajeError = "El email no puede tener espacios en blanco";
		}
		
		// COMPROBAR QUE TENGA SOLO UN @
		if(email.indexOf("@")==-1 || email.indexOf("@")!=email.lastIndexOf("@")) {
			mensajeError = "TIENE QUE HABER UN @";
		}
		
		//COMPROBAR QUE TENGA UN . DESPUES DEL @
		if(email.substring(email.indexOf("@")).contains(".")) {
			mensajeError = "TIENE QUE HABER UN . ANTES DEL @";
		}else {
		
		int tamaDominio = email.substring(email.lastIndexOf(".")+1).length();
		if (tamaDominio <2 || tamaDominio >6) {
			mensajeError = "EL TAMAÑO DEL DOMINIO TIENE QUE ESTAR ENTRE 2 Y 6";
		}
		}
		
		
		if (mensajeError.equals("")) {
			System.out.println("El email "+email+ " es correcto.");
		}else {
			System.out.println("El email "+email+ " es incorrecto"+ mensajeError);
		}
		
		
	}
	
	static void serieFibonacci() {
		
		Scanner pedir = new Scanner(System.in); 
		
		System.out.print("\n \tIntroduce el numero de elementos de la serie fibonacci : ");
		int numElementos = pedir.nextInt();
		
		int num1 = 0;
		int num2 = 1;
		int suma = num1+num2;
		
		System.out.print(num1+",");
		System.out.print(num2+",");
		
		for (int i = 0; i < numElementos -2; i++) {
			System.out.print(suma+",");
			num1 = num2;
			num2 = suma;
			suma = num1 + num2;
		}
		
	}
	
	static void pedirAlumnos() {
		
		Scanner pedir = new Scanner(System.in); 
		
		System.out.print("\n \tIntroduce el numero de alumnos: ");
		int numAlumnos = pedir.nextInt();
		
		String [] alumnos = new String[numAlumnos];
		
	}

}
