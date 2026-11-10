package arrays;

import java.util.Scanner;

public class LocambiaTodo {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int k = sc.nextInt();

			int[] lista = new int[k];

			for (int j = 0; j < lista.length; j++) {

				lista[j] = sc.nextInt();

			}

			int p1 = sc.nextInt();
			int p2 = sc.nextInt();

			for (int y = 0; y < lista.length; y++) {

				if (lista[y] == p1) {

					lista[y] = p2;
				}

				System.out.print(lista[y] + " ");
			}
			System.out.println();
		}

		sc.close();

	}

}
