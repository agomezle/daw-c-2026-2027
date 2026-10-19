package bucles;

import java.util.Scanner;

public class Notes10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nota = sc.nextInt();

		int notesValides = 0;
		int notes10 = 0;

		while (nota != -1) {

			if (nota >= 0 && nota <= 10) { // Notes vàlidess
				notesValides++;

				if (nota == 10) {
					notes10++; // Notes 10
				}
			}

			nota = sc.nextInt(); // Necessitem canviar el valor de nota dins del bucle
									// o no sortirem mai
		}

		System.out.println("TOTAL NOTES: " + notesValides + " NOTES10: " + notes10);

		sc.close();
		
	}
	

}
