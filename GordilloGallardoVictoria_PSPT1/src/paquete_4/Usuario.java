package paquete_4;

import java.util.Random;

public class Usuario implements Runnable {
	private String nombre;
	private static Random random = new Random();
	// Para enlazar el log de mensajes a usar
	private LogMensajes logMensajes;
	// Para gestionar el próximo ID de mensajes de usuario
	private static Long nextIdMensaje = 0L;

	public Usuario(String nombre, LogMensajes logMensajes) {
		this.nombre = nombre;
		this.logMensajes = logMensajes;
	}

	public void enviarMensajes(LogMensajes logMensajes) {

		for (int i = 0; i < 100; i++) {
			enviarMensaje();
			pausar();
		}

		logMensajes.imprimirColaMensajes();

		// Ciclo continuo para enviar 100 mensajes con esperas aleatorias

	}

	public void enviarMensaje() {
		nextIdMensaje++;
		logMensajes.registrarMensaje(nextIdMensaje);

		// Registra un nuevo ID de mansaje en la lista de mensajes en logMensajes

	}

	public void pausar() {
		while (true) {
			int segundosEsperando = random.nextInt(200, 400) + 1;
			try {
				Thread.sleep(segundosEsperando * 1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void run() {
		this.enviarMensajes(logMensajes);
	}

}
