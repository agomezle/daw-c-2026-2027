package bucles;

import java.util.Scanner;

public class ElNostreDoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introdueix un número: ");
		int num = sc.nextInt();
		
		/* La diferència entre while i do while és que amb aquest
		 * el contingut del bucle s'executarà almenys un cop, sense
		 * importar si la condició és certa o no. */
		do {
			System.out.println("El número és: " + num);
			System.out.println("Introdueix un número: ");
			num = sc.nextInt();
		} while(num != 0);

		System.out.println("Fi del programa");
		
		sc.close();

	}

}
