package curso.java.objetos;

import java.util.Scanner;

public class Cliente {

	Scanner pedir = new Scanner(System.in);
	private String nombre;
	private String apellidos;
	private String dni;
	private double importeCompra = 0;
	
	public Cliente(String nombre, String apellidos, String dni) {
		
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;

				
	}

	public Cliente() {
		
		pedirDatos();
		comprar(importeCompra);
		
		//visualizarDatos();
	}
	
	private void pedirDatos() {
		
		System.out.println("\n");
		
		System.out.print("Inserte el nombre para el cliente: ");
		nombre = pedir.nextLine();
		
		System.out.print("Inserte los apellidos de "+nombre);
		apellidos = pedir.nextLine();
		
		System.out.print("Inserte el dni de "+nombre);
		dni = pedir.nextLine();
		
	}
	
	private void comprar(double valorCompra) {
		
		System.out.println("Inserte el valor del importe: ");
		this.importeCompra = pedir.nextDouble();
	}
	
	public void visualizarDatos(){
		System.out.println("\n");
		System.out.println("-----------------------------------");
		System.out.println("\n \tNOMBRE : "+getNombre());
		System.out.println("\n \tAPELLIDOS : "+getApellidos());
		System.out.println("\n \tDNI : "+getDni());
		System.out.println("\n \tIMPORTE : "+getImporteCompra());
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

	public double getImporteCompra() {
		return importeCompra;
	}

	public void setImporteCompra(double importeCompra) {
		this.importeCompra = importeCompra;
	}
	
	
}
