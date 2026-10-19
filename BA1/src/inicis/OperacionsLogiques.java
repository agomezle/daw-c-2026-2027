package inicis;

public class OperacionsLogiques {

	public static void main(String[] args) {

		int numA = 12;
		int numB = 10;
		boolean resultat;

		// Operacions amb números
		resultat = numA > numB;
		System.out.println("NumA és més gran que B? " + resultat);

		resultat = numA < numB;
		System.out.println("NumA és més petit que B? " + resultat);

		resultat = numA == numB;
		System.out.println("NumA és igual que B? " + resultat);

		resultat = numA != numB;
		System.out.println("NumA és diferent que B? " + resultat);

		resultat = numA >= numB;
		System.out.println("NumA és més gran o igual que B? " + resultat);

		resultat = numA <= numB;
		System.out.println("NumA és més petit o igual que B? " + resultat);

		// Operacions amb boolean
		boolean a = false;
		boolean b = true;

		resultat = a || b; // || indica un OR, serà true si un dels dos és cert
		System.out.println("A o B són certs? " + resultat);

		resultat = a && b; // && indica un AND, serà true si els dos són certs
		System.out.println("A i B són certs? " + resultat);

		resultat = !a; // ! indica negar
		System.out.println("Neguem A. Resultat ara és: " + resultat);

		// Operacions amb String
		String nomA = "Ana";
		String nomB = "Juan";

		resultat = nomA.equals(nomB); // Els String es comparen amb equals
		// NO es comparen amb == mai a la vida, no funciona
		System.out.println("Els noms són iguals? " + resultat);

	}

}
