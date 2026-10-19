package bucles;

import java.util.Scanner;

public class ElNostreFor {

	public static void main(String[] args) {
		
		// Bucle on la variable de control "i" va en augment
		for(int i = 0; i < 5; i++) {
			System.out.println("La variable i val: "+i);
		}
		System.out.println("Fi del bucle");
		
		// Bucle on la variable de control "i" disminueix
		for(int i = 5; i > 0; i--) {
			System.out.println("La variable i val: "+i);
		}		
		System.out.println("Fi del bucle");
		
		//////////////////////////////
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quants casos de prova té el problema?");
		
		int casos = sc.nextInt();
		
		for (int i = 0; i < casos; i++) {
			System.out.println("Faig el que sigui que em demana el JOEL");
		}
		System.out.println("FI del programa");
		
		sc.close();
	}

}
