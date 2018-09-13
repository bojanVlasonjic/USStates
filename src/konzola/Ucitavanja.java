package konzola;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

import gui.DrzavaIGrad;
import gui.GuiMain;
import gui.Komparator;

public class Ucitavanja {
	
	public static ArrayList<DrzavaIGrad> drzaveIGradovi = new ArrayList<DrzavaIGrad>();
	
	public static void ucitavanjePodataka(SAD sad) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\bojan\\Eclipse workspaces\\workspace - Java\\SAD\\Podaci\\States"));
		String line;
		
		while ((line = br.readLine()) != null) {
			
			String[] sadrzaj = line.split("\\|");
			Drzava d = new Drzava(sadrzaj[0]);
			d.setSrpskiNaziv(sadrzaj[2]);
			d.setGlavniGrad(sadrzaj[1]);
			Grad g = new Grad(sadrzaj[1]);
			
			GuiMain.sjedAmerDrz.dodavanje(d, g);
			
			DrzavaIGrad dg = new DrzavaIGrad(d, g);
			drzaveIGradovi.add(dg);
			
		}
		
		Komparator k = new Komparator(1);
		Collections.sort(drzaveIGradovi, k);
		
		br.close();
		
	}
	
	
	
}
