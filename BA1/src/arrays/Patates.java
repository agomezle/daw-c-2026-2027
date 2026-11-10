package arrays;

import java.util.Scanner;

public class Patates {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int casos = s.nextInt();
		for (int i = 0; i < casos; i ++ ) {
			int k = s.nextInt();
			int [] arr = new int [k];
			
			for (int j = 0; j < k; j ++ ) {
				arr [j] = s.nextInt();
			}
			int grande = Integer.MIN_VALUE;
			int posi = 0;
			
			for (int j = 0; j < arr.length; j ++) {
				if (arr[j] > grande) {
					grande = arr[j]; // valor
					posi = j; // j = posició
				}
			}
			System.out.println(posi + 1 );
		}

	}

}
