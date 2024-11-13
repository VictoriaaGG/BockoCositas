package vGordillo7875_PruebaInicial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce 3 personas,primero el dni y luego el nombre");

		List<Persona> lista = new ArrayList<>();

		for (int i = 0; i <= 3; i++) {

			String dni = scanner.nextLine();
			String nombre = scanner.nextLine();
			Persona a = new Persona(dni, nombre);
			lista.add(a);
		}

		System.out.println(lista);
		
		scanner.close();
	}

}
