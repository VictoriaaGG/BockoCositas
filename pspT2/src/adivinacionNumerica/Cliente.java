package adivinacionNumerica;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;
import java.util.Scanner;

public class Cliente {
	private Socket socket;
	private InputStream is;
	private OutputStream os;
	private int port;
	private String adress;

	public Cliente(int port, String adress) {
		this.port = port;
		this.adress = adress;
	}

	public void start() throws UnknownHostException, IOException {
		System.out.printf("[Cliente] Lanzando peticion al server... %n");
		socket = new Socket(adress, port);
		is = socket.getInputStream();
		os = socket.getOutputStream();
		System.out.printf("[Cliente] petición aceptada %n");
	}

	public void stop() throws IOException {
		System.out.printf("[Cliente] Cerrando conexión... %n");
		is.close();
		os.close();
		socket.close();
		System.out.println("[Cliente] Conexión cerrada %n");
	}

	public static void main(String[] args) {
		Boolean adivinao = false;
		Random random = new Random();
		Cliente cliente = new Cliente(8082, "localhost");
		try {
			cliente.start();
			while (!adivinao) {
				int datoAEnviar = random.nextInt(1, 11);
				cliente.os.write(datoAEnviar);
				System.out.printf("[Cliente] Enviado: %d a %s:%d %n", datoAEnviar, cliente.adress, cliente.port);
				int datoRecibido = cliente.is.read();
				if (datoRecibido == 0) {
					System.out.println("ole");
					adivinao=true;
					break;
				} else {
					System.out.println("[Cliente] Recibido: " + datoRecibido);
				}
			}
			cliente.stop();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
