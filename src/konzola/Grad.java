package konzola;

public class Grad {
	
	private String naziv;
	private Drzava drzava;
	private int brStanovnika;
	
	
	public Grad(String naziv) {
		
		this.naziv = naziv;
	}
	
	public Grad(String naziv, Drzava drzava, int brStanovnika) {
		
		this.naziv = naziv;
		this.drzava = drzava;
		this.brStanovnika = brStanovnika;
	}


	public String getNaziv() {
		return naziv;
	}


	public Drzava getDrzava() {
		return drzava;
	}


	public void setDrzava(Drzava drzava) {
		this.drzava = drzava;
	}


	public int getBrStanovnika() {
		return brStanovnika;
	}


	public void setBrStanovnika(int brStanovnika) {
		this.brStanovnika = brStanovnika;
	}
	
	
	
	

}
