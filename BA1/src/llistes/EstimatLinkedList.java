package llistes;

import java.util.LinkedList;
import java.util.List;

public class EstimatLinkedList {

	public static void main(String[] args) {
		
		/**
		 * Fer servir ArrayList habitualment: ocupa menys memòria i és més ràpid per recòrrer o cercar dins.
		 * Fer servir LinkedList quan faràs moltes operacions d'afegir, eliminar o consultar als extrems 
		 * (inici o final).
		 */
		
		List<String> linked = new LinkedList<String>();
		
		linked.add("daw");
		linked.add("dam");
		linked.add("damvi");
		
		System.out.println(linked);
		
		// Mètodes propis útils:
		
		linked.addFirst("asix");
		System.out.println(linked);
		
		linked.addLast("smx");
		System.out.println(linked);
		
		linked.removeFirst();
		System.out.println(linked);
		
		linked.removeLast();
		System.out.println(linked);
	}

}
