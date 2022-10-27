package curso.java.inicio;

import java.util.Scanner;

import curso.java.funciones.PintarMenu;
import curso.java.funciones.Utils;

public class EjercicioColegio {

	public static void main(String[] args) {

		//INTRODUCIR EL NUMERO DE AULAS QUE TIENE EL COLEGIO
		
		int numAulas = Integer.parseInt(Utils.pideValor("Introduce numero de aulas :"));
		String [][] colegio = new String[numAulas][];

		//ARRAY PARA ASIGNAR LOS VALORES DE CADA FILA Y COLUMNA
		
		for (int i = 0; i < numAulas; i++) {
			int numAlumnos = Integer.parseInt(Utils.pideValor("¿Cuantos alumnos caben en el aula "+(i+1)+"? :"));
			colegio[i] = new String [numAlumnos];
		}
		
		int opcion=0;
		do {
			String[] menu = {"1. Insertar alumno por aula :", "2. Buscar alumno :","3. Borrar alumno :","4. Mostrar alumnos por aula : ",
					"5. Mostrar alumnos :","6. Mostrar plazas libres de todas las aulas :","7. Salir "};
			Utils.pintaMenu(menu);
			
			opcion = Integer.parseInt(Utils.pideValor("Introduce una opcion :"));
			switch(opcion) {
			case 1: InsertarAlumnoAula(colegio); break;
			case 2: buscarAlumno(colegio); break;
			case 3: borrarAlumno(colegio); break;
			case 4: break;
			case 5: break;
			case 6: break;
			case 7: System.out.println("FIN DEL PROGRAMA."); break;
			}
			
		}while(opcion!=7);
		
	}
	
	static void InsertarAlumnoAula(String[][] colegio) {
		
		int aula = 0;
		boolean aulacorrecta = true;
		do {
			aula = Integer.parseInt(Utils.pideValor("En que aula quieres meter al alumno :"));
			aulacorrecta = validaAula(aula, colegio);
			if(!aulacorrecta) {
				System.out.println("El aula introducida no existe.");
			}else {
				String [] aulaseleccionada = colegio[aula-1];
				boolean aulacompleta = true;
				for (int i = 0; i < aulaseleccionada.length; i++) {
					if (aulaseleccionada[i] == null) {
						aulaseleccionada[i] = Utils.pideValor("Introduce el nombre del alumno "+(i+1));
						aulacompleta = false;
						break;
					}
				}
				if(aulacompleta) {
					System.out.println("El aula esta llena.");
				}
			}
		} while (!aulacorrecta);


	}
	
	static void buscarAlumno(String [][] colegio) {
		String nombreABuscar;
		nombreABuscar = Utils.pideValor("Introduce el nombre del alumno a buscar :");
		
//		for (int i = 0; i < colegio.length; i++) { //FILAS
//			for (int j = 0; j < colegio[i].length; j++) { //COLUMNAS
//				
//			}
//		}
		int contadorAula = 0;
		boolean alumnoEncontrado = false;
		for (String[] aula : colegio) { // RECORRO LAS AULAS DEL COLEGIO
			contadorAula++;
			for (String alumnos : aula) { // RECORRO LOS ALUMNOS DE CADA AULA
				if (alumnos!=null && alumnos.equals(nombreABuscar)) {
					System.out.println("Alumno encontrado en el aula "+ contadorAula);
					alumnoEncontrado = true;
					break;
				}
			}
			if(alumnoEncontrado) {
				break;
			}
		}
		
		if(!alumnoEncontrado) {
			System.out.println("El alumno "+nombreABuscar+" no esta en el colegio.");
		}
	}
	
	static void borrarAlumno(String [][] colegio) {
		
		String nombreABorrar;
		nombreABorrar = Utils.pideValor("Introduce el nombre del alumno a buscar :");
		
		for (int i = 0; i < colegio.length; i++) { //FILAS
		for (int j = 0; j < colegio[i].length; j++) { //COLUMNAS
			String nombreAlumno = colegio[i][j];
			if (nombreAlumno!=null && nombreAlumno.equals(nombreABorrar)) {
				colegio[i][j] = null;
				
				//Establezco valores a i y j para que los
				
				j = colegio[i].length;
				i = colegio.length;
		}
	}
	}
	}
	
	static boolean validaAula(int aula, String [][] colegio) {
		return aula <= colegio.length && aula >0;
	}

}
