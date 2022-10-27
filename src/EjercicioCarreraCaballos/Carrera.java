package EjercicioCarreraCaballos;

public class Carrera {

	private String nombre;
	private double distancia;
	private Caballo [] caballos;
	private Caballo caballoGanador;
	
	
	
	
	public Carrera(String nombre, double distancia, Caballo[] caballos) {
		super();
		this.nombre = nombre;
		this.distancia = distancia;
		this.caballos = caballos;
	}

	public Carrera(String nombre, double distancia, Caballo[] caballos, Caballo caballoGanador) {
		super();
		this.nombre = nombre;
		this.distancia = distancia;
		this.caballos = caballos;
		this.caballoGanador = caballoGanador;
	}

	public void iniciarCarrera() {
		System.out.println("Empieza la carrera "+this.nombre);
		boolean hayGanador = false;
		
		do {
			System.out.println("los caballos estan corriendo");
			for (Caballo caballo : caballos) {
				caballo.correr();
			}
			hayGanador = comprobarGanador();
			}while(!hayGanador);
		System.out.println("Carrera terminada . Ha ganado el caballo con dorsal "+this.caballoGanador.getDorsal());
		}
	
	private boolean comprobarGanador() {
		int mayorDistancia = 0;
		for (Caballo caballo : caballos) {
			if(caballo.getDistanciaTotalAvanzada()>this.distancia) {
				if(caballo.getDistanciaTotalAvanzada()>mayorDistancia) {
					mayorDistancia = caballo.getDistanciaTotalAvanzada();
					this.caballoGanador = caballo;
				}
			}
		}
		return this.caballoGanador!=null;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public Caballo[] getCaballos() {
		return caballos;
	}
	public void setCaballos(Caballo[] caballos) {
		this.caballos = caballos;
	}
	public Caballo getCaballoGanador() {
		return caballoGanador;
	}
	public void setCaballoGanador(Caballo caballoGanador) {
		this.caballoGanador = caballoGanador;
	}
	
	
	
}
