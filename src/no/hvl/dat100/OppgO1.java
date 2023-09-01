package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgO1 {

	public static void main(String[] args) {
		String bruttoTxt = showInputDialog("Bruttoinntekt: ");
		int brutto = Integer.parseInt(bruttoTxt);
		
		double sats;
		
		if(brutto <= 164100) {
			System.out.println("Trinn 0");
			sats = 0;
		}
		else if(brutto <= 230950) {
			System.out.println("Trinn 1");
			sats = 0.0093;
		}
		else if(brutto <= 580650) {
			System.out.println("Trinn 2");
			sats = 0.0241;
		}
		else if(brutto <= 934050) {
			System.out.println("Trinn 3");
			sats = 0.1152;
		}
		else{
			System.out.println("Trinn 4");
			sats = 0.1452;
		}
		double skatt = sats * brutto;
		double netto = brutto - skatt;
		
		String utTxt = "Trinnskatt: " + skatt + 
				       "\nNettoinntekt: " + netto;
		
		showMessageDialog(null, utTxt);
	}

}
