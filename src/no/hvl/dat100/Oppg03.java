package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppg03 {

	public static void main(String[] args) {
		String nTxt = showInputDialog("Skriv inn tall du vil faktorisere: ");
		int n = Integer.parseInt(nTxt);
		int sum = 1;
		
		while(n <= 0) {
		 nTxt = showInputDialog("Tallet må være større enn null: ");
		 n = Integer.parseInt(nTxt);
		}
		
		for(int i = 1; i <= n; i++) {
			sum *= i;
		}
		System.out.print(n + "!: " + sum);

	}

}
