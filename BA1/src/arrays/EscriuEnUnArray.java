package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EscriuEnUnArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		int[] array = new int[k]; // Indiquem que el tamany és k

		int n = sc.nextInt(); // Posició que volem cercar
		
		for(int i = 0; i < k; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int i = 0; i < k; i++) {
			System.out.print(array[i]+" ");
		}		
		
		System.out.println(array[n]);
		
		sc.close();
	}

}
