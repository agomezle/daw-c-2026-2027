package arrays;

import java.util.Scanner;

public class Indice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			
			int posicio = -1;
			int k = sc.nextInt();
			int[] k2 = new int[k];
			
			for (int j = 0; j < k; j++) {
				k2[j] = sc.nextInt();
			}
			int foli = sc.nextInt();
			
			for (int h = 0; h < k; h++) {
				if (k2[h] == foli) {
					if (posicio == -1) {
						posicio = h;
					}
				}
			}
			System.out.println(posicio);
		}

	}

}
