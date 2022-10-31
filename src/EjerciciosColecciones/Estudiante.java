package EjerciciosColecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Estudiante extends Asignatura {

	private String nombre;
	private String apellidos;
	private String dni;
	private Set<Asignatura> asignaturas = new HashSet<>(3);
	
	
	public void visualizarDatosAlumn() {
		System.out.println("ESTUDIANTE : ");
		System.out.println("\n Nombre : "+getNombre());
		System.out.println("\n Apellidos : "+getApellidos());
		System.out.println("\n Dni : "+getDni());
		System.out.println("ASIGNATURAS : ");
		System.out.println("\n Asignatura :" +getNombreAsig());
		System.out.println("\n Nota : "+getNotaAsig());
	}
	
	



	public Estudiante(String nombre, String apellidos, String dni, Set<Asignatura> asignaturas) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.asignaturas = asignaturas;
		visualizarDatosAlumn();
	}


	public Estudiante(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}


	public Estudiante(String nombreAsig, int notaAsig, Set<Asignatura> asignaturas) {
		super(nombreAsig, notaAsig);
		this.asignaturas = asignaturas;
	}


	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}

	public Set<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Set<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}
	



//	@Override
	//public String toString() {
	// 	return "Estudiante : " + nombre + " " + apellidos + ", dni : " + dni + " \nASIGNATURAS : "
	//		+ asignaturas + " \n" + getNombre() + " " + getApellidos() + ", dni : "
	//			+ getDni() + ", getAsignaturas()=" + getAsignaturas() + " " + super.toString();
//	}


	
	
	
}
