package gui;

import konzola.Drzava;
import konzola.Grad;

public class DrzavaIGrad {
	
	private Drzava drzava;
	private Grad grad;
	
	public DrzavaIGrad() { }

	public DrzavaIGrad(Drzava drzava, Grad grad) {
		
		this.drzava = drzava;
		this.grad = grad;
	}

	public Drzava getDrzava() {
		return drzava;
	}

	public void setDrzava(Drzava drzava) {
		this.drzava = drzava;
	}

	public Grad getGrad() {
		return grad;
	}

	public void setGrad(Grad grad) {
		this.grad = grad;
	}

	

}
