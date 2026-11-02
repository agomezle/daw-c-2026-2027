package bucles;

import java.util.Scanner;

public class PiramideDeCartes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		for(int i = 0; i < casos; i++) {
		
			int cartes = sc.nextInt(); 
			int piso = 1;
			
			int necesarias = (2 * piso);
			
			while(cartes >= necesarias) {
				
				cartes -= necesarias;
				
				piso++;
				necesarias = (2 * piso) + piso - 1;
			}			
			
			System.out.println(piso - 1 + " " + cartes);
			
		}		
		
		sc.close();

	}

}
