package adivinacionNumerica;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;


public class Server {

	private ServerSocket serverSocket;
	private Socket socket;
	private InputStream is;
	private OutputStream os;
	private int port;

	public Server(int port) throws IOException {
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
		Server sv;
		try {
			Boolean adivinado = false;
			Random random = new Random();
			Integer aleatorio = random.nextInt(1, 11);
			sv = new Server(8082);
			sv.start();

			while (!adivinado) {
				int datoADevolver;
				int datoLeido = sv.is.read();
				if (datoLeido == aleatorio) {
					adivinado = true;
					datoADevolver = 0;
					sv.os.write(datoADevolver);
					break;
				} else {
					if (datoLeido > aleatorio) {
						datoADevolver = 1;
						sv.os.write(datoADevolver);
					} else {
						datoADevolver = 2;
						sv.os.write(datoADevolver);
					}
				}
				System.out.printf("[Servidor] Datos recibido: %d %n", datoLeido);
				System.out.printf("[Servidor] Datos enviado: %d %n", datoADevolver);
			}
			sv.stop();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
