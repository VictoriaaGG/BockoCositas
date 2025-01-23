package seguridad;

import java.util.Base64;
import java.util.Scanner;

public class DecodificadorBase64 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena de caracteres");
		String cadena = sc.nextLine();
		
		byte[] decodedBytes = Base64.getDecoder().decode(cadena);
		String decodedString = new String(decodedBytes);
		
		System.out.println(decodedString);
		
		sc.close();
	}
}
