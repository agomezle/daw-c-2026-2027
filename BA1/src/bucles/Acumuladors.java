package bucles;

import java.util.Scanner;

public class Acumuladors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int acumulador = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println("Introdueix una nota: ");
			double nota = sc.nextDouble();
			acumulador += nota; // acumulador = acumulador + nota;
		}
		
		double mitjana = acumulador / 3;
		System.out.println("La teva mitjana és: "+mitjana);

		sc.close();

	}

}
