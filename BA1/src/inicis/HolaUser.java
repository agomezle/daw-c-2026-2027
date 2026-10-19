package inicis;

import java.util.Scanner;

public class HolaUser {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Declarem i inicialitzem el nostre Scanner
		
		String user = sc.nextLine(); // Amb l'Scanner, llegim la línia que introdueix l'usuari al terminal i el guardem a la variable "user"
		
		System.out.println("Hola, " + user); // Imprimim per pantalla "Hola, " + el nom d'usuari que hem guardat
		
		sc.close(); // Tanquem l'Scanner al final		

	}

}
