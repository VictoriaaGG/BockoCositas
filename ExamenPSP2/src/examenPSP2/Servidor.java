package examenPSP2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	private ServerSocket serverSocket;
	private Integer port;
	private Socket socket;

	public Servidor(int port) throws IOException {
		this.port = port;
		serverSocket = new ServerSocket(port);

	}

	public void stop() throws IOException {
		System.out.println("(Servidor): Cerrando servidor...");
		serverSocket.close();
		System.out.println("(Servidor): Servidor cerrado.");
	}

	public static void main(String[] args) {
		try {
			System.out.println("(Servidor): Abriendo conexión con el servidor...");
			Servidor servidor = new Servidor(6000);
			System.out.println("(Servidor): Conexión establecida.");
			while (true) {
				servidor.socket = servidor.serverSocket.accept();
				Gestor gestor = new Gestor(servidor.socket);
				gestor.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
