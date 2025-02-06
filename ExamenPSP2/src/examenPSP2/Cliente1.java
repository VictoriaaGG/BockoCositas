package examenPSP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente1 {
	String servidorIP;
	Integer servidorPort;
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pr;

	public Cliente1(String servidorIP, Integer servidorPort) {
		this.servidorIP = servidorIP;
		this.servidorPort = servidorPort;
	}

	public void start() throws UnknownHostException, IOException {
		System.out.println("(Cliente): Estableciendo conexión...");
		socket = new Socket(servidorIP, servidorPort);
		pr = new PrintWriter(socket.getOutputStream(), true);
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println("(Cliente): ¡Conexión establecida!");
	}

	public void close() throws IOException {
		System.out.println("(Cliente): Cerrando conexión...");
		br.close();
		pr.close();
		socket.close();
		System.out.println("(Cliente): Conexión cerrada con éxito.");
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String respuesta = "";
		Cliente1 cliente1 = new Cliente1("localhost", 6000);
		cliente1.start();

		while (!respuesta.equals("#Desconectar#")) {
			System.out.println("Escribe un mensaje con alguno de estos dos formatos: ");
			System.out.println("\t #Suma#num1#num2#");
			System.out.println("\t #Mutiplicación#num1#num2#");
			System.out.println("\t #Palíndromo#radar#");
			respuesta = scanner.nextLine();
			System.out.println(respuesta);
			cliente1.pr.println(respuesta);
			String respuestaServer = cliente1.br.readLine();
			System.out.println(respuestaServer);

		}
		scanner.close();

	}

}
