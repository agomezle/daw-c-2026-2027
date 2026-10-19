package condicionals;

import java.util.Scanner;

public class AmanecerUltimoDia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int segons = sc.nextInt();
		
		int minuts = segons / 60;
		int hores = minuts / 60;
		int dia = hores / 24 + 1;
		
		int horaDelDia = hores % 24;
		
		if(horaDelDia >= 12) { // Més de 12 hores
			System.out.println("nit del dia "+dia);
		} else { // Menys
			System.out.println("mati del dia "+dia);
		}
		
		sc.close();

	}

}
