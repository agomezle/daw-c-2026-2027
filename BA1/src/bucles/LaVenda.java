package bucles;

import java.util.Scanner;

public class LaVenda {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();

		for (int i = 0; i < casos; i++) {
			int velMeva = sc.nextInt();
			int velCompany = sc.nextInt();
			int velEnemic = sc.nextInt();
			int distAmbEnemic = sc.nextInt();
			int distAmbTorre = sc.nextInt();
			
			int distEnemicTorre = distAmbEnemic + distAmbTorre;
			
			boolean enemiGuanya = distEnemicTorre * velMeva <= distAmbTorre * velEnemic;
			boolean companyViu = distAmbTorre * velEnemic < distEnemicTorre * velCompany;
			
			if(companyViu && distAmbEnemic != 0) {
				System.out.println("SALVATS");
			}
			else if(enemiGuanya || companyViu) {
				System.out.println("MORTS");
			}
			else {
				System.out.println("LA VENDA");
			}
			
		}

		sc.close();

	}

}