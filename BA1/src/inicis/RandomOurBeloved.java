package inicis;

import java.util.Random;

public class RandomOurBeloved {

	public static void main(String[] args) {

		// Cridem a la classe Random, igual que fem amb Scanner
		Random r = new Random();

		// Generar un nombre enter random
		int num = r.nextInt();
		System.out.println("El meu enter random: " + num);

		// Generar un nombre decimal random
		double num2 = r.nextDouble();
		System.out.println("El meu decimal random: " + num2);
		
		// RANDOM AMB RANG
		/**
		 * El Random té una coseta curiosa que és que, si li demanes un
		 * rang, la primera xifra s'inclou al rang, però la segona no.
		 * És a dir, si vols un número del 5 al 10, has de posar (5, 11).
		 * Això ho podeu veure si paseu el mouse per sobre de la funció
		 * nextInt i us llegiu els paràmetres que demana.
		 */
		int randomAmbRang = r.nextInt(5, 11);
		System.out.println("Random de 5 a 10: " + randomAmbRang);
		
		// Si només li poseu un paràmetre, intepreta que voleu
		// un número del 0 a l'indicat.
		int randomAmbRang2 = r.nextInt(101);
		System.out.println("Random de 0 a 100: " + randomAmbRang2);

	}

}
