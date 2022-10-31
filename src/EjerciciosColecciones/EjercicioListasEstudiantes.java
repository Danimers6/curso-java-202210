package EjerciciosColecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import curso.java.inicio.EjercicioColegio;

public class EjercicioListasEstudiantes {

	public static void main(String[] args) {
		EjercicioListasEstudiantes colegio = new EjercicioListasEstudiantes();
		colegio.iniciaColegio();
		
	}
	
	public void iniciaColegio() {
		CrearEstudiantes();
		mostrarDatosEstudiantes();
		eliminaSuspensosLengua();
		mostrarDatosEstudiantes();
	}
	
	public List<Estudiante> estudiantes;
	
	public EjercicioListasEstudiantes() {
		super();
		this.estudiantes = new ArrayList<Estudiante>();
	}

	public void mostrarDatosEstudiantesAprobados() {
		for( Estudiante estudiante : estudiantes) {
			double sumanotas = 0;
			for (Asignatura asignatura : estudiante.getAsignaturas()) {
				sumanotas += asignatura.getNotaAsig();
			}
			if (sumanotas/estudiante.getAsignaturas().size() >=5) {
				System.out.println("Alumno aprobado con "+(sumanotas/estudiante.getAsignaturas().size()));
				System.out.println(estudiante);
			}
		}
	}
	
	public void mostrarDatosEstudiantes() {
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante);
			for (Asignatura asignatura : estudiante.getAsignaturas()) {
				System.out.println(asignatura);
			}
		}
	}
	
	public void eliminaSuspensosLengua() {
		System.out.println("Eliminando alumnos");
		for (Estudiante estudiante : estudiantes) {
			for (Asignatura asignatura : estudiante.getAsignaturas()) {
				if (asignatura.getNombreAsig().equals("Lengua") && asignatura.getNotaAsig()<5) {
					estudiantes.remove(estudiante);
				}
			}
		}
	}
	
	public void CrearEstudiantes() {
		
		//CREAMOS ALUMNO 1.
		
		Asignatura asig1Al1 = new Asignatura("Matematicas", 4);
		Asignatura asig2Al1 = new Asignatura("Lengua", 3);
		Asignatura asig3Al1 = new Asignatura("Fisica", 4);
		
		Set <Asignatura> asignaturasAl1 = new HashSet<Asignatura>();
		asignaturasAl1.add(asig1Al1);
		asignaturasAl1.add(asig2Al1);
		asignaturasAl1.add(asig3Al1);
		
		Estudiante e1 = new Estudiante("Julian", "Pillo", "78312873G", asignaturasAl1);
		estudiantes.add(e1);
		
		//CREAMOS ALUMNO 2.
		
		Asignatura asig1Al2 = new Asignatura("Matematicas", 6);
		Asignatura asig2Al2 = new Asignatura("Lengua", 8);
		Asignatura asig3Al2 = new Asignatura("Fisica", 3);
		
		Set <Asignatura> asignaturasAl2 = new HashSet<Asignatura>();
		asignaturasAl2.add(asig1Al2);
		asignaturasAl2.add(asig2Al2);
		asignaturasAl2.add(asig3Al2);
		
		Estudiante e2 = new Estudiante("Juan", "Killo", "7831233G", asignaturasAl2);
		estudiantes.add(e2);
		
		//CREAMOS ALUMNO 3.
		
		Asignatura asig1Al3 = new Asignatura("Matematicas", 2);
		Asignatura asig2Al3 = new Asignatura("Lengua", 5);
		Asignatura asig3Al3 = new Asignatura("Fisica", 9);
		
		Set <Asignatura> asignaturasAl3 = new HashSet<Asignatura>();
		asignaturasAl3.add(asig1Al3);
		asignaturasAl3.add(asig2Al3);
		asignaturasAl3.add(asig3Al3);
		
		Estudiante e3 = new Estudiante("Willy", "Rex", "78333333G", asignaturasAl3);
		estudiantes.add(e3);
	}
	
	
}
