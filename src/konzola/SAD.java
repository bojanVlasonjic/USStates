package konzola;
import java.util.HashMap;
import java.util.Map;

public class SAD {
	
	public Map<Drzava, Grad> sad = new HashMap<Drzava, Grad>();
	
	private SAD() { }
	private static SAD instanca = null;
	
	public static SAD getInstance() {
		
		if (instanca == null) {
			
			instanca = new SAD();
			
		}
		
		return instanca;
		
	}
	
	public void dodavanje(Drzava d, Grad g) {
		
		if (sad.size() > 50) {
			
			System.out.println("Uneseno je svih 50 drzava.");
			return;
			
		}
		
		
		if (sad.containsKey(d.getNaziv())) {
				
			System.out.println("Ova drzava je vec uneta.");
			return;
				
		}
		
		sad.put(d, g);
		
	}
	
	public boolean pretragaDrzave(Drzava d) {
		
		for (Map.Entry<Drzava, Grad> entry: sad.entrySet()) {
			
			Drzava kljuc = entry.getKey();
			Grad vr = entry.getValue();
			
			if (kljuc.getNaziv().equalsIgnoreCase(d.getNaziv())) {
				
				System.out.println("Unesena drzava postoji u SAD.");
				System.out.println("Drzava: " + kljuc.getNaziv());
				System.out.println("Glavni grad: " + vr.getNaziv());
				
				return true;
				
			}
			
		}
		
		return false;
	}
	
	public Drzava pretragaDrzavePoNazivu(String d) {
		
		for (Map.Entry<Drzava, Grad> entry: sad.entrySet()) {
			
			Drzava kljuc = entry.getKey();
			Grad vr = entry.getValue();
			
			if ((kljuc.getNaziv().equalsIgnoreCase(d)) || (kljuc.getSrpskiNaziv().equalsIgnoreCase(d))) {
				
				System.out.println("Unesena drzava postoji u SAD.");
				System.out.println("Drzava: " + kljuc.getNaziv());
				System.out.println("Glavni grad: " + vr.getNaziv());
				
				return kljuc;
				
			}
			
		}
		
		return null;
	}
	
	

}
