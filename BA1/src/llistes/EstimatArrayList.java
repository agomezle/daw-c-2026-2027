package llistes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EstimatArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> miLista = new ArrayList<Integer>();

		// Imprimir
		System.out.println(miLista);

		// AFEGIR COSETES
		miLista.add(8);
		miLista.add(7);
		miLista.add(105);
		miLista.add(8999);
		miLista.add(-56);

		System.out.println(miLista);

		// AFEGIR COSETES EN POSICIÓ
		Scanner sc = new Scanner(System.in);
		miLista.add(1, 89);
		System.out.println(miLista);
		
		miLista.set(1, 45); // substitueix el que hi ha en la posició indicada
		System.out.println(miLista);
		
		// ELIMINAR COSETES
		miLista.remove(0);
		System.out.println(miLista);

		// RECUPERAR DADES
		System.out.println(miLista.get(0)); // equivalent array[0]

		// CONTAINS
		System.out.println(miLista.contains(89));

		// CLEAR
		// miLista.clear();
		System.out.println(miLista);

		// EQUALS I CLONE
		ArrayList<Integer> clon = (ArrayList<Integer>) miLista.clone();
		System.out.println("Clon: " + clon);
		System.out.println("MiLista és igual que clon? " 
				+ clon.equals(miLista));

		// INDEX OF
		System.out.println("Posició de 89: "+miLista.indexOf(89));
		
		// IS EMPTY
		//miLista.clear();
		System.out.println(miLista.isEmpty());
		
		// SUBLIST
		List<Integer> lista = miLista.subList(2, 5);
		System.out.println(lista);
		
		/* <------------ COLLECTIONS -----------> */
		
		// SORT
		System.out.println(miLista);
		Collections.sort(miLista);
		System.out.println(miLista);
		
		// REVERSE
		Collections.reverse(miLista);
		System.out.println(miLista);
		
		// SWAP
		Collections.swap(miLista, 1, 3);
		System.out.println(miLista);
		
		
		// LLEGIR LLISTA AMB FORMAT
		for(int n : miLista) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		for(int i = 0; i < miLista.size(); i++) {
			System.out.print(miLista.get(i)+" ");
		}
	}

}
