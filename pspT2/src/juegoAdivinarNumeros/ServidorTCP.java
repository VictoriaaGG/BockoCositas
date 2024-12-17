package juegoAdivinarNumeros;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTCP {

	private ServerSocket serverSocket;

	ServidorTCP(int puerto) throws IOException {
		serverSocket =  new ServerSocket(puerto);
		while(true) {
			Socket socket = serverSocket.accept();
			System.out.println("(Server) Conexión establecida.");
			new GestorProcesos(socket).start();
		}
	}
	
	public void stop() throws IOException {
		serverSocket.close();
	}
	
	public static void main(String[] args) {
		
	}
	
	
}
