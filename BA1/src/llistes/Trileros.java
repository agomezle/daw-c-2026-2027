package llistes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Trileros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cubiletes = sc.nextInt();

		ArrayList<Integer> lista = new ArrayList<>();

		lista.add(1);

		for (int i = 0; i < cubiletes - 1; i++) {
			lista.add(0);
		}

		int pos1 = sc.nextInt();
		int pos2 = sc.nextInt();

		while (pos1 != -1 && pos2 != -1) {
			
			Collections.swap(lista, pos1, pos2);
			
			pos1 = sc.nextInt();
			pos2 = sc.nextInt();
		}

		System.out.println(lista);
		System.out.println(lista.indexOf(1));		
		
		sc.close();

	}

}
