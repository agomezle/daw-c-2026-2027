package condicionals;

import java.util.Scanner;

public class Eleccions2020V3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int jiden = sc.nextInt();
		int drump = sc.nextInt();
		int banders = sc.nextInt();

		if (jiden > drump) {
			if (jiden > banders) {
				System.out.println("Jiden");
			} else { // Banders té més vots que Jiden
				System.out.println("Banders");
			}
		} else {
			if (drump > banders) {
				System.out.println("Drump");
			} else { // Banders té més vots que Drump
				System.out.println("Banders");
			}
		}
		
		System.out.println("Fi del programa");

		sc.close();

	}

}
