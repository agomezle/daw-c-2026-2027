package condicionals;

public class ElNostreElse {

	public static void main(String[] args) {
		
		int numA = 5;
		int numB = 2;
		
		if(numA > numB) {
			System.out.println("El numero A és més gran");
		}
		else if(numA == numB){ // Else if implica que només entra aquí si NO ha entrat als if/else if anteriors
			System.out.println("El numero A és igual que el número B");
		}
		else { // Else implica que només entra aquí si NO era certa cap condició anterior
			System.out.println("El numero B és més gran");
		}

	}

}
