package gui;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import konzola.Drzava;

public class ListenerZaPretrazi implements ActionListener {
	

	public void actionPerformed(ActionEvent ae) {
		
		if (ae.getSource() == Prozor.pretraga ) {
			
			//System.out.println(Prozor.textPolje.getText());
			
			String drzava = Prozor.textPolje.getText();
			 
			 
			 Drzava d = GuiMain.sjedAmerDrz.pretragaDrzavePoNazivu(drzava);
			 
			 if (d != null) {
				 
				 JOptionPane.showMessageDialog(null, "Unesena drzava postoji u SAD \n Drzava: " + d.getNaziv() + "\n Glavni grad: " + d.getGlavniGrad() , "InfoBox: " + "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
				
			} else {
				JOptionPane.showMessageDialog(null, "Unesena drzava ne postoji u SAD", "InfoBox: " + "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
			}
			
			
		}
		
	}

	

}
