package condicionals;

import java.util.Scanner;

public class Eleccions2020V3AND {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int jiden = sc.nextInt();
		int drump = sc.nextInt();
		int banders = sc.nextInt();

		if (jiden > drump && jiden > banders) {
			System.out.println("Jiden");
		} else if (drump > jiden && drump > banders) {
			System.out.println("Drump");
		} else {
			System.out.println("Banders");
		}

		sc.close();

	}

}
