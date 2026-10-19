package inicis;

import java.util.Scanner;

public class FormesDeSumar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// Normal de tota la vida
		n = n + 4;
		System.out.println(n);
		
		// Sumar el número indicat al que ja tenim acumulat
		n += 5;
		System.out.println(n);
		
		// Sumar 1 amb ++ directament
		n++;
		System.out.println(n);
		
		
		sc.close();

	}

}
