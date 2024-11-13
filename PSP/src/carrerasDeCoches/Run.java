package carrerasDeCoches;

import java.util.ArrayList;
import java.util.List;

public class Run {
	public static void main(String[] args) {
		int numCoches = 3;
		Carrera carrera = new Carrera(1000);

		ThreadGroup tg = new ThreadGroup("grupito");
		List<Thread> hilos = new ArrayList<>();
		for (int i = 1; i < numCoches+1; i++) {
			Thread t = new Thread(tg, new Coche("C-" + i, 100, carrera));
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

		System.out.println(tg.activeCount());
		try {
			Thread.sleep(2_000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		carrera.imprimirPodio();

	}
}
