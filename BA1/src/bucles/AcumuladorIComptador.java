package bucles;

import java.util.Scanner;

public class AcumuladorIComptador {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double acumulador = 0;
		int comptador = 0;
		
		System.out.println("Introdueix una nota:");
		double nota = sc.nextDouble();
		
		while(nota != -1) {
			acumulador += nota;
			comptador++;
			
			System.out.println("Introdueix una nota:");
			nota = sc.nextDouble();
		}
		
		double mitjana = acumulador / comptador;
		System.out.println("La teva mitjana és "+mitjana);
		
		sc.close();
		
	}

}
