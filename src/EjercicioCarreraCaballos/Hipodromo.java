package EjercicioCarreraCaballos;

public class Hipodromo {

	private Carrera carrera;
	private Jugador[] jugadores;
	private Caballo [] caballos;
	
	public static void main(String[] args) {
		
		Hipodromo hipodromo = new Hipodromo();
		hipodromo.crearJugadores();
		hipodromo.crearCaballos();
		

	}
	
	private void crearJugadores() {
		jugadores = new Jugador[2];
		jugadores[0] = new Jugador("Jugador1", 1000.0);
		jugadores[1] = new Jugador("Jugador2", 2000.0);
	}
	
	private void crearCaballos() {
		caballos = new Caballo[3];
		caballos[0] = new Caballo(1, "Caballo1",8,3,10);
		caballos[1] = new Caballo(2, "Caballo2",10,1,15);
		caballos[2] = new Caballo(3, "Caballo3",4,6,12);
	}
	
	private void abrirHipodromo() {
		Carrera carrera = new Carrera("Gran premio java",100,this.caballos);
		for (Jugador jugador : jugadores) {
			jugador.apostar(this.caballos);
		}
		
		//iniciar carrera
		carrera.iniciarCarrera();
	}

}
