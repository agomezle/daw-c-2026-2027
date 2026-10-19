package condicionals;

import java.util.Scanner;

public class DiferenciaGranPetit2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int diferencia = 0;

		if (a > b && a > c) { // A és més gran
			if (b < c) { // B és més petit
				diferencia = a - b;
			}
			else {
				diferencia = a - c;
			}
		}
		else if (b > c && b > a) { // B és més gran
			if (a < c) { // A és més petit
				diferencia = b - a;
			}
			else { // C és més petit
				diferencia = b - c;
			}
		}
		else { // C és més gran
			if (a < b) { // A és més petit
				diferencia = c - a;
			}
			else { // B és més petit
				diferencia = c - b;
			}
		}
		
		System.out.println(diferencia);

		sc.close();
	}

}
