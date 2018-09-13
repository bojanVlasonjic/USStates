package gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import konzola.Drzava;

public class ListenerZaPolje implements KeyListener {

	@Override
	public void keyPressed(KeyEvent ke) {
		
		if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
			
			String drzava = Prozor.textPolje.getText();
			 
			 
			 Drzava d = GuiMain.sjedAmerDrz.pretragaDrzavePoNazivu(drzava);
			 
			 if (d != null) {
				 
				 JOptionPane.showMessageDialog(null, "Unesena drzava postoji u SAD \n Drzava: " + d.getNaziv() + "\n Glavni grad: " + d.getGlavniGrad() , "InfoBox: " + "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
				
			} else {
				JOptionPane.showMessageDialog(null, "Unesena drzava ne postoji u SAD", "InfoBox: " + "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent ke) {
		
				
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
