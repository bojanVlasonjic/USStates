package konzola;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		SAD sad = SAD.getInstance();
		
		try {
			Ucitavanja.ucitavanjePodataka(sad);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Ukucajte 'izlaz' za prekid programa.");
		
		while (true) {
			
			System.out.println("Unesite odgovarajuci naziv na engleskom drzave iz SAD-a: ");
			
			String naziv = sc.nextLine();
			
			if (naziv.equalsIgnoreCase("izlaz")) {
				
				System.exit(0);
			}
			
			Drzava d = new Drzava(naziv);
			
			boolean rez = sad.pretragaDrzave(d);
			
			if (rez == false) {
				
				System.out.println("Unesena drzava ne postoji u SAD.");
			}
			
			System.out.println();
		}

	}
	
}
