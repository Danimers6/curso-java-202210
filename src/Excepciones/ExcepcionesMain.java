package Excepciones;

public class ExcepcionesMain {

	public static void main(String[] args) {

		System.out.println("inicio");

		ClaseErrorA cea = new ClaseErrorA();
		try {
			cea.metodo1();
		} catch (MiExcepcion e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try {
			
			String [] colores = {"Blanco","Azul"};
			System.out.println(colores[colores.length]);
			int num = 7/0;
		}catch (ArithmeticException | ClassCastException ae) {
			
			//e.printStackTrace();
			System.out.println("Ha habido un problema con la division "+ae.getMessage());
		}catch (ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Ha habido un problema con el array "+aiobe.getMessage());
		}finally {
			System.out.println("continua");
		}
		
		
		System.out.println("fin");
		
	}

}
