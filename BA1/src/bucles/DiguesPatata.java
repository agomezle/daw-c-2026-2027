package bucles;

import java.util.Scanner;

public class DiguesPatata {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		sc.nextLine();
		
		// Com sé el nombre de casos que haig de tractar,
		// és millor fer un bucle for
		for(int i = 0; i < casos; i++) {
			String text = sc.nextLine();
			System.out.println(text);
		}		
		
		sc.close();

	}

}
