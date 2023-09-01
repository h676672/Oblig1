package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppg02 {

	public static void main(String[] args) {
		int antallS = 0;
		while(antallS < 10) {
		
		String poengTxt = showInputDialog("Skriv din poengsum: ");
        int poeng = Integer.parseInt(poengTxt);
		String karakter;
		
		while(poeng < 0 || poeng > 100) {
			poengTxt = showInputDialog("Poengsum må være mellom 0 og 100");
	        poeng = Integer.parseInt(poengTxt);
		}
		
		switch(poeng/10) {
		case 10:
		case 9:
		karakter = "A";
		    break;
		case 8:
		karakter = "B";
			break;
		case 7:
		case 6:
		karakter = "C";
			break;
		case 5:
		karakter = "D";
			break;
		case 4:
		karakter = "E";
			break;
		default:
		karakter = "F";
		}
		System.out.println(karakter);
		antallS++;
	}
	}
}
