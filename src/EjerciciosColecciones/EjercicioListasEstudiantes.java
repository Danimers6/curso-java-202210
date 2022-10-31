package EjerciciosColecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class EjercicioListasEstudiantes {

	public static void main(String[] args) {
		
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		Set<Asignatura> asignaturas = new HashSet<Asignatura>(3);
		Asignatura asig1 = new Asignatura("Mate", 3);
		asignaturas.add(asig1);
		Estudiante estudiante1 = new Estudiante("JUAN", "LOPEZ", "7281889P", asignaturas);
		estudiantes.add(estudiante1);

		
		
	}

	
	public void visualizarEstudiantes(ArrayList<Estudiante> estudiantes) {
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante);
			System.out.println("\n-----------------------");
			System.out.println(" ");
		}
	}
	
}
