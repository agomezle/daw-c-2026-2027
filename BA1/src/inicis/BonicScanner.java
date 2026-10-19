package inicis;

import java.util.Scanner;

public class BonicScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Introduir int
		System.out.println("Introdueix un enter");
		int num = sc.nextInt();
		System.out.println("El teu número és: " + num);
		
		// Introduir decimal
		System.out.println("Introdueix un decimal");
		double num2 = sc.nextDouble();
		System.out.println("El teu decimal és: " + num2 + ".");

		// Introduir un text
		System.out.println("Introdueix un text");
		// OH NO, EL BUG!!
		// Si nextLine ve després de nextInt o nextDouble, hem de netejar
		// la línia anterior
		sc.nextLine(); // <--- Això abans del string que volem llegir
		String text = sc.nextLine();
		System.out.println("El teu text és: "+text);
		
		sc.close(); // Tanquem l'Scanner
		
	}

}
