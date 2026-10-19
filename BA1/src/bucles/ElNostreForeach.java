package bucles;

import java.util.Scanner;

public class ElNostreForeach {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String frase = sc.nextLine();		
		String[] paraules = frase.split(" ");
		int iteracio = 0;
		
		/* El bucle foreach és un tipus de bucle que serveix per recòrrer
		 * arrays (conjunts de dades) des de l'inici fins al final */
		for(String paraula : paraules) {
			iteracio++;
			System.out.print(iteracio+" ");
			System.out.println(paraula);
		}
		
		System.out.println("Fi del bucle");
		
		sc.close();

	}

}
