import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		System.out.println("introduce un n�mero entero!!!!!");
		Scanner sc = new Scanner(System.in);
		int numero = 0;

		try {
			numero = sc.nextInt();
			sc.nextLine();
		} catch (InputMismatchException e1) {
			System.out.println("No est�s introducioendo un entero");
			sc.nextLine();
		}

		try {
			numero = sc.nextInt();
			sc.nextLine();
		} catch (InputMismatchException e1) {
			System.out.println("No est�s introducioendo un entero");
			sc.nextLine();
		}

		System.out.println("fin de programa");
	}
}
