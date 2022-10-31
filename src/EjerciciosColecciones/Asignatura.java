package EjerciciosColecciones;

public class Asignatura {

	private String nombreAsig;
	private int notaAsig;
	
	public Asignatura(String nombreAsig, int notaAsig) {
		super();
		this.nombreAsig = nombreAsig;
		this.notaAsig = notaAsig;
	}

	public String getNombreAsig() {
		return nombreAsig;
	}
	public void setNombreAsig(String nombreAsig) {
		this.nombreAsig = nombreAsig;
	}
	public int getNotaAsig() {
		return notaAsig;
	}
	public void setNotaAsig(int notaAsig) {
		this.notaAsig = notaAsig;
	}

	@Override
	public String toString() {
		return "Asignatura [nombreAsig=" + nombreAsig + ", notaAsig=" + notaAsig + ", getNombreAsig()="
				+ getNombreAsig() + ", getNotaAsig()=" + getNotaAsig() + "]";
	}
	
	
	
}
