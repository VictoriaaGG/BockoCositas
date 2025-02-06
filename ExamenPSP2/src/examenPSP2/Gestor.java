package examenPSP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Gestor extends Thread {

	private BufferedReader br;
	private PrintWriter pr;
	private Socket socket;

	public Gestor(Socket socket) {
		this.socket = socket;
	}

	public void lanzarProceso() throws IOException {
		pr = new PrintWriter(socket.getOutputStream(), true);
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		try {
			String inputLine = br.readLine();
			do {
				String[] array = inputLine.split("#");
				Integer resultado = 0;
				String respuesta = "";
				if (!inputLine.startsWith("#")) {
					respuesta = "#Instrucción no válida#";
					pr.println(respuesta);
				}
				if (array[1].equals("Suma")) {
					resultado = Integer.parseInt(array[2]) + Integer.parseInt(array[3]);
					pr.println(resultado);
				} else if (array[0].equals("Multiplicación")) {
					resultado = Integer.parseInt(array[2]) * Integer.parseInt(array[3]);
					pr.println(resultado);

				} else if (array[1].equals("Palíndromo")) {
					String[] array2 = array[2].split("");
					for (int i = 0, j = array2.length - 1; i < (array2.length - 1) / 2; i++, j--) {
						if (!array[i].equals(array2[j])) {
							respuesta = "No";
							break;
						}
						respuesta = "Sí";

					}
					pr.write(respuesta);
				} else if (array[1].equals("#Desconectar#")) {
					respuesta = "#Desconectado#";
					pr.println(respuesta);
				}
			} while (!inputLine.equals("#Desconectar#"));

		} catch (Exception e) {
			e.printStackTrace();
			pr.println("Error en el procesamiento");
		} finally {
			socket.close();
			br.close();
			pr.close();
		}
	}

	public void run() {
		try {
			lanzarProceso();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
