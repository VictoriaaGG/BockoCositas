package ejercicioPrueba1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerNumerico {

	private ServerSocket serverSocket;
	private Socket socket;
	private InputStream is;
	private OutputStream os;
	private int port;

	public SocketServerNumerico(int port) throws IOException {

		serverSocket = new ServerSocket(port);

		this.port = port;
	}

	public void start() throws IOException {
		System.out.printf("[Servidor] Esperando conexión... %n");

		socket = serverSocket.accept();
		System.out.printf("[Servidor] Conexión establecida %n");
		is = socket.getInputStream();
		os = socket.getOutputStream();

	}

	public void stop() throws IOException {
		System.out.printf("[Servidor] Cerrando conexión... %n");

		is.close();
		os.close();
		socket.close();
		serverSocket.close();
		System.out.println("[Servidor] Conexión cerrada %n");
	}

	public static void main(String[] args) {
		SocketServerNumerico sv;

		try {
			Boolean recibido = true;
			sv = new SocketServerNumerico(8082);
			sv.start();
			while (recibido) {
				int datoLeido = sv.is.read();
				if (datoLeido == -1) {
					recibido = false;
					break;
				}
				System.out.printf("[Servidor] Datos recibido: %d %n", datoLeido);
				int datoADevolver = datoLeido + 1;
				sv.os.write(datoADevolver);
				System.out.printf("[Servidor] Datos enviado: %d %n", datoADevolver);

			}
			sv.stop();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
