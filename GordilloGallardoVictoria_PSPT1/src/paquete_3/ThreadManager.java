package paquete_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ThreadManager {
	private List<Thread> threads = new ArrayList<>();
	private TreeMap<Long, String> threadStates = new TreeMap<>();

	public void startThreads() {
		// Crea tres hilos CountDown con diferentes valores iniciales
		// y añádelos a la lista threads. Valores:
		// - "C1", 10
		// - "C2", 8
		// - "C3", 7
		CountDown c1 = new CountDown("C1", 10);
		CountDown c2 = new CountDown("C2", 8);
		CountDown c3 = new CountDown("C3", 7);
		ThreadGroup grupoCountDown = new ThreadGroup("GrupoCountDowns");

		Thread hilo1 = new Thread(grupoCountDown, c1, "Hilo-1");
		Thread hilo2 = new Thread(grupoCountDown, c2, "Hilo-2");
		Thread hilo3 = new Thread(grupoCountDown, c3, "Hilo-3");

		Thread[] hilos = new Thread[grupoCountDown.activeCount()];
		// Inicia los hilos recorriendo la lista threads

		for (Thread thread : hilos) {
			thread.start();
			threadStates.put(System.currentTimeMillis(), thread.getName());

		}

		// Guarda el estado de cada hilo en el Map

	}

	public void monitoreaThreads() throws InterruptedException {
		CountDown c1 = new CountDown("C1", 10);
		CountDown c2 = new CountDown("C2", 8);
		CountDown c3 = new CountDown("C3", 7);
		ThreadGroup grupoCountDown = new ThreadGroup("GrupoCountDowns");

		Thread hilo1 = new Thread(grupoCountDown, c1, "Hilo-1");
		Thread hilo2 = new Thread(grupoCountDown, c2, "Hilo-2");
		Thread hilo3 = new Thread(grupoCountDown, c3, "Hilo-3");

		Thread[] hilos = new Thread[grupoCountDown.activeCount()];
		boolean allThreadsTerminated = false;
		hilo1.join();
		hilo2.join();
		hilo3.join();
		for (Thread thread : hilos) {
			threadStates.put(System.currentTimeMillis(), thread.getName());
			try {
				Thread.sleep(90); // Esperar 90 milisegundos antes de
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Monitorea hasta que todos los hilos hayan terminado.
		// Para ello cada 90 milisegundos aproximadamente
		// almacena en el map para cada hilo la información:
		// - clave -> timestamp
		// - valor -> cadena con nombre y estado
		// - ejemplo de la cadena: C1:RUNNABLE
		// y vefica si todos han terminado.
	}

	public void printThreadStates() {
		// Imprimir todos los estados registrados en el TreeMap
		System.out.println("\nResumen de estados de los hilos:");
		for (Map.Entry<Long, String> entry : threadStates.entrySet()) {
			Long key = entry.getKey();
			String val = entry.getValue();
			System.out.println(val + key);

		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadManager manager = new ThreadManager();
		manager.startThreads();
		manager.monitoreaThreads();
		manager.printThreadStates();
		// Responde brevemente a las siguientes preguntas:
		// 1.- Motivo de la frecuencia del estado RUNNABLE
		// 2.- Motivo de la frecuencia del estado TIMED_WAITING
		// 3.- Motivo de la frecuencia del estado TERMINATED
		System.out.println("Respuestas a las preguntas");
		System.out.println("1: ");
		System.out.println("2: ");
		System.out.println("3: ");
	}
}
