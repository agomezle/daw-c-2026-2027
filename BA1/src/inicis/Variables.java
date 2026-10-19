package inicis;

public class Variables {

	public static void main(String[] args) {
		
		// --- TIPUS DE VARIABLES BÀSICS ---
		// (Els que farem servir més)
		
		// boolean: només true / false
		boolean activat; // Declarar variable
		activat = true; // Inicialitzar variable: Assignar valor
		
		System.out.println("Activat? "+activat);

		// int: enters
		int numero = 5; // Declarar i assignar valor en una línia
		System.out.println("Valor enter: "+ numero);
		
		// double: decimals (fins a 15 dígits decimals)
		double numDecimal = 3.149658;
		System.out.println("Valor decimal: "+ numDecimal);
		
		// String: text 
		/* S'escriu amb la primera lletra en majúscules perquè no és un tipus primitiu, sinó una classe. */
		String text = "Hola DAW";
		System.out.println(text);
		
		// --- ALTRES TIPUS DE VARIABLES ---
		
		// long: enter que permet emmagatzemar números més grans que l'int
		long bigNumber = 100000000000L;
		System.out.println("Número gran: " + bigNumber);
		
		// float: decimal que només permet fins a 7 dígits decimals i ocupa menys espai de memòria (4 bytes)
		float decimalPetit = 4.67f;
		System.out.println("Decimal float: " + decimalPetit);
		
		// char: per emmagatzemar caràcters
		char lletra = 'P'; // cal fer servir cometes simples, al contrari que amb String
		System.out.println("Caràcter: " + lletra);
		
	}

}
