package inicis;

import java.util.Scanner;

public class CaramelsSobrants {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int caramels = sc.nextInt();
		int persones = sc.nextInt();
		
		/*
		 * El mòdul (%) ens serveix per veure quants
		 * caramels sobren (residu de la divisió)
		 */
		int sobrants = caramels % persones;
		
		System.out.println(sobrants);
		
		sc.close();
	}

}
