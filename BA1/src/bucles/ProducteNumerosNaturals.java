package bucles;

import java.util.Scanner;

public class ProducteNumerosNaturals {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();

		for (int i = 0; i < k; i++) {

			int n = sc.nextInt();

			if (n <= 0) {
				System.out.println("ELS NOMBRES NATURALS COMENCEN EN 1");
			} else {
				int suma = 0;
				int producte = 1;

				for (int j = 1; j <= n; j++) {
					suma += j; // suma = suma + j;
					producte *= j; // producte = producte * j;
				}

				System.out.println("SUMA: " + suma + " PRODUCTE: " + producte);
			}
		}

		sc.close();
	}

}
