package Excepciones;

public class ClaseErrorA {

	
	public void metodo1() throws MiExcepcion {


			System.out.println("Llamando a metodo1");
			int numerador = 9;
			int denominador = 0;
			if(denominador == 0) {
				Exception e = new ArithmeticException("Estas dividiendo por cero y no se puede");
				MiExcepcion me = new MiExcepcion("Excepcion propia");
				throw me;
			}
			System.out.println("Voy a realizar la division..");
			int division = numerador/denominador;
	
		
	}
	
}
