package llistes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class EstimatsSets {

	public static void main(String[] args) {
		
		// Els SETS serveixen per emmagatzemar valors únics.
		// A més, no tenen índex com les llistes.
		
		// HashSet --> Per tenir valors únics sense ordre
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(1);
		hashSet.add(20);
		hashSet.add(-45);
		hashSet.add(7);
		hashSet.add(7);
		System.out.println("HashSet: "+hashSet);

		// LinkedHashSet --> Per guardar valors amb ordre d'inserció
		LinkedHashSet<Integer> linked = new LinkedHashSet<Integer>();
		linked.add(1);
		linked.add(20);
		linked.add(-45);
		linked.add(7);
		hashSet.add(7);
		System.out.println("LinkedList: "+linked);
		
		// TreeSet --> Per guardar valors ordenats ascendent
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(1);
		treeSet.add(20);
		treeSet.add(-45);
		treeSet.add(7);
		treeSet.add(7);
		System.out.println("TreeSet: "+treeSet);
		
		// TreeSet amb strings
		TreeSet<String> treeString = new TreeSet<String>();
		treeString.add("daw");
		treeString.add("daw");
		treeString.add("dam");
		treeString.add("damvi");
		treeString.add("asix");
		System.out.println("TreeSet amb strings: "+treeString);
		
		// RECÓRRER SETS
		int suma = 0;
		int indice = 0;
		
		System.out.println("Recórrer set:");
		for(int n : treeSet) { // Al no tenir index, s'han de recórrer amb un foreach
			System.out.print(n+" ");
			suma += n;
			indice++;
		}
		System.out.println();
		System.out.println("Total: "+suma+" Quantitat de números: "+indice);
		
	}

}
