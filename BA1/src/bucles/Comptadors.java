package bucles;

import java.util.Scanner;

public class Comptadors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int comptador = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Introdueix la teva nota: ");
			double nota = sc.nextDouble();
			
			if(nota >= 5) {
				comptador++;
			}
		}	
		
		System.out.println("Han aprovat "+comptador+" alumnes.");
		
		sc.close();
		
	}

}
