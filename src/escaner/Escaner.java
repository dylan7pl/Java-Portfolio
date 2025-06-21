package escaner;

import java.util.Scanner;

public class Escaner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingresar nombre");
		String entrada = scanner.nextLine();
		
		System.out.println("Hola "+entrada);
		
		System.out.println("Tu edad? ");
		int edad = scanner.nextInt();
		
		System.out.println("Hola "+entrada+", tu edad es "+edad+" años");
		
		scanner.nextLine(); // limpia la entrada por el caracter \n

	}
}
