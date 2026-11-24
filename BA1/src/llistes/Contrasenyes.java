package llistes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Contrasenyes {

	public static void main(String[] args) {

		// Es pot resoldre també amb arrays

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		ArrayList<String> noms = new ArrayList<String>();
		ArrayList<String> pwd = new ArrayList<String>();

		for (int i = 0; i < t; i++) { // OMPLIR ARRAY DE NOMS
			noms.add(sc.next());
		}

		for (int i = 0; i < t; i++) { // OMPLIR ARRAY DE CONTRASENYES
			pwd.add(sc.next());
		}

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) { // CASOS

			String nom = sc.next();
			String contrasenya = sc.next();

			if (noms.contains(nom)) { // EL NOM EXISTEIX
				int pos = noms.indexOf(nom);
				if (pwd.get(pos).equals(contrasenya)) { // CONTRASENYA COINCIDEIX
					System.out.println("OK");
				} else { // CONTRASENYA INCORRECTA
					System.out.println("contrasenya incorrecta");
				}
			} else { // NOM NO EXISTEIX
				System.out.println("usuari no trobat");
			}

		}

		Collections.sort(noms);
		
		// Imprimir resultado a mano
		for(String nom : noms) {
			System.out.print(nom+" ");
		}

		sc.close();
	}

}
