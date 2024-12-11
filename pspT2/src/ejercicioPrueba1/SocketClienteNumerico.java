package ejercicioPrueba1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;

public class SocketClienteNumerico {
	private Socket socket;
	private InputStream is;
	private OutputStream os;
	private int port;
	private String adress;

	public SocketClienteNumerico(int port, String adress) {
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
		SocketClienteNumerico cliente = new SocketClienteNumerico(8082, "localhost");
		try {
			cliente.start();
			for (int i = 0; i <= 254; i++) {
				int datoAEnviar = i;
				cliente.os.write(datoAEnviar);
				System.out.printf("[Cliente] Enviado: %d a %s:%d %n", datoAEnviar, cliente.adress, cliente.port);
				int datoRecibido = cliente.is.read();
				System.out.printf("[Cliente] Recibido %s  %d de %s:%d %n", 
						datoRecibido - datoAEnviar==1? "correctamente": "incorrectamente",
						datoRecibido, cliente.adress, cliente.port);
				
			}
			cliente.stop();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
