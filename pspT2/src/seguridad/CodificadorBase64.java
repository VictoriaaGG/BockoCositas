package seguridad;

import java.util.Base64;
import java.util.Scanner;

public class CodificadorBase64 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena de caracteres");
		String cadena = sc.nextLine();
		
		byte[] encodedBytes = Base64.getEncoder().encode(cadena.getBytes());
		String decodedString = new String(encodedBytes);
		
		System.out.println(decodedString);
		
		sc.close();
	}
}
