package curso.java.inicio;

import java.util.Arrays;

import curso.java.funciones.Utils;

public class EjercicioDado {

	public static void main(String[] args) {

		int numCaras = 6;
		int numTiradas = Integer.parseInt(Utils.pideValor("Cuantas veces quieres tirar el dado? : "));		
		int tiradasDado [] = new int[numTiradas];
		int numMasAlto = 0;
		int numMasBajo = 0;
		int total = 0;
		
		
		for (int i = 0; i < tiradasDado.length; i++) {
			int tirada = tirarDado(numCaras);
			tiradasDado[i] = tirada;
			total += tirada;
			numMasAlto = Math.max(tirada, numMasAlto);
			numMasBajo = Math.min(tirada, numMasBajo);
		}
		
		System.out.println(Arrays.toString(tiradasDado));
		System.out.println("La media es "+(total/numTiradas));
		System.out.println("El numero mas alto es "+numMasAlto);
		System.out.println("El numero mas bajo es "+numMasBajo);
	}

	static int tirarDado(int numCaras) {
		
		double random = Math.random();
		int tirada = (int)Math.ceil((numCaras * random));
		return tirada;
	}
	
}
