package llistes;

import java.util.Scanner;

public class FansDeFnatic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();

		for (int i = 0; i < casos; i++) {
			int n = sc.nextInt();
			sc.nextLine();

			int victorias = 0;
			int derrotas = 0;

			for (int j = 0; j < n; j++) {
				String[] partido = sc.nextLine().split(" - ");

				if(partido[0].equals("Fnatic") && partido[1].equals("Fnatic")) {
					victorias++;
					derrotas++;
				}
				else if (partido[0].equals("Fnatic")) {
					victorias++;
				} else if (partido[1].equals("Fnatic")) {
					derrotas++;
				}

			}

			System.out.println(victorias + " " + derrotas);

		}

		sc.close();
	}

}
