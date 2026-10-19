package bucles;

import java.util.Scanner;

public class DonutsAmelia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		for(int i = 0; i < casos; i++) {
			
			int assistents1 = sc.nextInt();
			int assistents2 = sc.nextInt();
			int assistents3 = sc.nextInt();
			
			int donuts = 1;
			int maxim = assistents1 * assistents2 * assistents3;
			
			// Hola sóc un flag, sóc un boolean que marca quan es troba alguna cosa
			boolean flagMinimDonutTrobat = false; 
			
			while(donuts < maxim && !flagMinimDonutTrobat) {
				
				// CAS 1: El número de donuts és el que cerquem
				if(donuts % assistents1 == 0 && donuts % assistents2 == 0 
						&& donuts % assistents3 == 0) {
					flagMinimDonutTrobat = true;
				}
				// CAS 2: Encara no hem trobat el mínim de donuts
				else {
					donuts++;
				}				
			}
			
			if(flagMinimDonutTrobat) { // Hem trobat el mínim de donuts
				System.out.println(donuts);
			}
			else { // Si no hem trobat el número de donuts abans, haurà de ser el màxim
				System.out.println(maxim);
			}
		}		
		
		sc.close();

	}

}
