package curso.java.objetos;

public class Maniqui {

	private long id;
	private Camisa camisa;
	private Pantalon pantalon;
	private Vestido vestido;
	
	public Maniqui(long id) {
		super();
		this.id = id;
	}

	public Maniqui(long id, Vestido vestido) {
		super();
		this.id = id;
		this.vestido = vestido;
	}

	public Maniqui(long id, Camisa camisa, Pantalon pantalon) {
		super();
		this.id = id;
		this.camisa = camisa;
		this.pantalon = pantalon;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}

	public long getId() {
		return id;
	}
	
	public void vestirManiqui(Camisa camisa, Pantalon pantalon, Vestido vestido) {
		
		
		
	}
	
	public void vestirManiqui(Camisa camisa, Pantalon pantalon) {
		
		desvestirManiqui();
		this.camisa = camisa;
		this.pantalon = pantalon;
		
	}
	
	public void vestirManiqui(Vestido vestido) {
		
		desvestirManiqui();
		this.vestido = vestido;
		
	}
	
	public void desvestirManiqui() {
		
		if(camisa != null) {
			camisa = null;
		}if(pantalon != null) {
			pantalon = null;
		}if(vestido != null) {
			vestido = null;
		}
		
		System.out.println("Maniqui "+this.getId()+" desvestido.");
		
		System.out.println("Maniqui "+this.getId()+" :");
		System.out.println("\n Camisa : "+this.getCamisa());
		System.out.println("\n Pantalon : "+this.getPantalon());
		System.out.println("\n Vestido : "+this.getVestido());
	}
	
}
