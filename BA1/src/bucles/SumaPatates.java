package bucles;

import java.util.Scanner;

public class SumaPatates {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();

		int sumaTotal = 0;
		
		for (int i = 0; i < k; i++) {
			int patates = sc.nextInt();
			sumaTotal += patates;
		}
		
		System.out.println(sumaTotal);

		sc.close();
	}

}
