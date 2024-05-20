package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args) {
		
		
		
		String [] invitati = {"Dua Lipa", "Paris Hilton" , "Manuel Agnelli" , "J-Ax" , "Francesco Totti" , "Ilary Blasi" , "Bebe Vio" , "Luis" , "Pardis Zarei" , "Martina Maccherone" , "Rachel Zeilic"};
		Scanner scan = new Scanner (System.in);
		
			System.out.println("Inserisci il tuo nome per vedere se sei invitato:");
			String nomeDaInput = scan.nextLine();
			
			boolean trovato = false;
		
		for(String ospiti : invitati)
		{
			if(nomeDaInput.equalsIgnoreCase(ospiti)) {
				trovato = true;
				System.out.println("Puoi entrare!"); 
			}else{
				System.out.println("Non puoi entrare!");
			}
			
					
		}
		
		
	}

}	