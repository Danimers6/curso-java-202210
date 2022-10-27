package curso.java.inicio;

import java.util.Arrays;

import curso.java.funciones.Utils;

public class EjercicioDado2 {

	public static void main(String[] args) {
		
		int numTiradas = 5;
		int numDados = 2;
		int numCaras = 6;
		int sumaTiradaMasAlta = 0;
		int TiradaMasAlta = 0;
		
		int [] tiradasDado1 = new int [numTiradas];
		int [] tiradasDado2 = new int [numTiradas];
		
		for (int i = 0; i < numTiradas; i++) {
			int tiradaDado1 = Utils.tirarDado(numCaras);
			int tiradaDado2 = Utils.tirarDado(numCaras);
			
			tiradasDado1[i] = tiradaDado1;
			tiradasDado2[i] = tiradaDado2;
			
			if(sumaTiradaMasAlta <(tiradaDado1+tiradaDado2)) {
				sumaTiradaMasAlta = tiradaDado1 + tiradaDado2;
				TiradaMasAlta = i+1;
			}
		}
		
		System.out.println(Arrays.toString(tiradasDado1));
		System.out.println(Arrays.toString(tiradasDado2));
		System.out.println("La tirada con la suma mas alta ha sido la "+TiradaMasAlta);
		System.out.println("La suma mas alta ha sido de "+sumaTiradaMasAlta);
	}

}
