package gui;

import java.io.IOException;

import javax.swing.ImageIcon;

import konzola.SAD;

public class GuiMain {
	
	public static SAD sjedAmerDrz = SAD.getInstance();
	
	
	public static void main(String[] args) {
		
		try {
			konzola.Ucitavanja.ucitavanjePodataka(sjedAmerDrz);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Prozor p1 = new Prozor();
		
		ImageIcon img = new ImageIcon("C:\\Users\\bojan\\Eclipse workspaces\\workspace - Java\\SAD\\Podaci\\USA_icon.png");
		p1.setIconImage(img.getImage());
		
	}

}
