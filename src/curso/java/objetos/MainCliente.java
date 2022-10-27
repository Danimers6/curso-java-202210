package curso.java.objetos;

import java.util.Scanner;

public class MainCliente {

	public static void main(String[] args) {

		float totalImporte;
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		Cliente cliente4 = new Cliente();
		
		Cliente clientes [] = {cliente1,cliente2,cliente3,cliente4};
		
		cliente1.visualizarDatos();
		cliente2.visualizarDatos();
		cliente3.visualizarDatos();
		cliente4.visualizarDatos();

		
		
		
	}
	
	

}
