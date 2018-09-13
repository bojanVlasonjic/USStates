package gui;

import java.util.Comparator;
import gui.DrzavaIGrad;

public class Komparator implements Comparator<DrzavaIGrad> {
	
	private int smer;
	
	public Komparator(int smer) {
		
		if(Math.abs(smer) != 1) {
			this.smer = 1;
		} else {
			this.smer = smer;
		}
	}
	@Override
	public int compare(DrzavaIGrad dg1, DrzavaIGrad dg2) {
		// TODO Auto-generated method stub
		return dg1.getDrzava().getNaziv().toLowerCase().compareTo(dg2.getDrzava().getNaziv().toLowerCase()) * smer;
	}

	

}
