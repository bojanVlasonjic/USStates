package gui;

import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;

import konzola.Drzava;
import konzola.Grad;
import konzola.Ucitavanja;

public class ListenerZaPretraziSve implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if ((ae.getSource() == Prozor.prikaziSve)) {
			
			if ((Prozor.textArea.getText().equals(""))) { //proveravam da li je vec prikazano
				
			
			
			for (DrzavaIGrad dg: Ucitavanja.drzaveIGradovi) {
				
				Drzava kljuc = dg.getDrzava();
				Grad vr = dg.getGrad();
				
				Prozor.textArea.append(kljuc.getNaziv() + " -- " + vr.getNaziv() + "\n");
				
				Prozor.prikaziSve.setText("Ukloni_Sve");
			}
			
			}
			
			else {
				
				Prozor.textArea.setText("");
				Prozor.prikaziSve.setText("Prikazi_Sve");
			}
		
		}
		
	}

}
