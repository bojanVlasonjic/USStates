package gui;

import java.awt.Color;


import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Prozor extends JFrame {

	private static final long serialVersionUID = 1L;
	
	static protected JButton pretraga;
	static protected JButton prikaziSve;
	static protected JTextField textPolje;
	static protected JTextArea textArea;
	
	
	public Prozor() {
		
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Sjedinjene americke drzave");
		
		JPanel panel = formiranjePanela();
		
		this.add(panel);
		
		this.setVisible(true); // Turi na kraj
		
	}
	
	public JPanel formiranjePanela() {
		
		JPanel panel = new JPanel();
		
		JLabel labela1 = kreiranjeLabele();
		textPolje = kreiranjeTextPolja();
		pretraga = dugmeZaPretragu();
		textArea = kreiranjeTextArea();
		JScrollPane scrollbar = kreiranjeScrollbar(textArea);
		prikaziSve = prikaziSveDugme();
		
		panel = dodavanjeKomponentiPanelu(panel, labela1, textPolje, pretraga, textArea, scrollbar, prikaziSve);
		
		return panel;
		
		
	}
	
	public JPanel dodavanjeKomponentiPanelu(JPanel panel, JLabel labela1, JTextField textPolje, JButton pretraga, JTextArea textArea, JScrollPane scrollbar, JButton prikaziSve) {
		
		panel.add(labela1);
		panel.add(textPolje);
		panel.add(pretraga);
		//panel.add(textArea); ovo uklanjamo da bi se pojavio scrollbar
		panel.add(scrollbar);
		panel.add(prikaziSve);
		
		
		return panel;
		
	}
	
	public JLabel kreiranjeLabele() {
		
		JLabel labela1 = new JLabel("Unesite drzavu: ");
		labela1.setToolTipText("Unesite odgovarajucu drzavu iz SAD-a");
		
		return labela1;
		
	}
	
	public JTextField kreiranjeTextPolja() {
		
		textPolje = new JTextField(20);
		textPolje.requestFocus();
		
		ListenerZaPolje lzp = new ListenerZaPolje();
		textPolje.addKeyListener(lzp);
		
		return textPolje;
		
	}
	
	public static JButton dugmeZaPretragu() {
		
		pretraga = new JButton("Pretrazi");
		pretraga.setToolTipText("Pretrazi da li uneta drzava postoji u SAD");
		
		ListenerZaPretrazi lpretrazi = new ListenerZaPretrazi(); 
		pretraga.addActionListener(lpretrazi);
		
		return pretraga;
		
	}
	
	public JTextArea kreiranjeTextArea() {
		
	    textArea = new JTextArea(15, 25);
		textArea.disable();
		textArea.setLineWrap(true); //ako dodje do kraja, turi u novi red
		textArea.setWrapStyleWord(true); //ako dodje do kraja, turi CELU REC dole, ne preseca je
		//textArea.setBackground(Color.BLACK);
		textArea.setDisabledTextColor(Color.black);
		Border border = BorderFactory.createLineBorder(Color.gray);
		
		textArea.setBorder(border);
		return textArea;
		
	}
	
	public JScrollPane kreiranjeScrollbar(JTextArea textArea) {
		
		JScrollPane scrollbar = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollbar.setSize(100, 100);
		return scrollbar;
	}
	
	public JButton prikaziSveDugme()  {
		
		prikaziSve = new JButton("Prikazi_Sve");
		prikaziSve.setToolTipText("Prikaze sve postojece drzave i glavne gradove u SAD");
		
		ListenerZaPretraziSve lzps = new ListenerZaPretraziSve();
		prikaziSve.addActionListener(lzps);
		
		return prikaziSve;
			
	}
	

}
