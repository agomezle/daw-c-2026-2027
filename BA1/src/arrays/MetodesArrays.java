package arrays;

import java.util.Arrays;
import java.util.Random;

public class MetodesArrays {

	public static void main(String[] args) {

		int[] array = { 25, 8, 10, 5682678, -10 };

		// <-------- SORT (ORDENAR ASC) --------->
		Arrays.sort(array); // La classe Arrays s'ha d'importar
		System.out.println("Array ordenat: " + Arrays.toString(array));

		// <-------- BINARY SEARCH --------->
		int index = Arrays.binarySearch(array, 25);
		System.out.println("Índex del número 25: " + index);

		// <-------- FILL --------->
		int[] arrayAOmplir = new int[6];
		Arrays.fill(arrayAOmplir, 5);
		System.out.println("Array després d'omplir: " + Arrays.toString(arrayAOmplir));

		// <-------- RANDOM --------->
		int arrayRandom[] = new int[6];
		Random r = new Random();
		for (int i = 0; i < arrayRandom.length; i++) {
			arrayRandom[i] = r.nextInt();
		}
		System.out.println("Array random: " + Arrays.toString(arrayRandom));

		// <-------- EQUALS --------->
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 5, 4, 3, 2, 1 };

		boolean sonIguals = Arrays.equals(array1, array2);
		System.out.println("Array 1: "+Arrays.toString(array1));
		System.out.println("Array 2: "+Arrays.toString(array2));
		System.out.println("Són iguals els arrays? "+sonIguals);
		
		Arrays.sort(array2);
		sonIguals = Arrays.equals(array1, array2);
		System.out.println("Array 1: "+Arrays.toString(array1));
		System.out.println("Array 2: "+Arrays.toString(array2));
		System.out.println("Són iguals els arrays? "+sonIguals);

		// <-------- COPY OF --------->
		int[] arrayCopia = Arrays.copyOf(array1, 8);
		System.out.println("Còpia d'array d'ints: "+Arrays.toString(arrayCopia));
		
		String[] arrayString = {"a", "b", "c"};
		String[] arraySCopia = Arrays.copyOf(arrayString, 10);
		System.out.println("Còpia d'array de Strings: "+Arrays.toString(arraySCopia));
		
		// <-------- COPY OF RANGE --------->
		// Com el copy, però especificant un rangs
		int[] arrayPetit = Arrays.copyOfRange(array1, 1, 4);
		System.out.println("Còpia petita array: "+Arrays.toString(arrayPetit));
		// El copyOfRange és inclusiu el primer número (from) i exclusiu el segon (to)
	}

}
