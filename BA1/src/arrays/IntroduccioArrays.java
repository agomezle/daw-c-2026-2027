package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class IntroduccioArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Declaració d'arrays i inicialització

		int[] arrayEnters = new int[5]; // Hem d'especificar sempre el tamany de l'array

		for (int i = 0; i < arrayEnters.length; i++) {
			arrayEnters[i] = sc.nextInt();
		}

		System.out.println(arrayEnters); // Imprimeix tipus de dades i ubicació en memòria

		// Mètode 1 per imprimir arrays

		System.out.println("Array imprès amb un for: ");
		for (int i = 0; i < arrayEnters.length; i++) {
			System.out.print(arrayEnters[i] + " ");
		}

		// Mètode 2 per imprimir arrays
		System.out.println("\nArray convertit a String: ");
		System.out.println(Arrays.toString(arrayEnters));

		// Es poden fer arrays de qualsevol tipus
		String[] arrayStrings = new String[4];

		// Inicialitzar amb valors
		String[] arrayNou = { "Hola", "DAW", "C", "bona", "tarda" };
		System.out.println(arrayNou);
		System.out.println("Array de strings: " + Arrays.toString(arrayNou));

		// Sobreescriure valor
		arrayNou[2] = "patata";
		System.out.println("Array de strings: " + Arrays.toString(arrayNou));		
		
		sc.close();
	}

}
