package bucles;

import java.util.Scanner;

public class HarrisonFor {

	public static void main(String[] args) {	

		Scanner sc = new Scanner(System.in);
		
		int diners = sc.nextInt();
		
		for(int i = 1000000; i <= diners; i+=1000000) {
			System.out.println(i);
		}
		
		sc.close();

	}

}
