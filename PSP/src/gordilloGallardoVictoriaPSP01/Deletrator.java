package gordilloGallardoVictoriaPSP01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Deletrator implements Runnable {
	private String palabra;
	private static int milis = 1000;

	public Deletrator(String palabra, int milis) {
		this.palabra = palabra;
		Deletrator.milis = milis;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < palabra.length(); i++) {
				String salida = "[";

				for (int j = 0; j < palabra.length(); j++) {
					if (j == i) {
						salida += palabra.charAt(j);
					} else {
						salida += '-';
					}
				}
				salida += ']';

				System.out.println("Deletreando \"" + palabra + "\": " + salida);

				Thread.sleep(milis);
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println("El Deletrator ha sido interrumpido.");
		}

	}

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(1);

		Deletrator deletrator = new Deletrator("hola", 1000);
		executor.submit(deletrator);

		executor.shutdown();
	}

}
