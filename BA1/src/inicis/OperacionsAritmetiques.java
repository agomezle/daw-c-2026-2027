package inicis;

public class OperacionsAritmetiques {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 13;
		int c = 0;
		
		// SUMA		
		c = a + b;
		System.out.println(c);
		
		// RESTA
		c = a - b; // Reutilitzo la variable "c" perquè el resultat anterior no el necessitaré més
		System.out.println(c);
		
		// MULTIPLICACIÓ
		c = a * b;
		System.out.println(c);
		
		// DIVISIÓ
		c = a / b;
		//No es mostren els decimals perquè la variable "c" és de tipus int (enter)
		System.out.println(c); 
		
		double aDecimal = 5;
		double bDecimal = 13;
		
		double cDecimal = aDecimal / bDecimal;
		System.out.println(cDecimal);

		// RESIDU / MÒDUL
		cDecimal = aDecimal % bDecimal;
		System.out.println(cDecimal);
		
		int num1 = 14;
		
		// És divisible entre 2?
		int divisible = num1 % 2;
		System.out.println(divisible); // És divisible perquè el residu és 0
		
	}

}
