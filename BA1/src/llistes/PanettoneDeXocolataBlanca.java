package llistes;

import java.util.ArrayList;
import java.util.Scanner;

public class PanettoneDeXocolataBlanca {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();

		for (int i = 0; i < casos; i++) {

			int n = sc.nextInt();

			ArrayList<Integer> panettones = new ArrayList<>();

			panettones.add(0); // 0 - Classic Xocolata
			panettones.add(0); // 1 - Xocolata blanca
			panettones.add(0); // 2 - Fruites
			panettones.add(0); // 3 - Tradicional

			for (int j = 0; j < n; j++) {

				String tipus = sc.next();

				switch (tipus) {
				case "ClassicXocolata":
					panettones.set(0, panettones.get(0) + 1);
					break;
				case "XocolataBlanca":
					panettones.set(1, panettones.get(1) + 1);
					break;
				case "Fruites":
					panettones.set(2, panettones.get(2) + 1);
					break;
				case "Tradicional":
					// Forma més llarga però fa el mateix que les altres
					int quantitat = panettones.get(3) + 1;
					panettones.set(3, quantitat); 
					break;

				}

			}
			
			for(int p : panettones) {
				System.out.print(p+" ");
			}
			System.out.println();
			
		}

		sc.close();

	}

}
