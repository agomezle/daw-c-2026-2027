package condicionals;

import java.util.Scanner;

public class ElNostreSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introdueix a quin grup pertanys: ");
		String lletra = sc.nextLine();

		// El switch és similar a una cadena de else if, 
		// comparant només el valor d'una sola variable
		
		switch (lletra) {
		case "A":
			System.out.println("Pertanys al grup A");
			break;
		case "B":
			System.out.println("Pertanys al grup B");
			break;
		default:
			System.out.println("Aquest grup no existeix");
			break;
		}

		sc.close();

	}

}
