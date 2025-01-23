package seguridad;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.Scanner;

public class CodificarFichero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mete la ruta del archivo de entrada");
		String rutaArchivoEntrada = scanner.nextLine();
		System.out.println("Mete la ruta del archivo de salida");
		String rutaArchivoSalida = scanner.nextLine();
		codificarMetodo(rutaArchivoEntrada, rutaArchivoSalida);
		decodificarMetodo(rutaArchivoEntrada, rutaArchivoSalida);
		scanner.close();

	}

	public static void codificarMetodo(String rutaEntrada, String rutaSalida) {
		try {

			byte[] archivoBytes = Files.readAllBytes(Paths.get(rutaEntrada));

			String archivoCodificado = Base64.getEncoder().encodeToString(archivoBytes);

			Files.write(Paths.get(rutaSalida), archivoCodificado.getBytes());

			System.out.println("El archivo ha sido codificado exitosamente y guardado como " + rutaSalida);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void decodificarMetodo(String rutaEntrada, String rutaSalida) {
		try {

			String archivoCodificado = new String(Files.readAllBytes(Paths.get(rutaEntrada)));

			byte[] archivoDecodificado = Base64.getDecoder().decode(archivoCodificado);

			Files.write(Paths.get(rutaSalida), archivoDecodificado);

			System.out.println("El archivo ha sido decodificado exitosamente y guardado como " + rutaSalida);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
