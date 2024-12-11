package paquete_4;

import java.util.ArrayList;
import java.util.List;

public class Run {
	public static void main(String[] args) {
		LogMensajes logMensajes = new LogMensajes();

		ThreadGroup tg = new ThreadGroup("grupito");
		List<Thread> hilos = new ArrayList<>();
		for (int i = 1; i < 11; i++) {
			Thread t = new Thread(tg, new Usuario("U-" + i, logMensajes));
			t.start();
			hilos.add(t);
		}

		try {
			for (Thread thread : hilos) {
				thread.join();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Crear y lanzar 10 usuarios como hilos

		// Esperar hasta fin de todos los hilos

		// Imprimir todos los mensajes registrados

	}
}
