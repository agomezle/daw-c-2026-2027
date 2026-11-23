package strings;

public class Characters {

	public static void main(String[] args) {
		
		// Alguns mètodes útils de Character
		
		// IsLowerCase
		char c = 'a';
		boolean esMinuscula = Character.isLowerCase(c);
		System.out.println(esMinuscula);
		
		// IsUpperCase
		boolean esMajuscula = Character.isUpperCase(c);
		System.out.println(esMajuscula);
		
	}

}
