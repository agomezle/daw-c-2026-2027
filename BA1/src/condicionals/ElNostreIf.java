package condicionals;

public class ElNostreIf {

	public static void main(String[] args) {

		int numA = 3;
		int numB = 3;

		if (numA >= numB) { // Les condicions sempre han de retornar un boolean (true / false)
			System.out.println("A és més gran o igual que B");
		}
		if (numB > numA) {
			System.out.println("B és més gran que A");
		}
		if (numA == numB) {
			System.out.println("Els dos números són iguals");
		}
		System.out.println("Fi del programa");
	}

}
