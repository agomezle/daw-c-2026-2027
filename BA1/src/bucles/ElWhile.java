package bucles;

import java.util.Scanner;

public class ElWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introdueix un número: ");
		int num = sc.nextInt();

		while (num != 0) { // Condició per quedar-me dins del while
			System.out.println("El número és: " + num);
			System.out.println("Introdueix un número: ");
			num = sc.nextInt(); // Sempre hem de modificar d'alguna forma les variables
			// de la condició del while o no sortirem mai del bucle
		}

		System.out.println("Fi del programa");
		
		sc.close();

	}

}
