package strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringIStringBuilder {

	public static void main(String[] args) {

		String text = "Hola, nens de DAW-C";

		// REPÀS: Recòrrer strings
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			System.out.println(c);
		}

		// COMPARAR
		System.out.println(text.equals("Patata"));

		String text2 = "patata";
		System.out.println(text2.equalsIgnoreCase("Patata"));

		// BUSCAR
		System.out.println(text.indexOf("W"));
		System.out.println(text.indexOf("AW"));
		System.out.println(text.lastIndexOf("n"));
		System.out.println("Conté DAW? " + text.contains("DAW"));

		// RETALLAR
		String subtext = text.substring(10);
		System.out.println(subtext);
		subtext = text.substring(10, 13);
		System.out.println(subtext);

		// UPPER / LOWER CASE
		System.out.println(text.toLowerCase());
		System.out.println(text.toUpperCase());

		// ARRAYS <--- A lo que venimos
		System.out.println("\nSPLIT: ");
		String[] textRetallat = text.split(" ");
		for (String t : textRetallat) {
			System.out.println(t);
		}

		System.out.println("\nCHAR ARRAY: ");
		char[] lletres = text2.toCharArray();
		System.out.println(Arrays.toString(lletres));

		// STRING BUILDER
		System.out.println("\n String Builder:");
		
		StringBuilder sb = new StringBuilder("Text inici");
		System.out.println(sb);
		sb.append(" patata");
		System.out.println(sb.toString());
		sb.reverse();
		System.out.println(sb.toString());
		sb.reverse();
		sb.insert(3, text2);
		System.out.println(sb.toString());
		
		// NEXT -- AGAFA TEXT FINS QUE TROBA UN ESPAI
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			String s = sc.next();
			System.out.println(s);
		}

		// TRIM
		String textMalament = "  aaaaaa bb   ";
		System.out.println(textMalament);
		System.out.println(textMalament.trim());
	}

}
