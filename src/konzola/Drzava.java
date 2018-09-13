package konzola;

public class Drzava {
	
	private String naziv;
	private String srpskiNaziv;
	private String glavniGrad;
	private String skracenica;
	private int brStanovnika;
	private String pripadnost = "SAD";
	
	public Drzava() { }
	
	public Drzava(String naziv) {
		
		this.naziv = naziv;
	}

	public Drzava(String naziv, String glavniGrad, String skracenica, int brStanovnika) {
		this.naziv = naziv;
		this.glavniGrad = glavniGrad;
		this.skracenica = skracenica;
		this.brStanovnika = brStanovnika;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getGlavniGrad() {
		return glavniGrad;
	}

	public void setGlavniGrad(String glavniGrad) {
		this.glavniGrad = glavniGrad;
	}

	public String getSkracenica() {
		return skracenica;
	}

	public void setSkracenica(String skracenica) {
		this.skracenica = skracenica;
	}

	public int getBrStanovnika() {
		return brStanovnika;
	}

	public void setBrStanovnika(int brStanovnika) {
		this.brStanovnika = brStanovnika;
	}
	
	public String getPripadnost() {
		
		return this.pripadnost;
	}

	public String getSrpskiNaziv() {
		return srpskiNaziv;
	}

	public void setSrpskiNaziv(String srpskiNaziv) {
		this.srpskiNaziv = srpskiNaziv;
	}
	
	
	
	
	

}
