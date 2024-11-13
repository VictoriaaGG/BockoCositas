package ejercicio7Cafeteria;

import java.util.Random;

public class Profesor implements Runnable {
	private Cafeteria cafeteria;
	private static Random random = new Random();

	public Profesor(Cafeteria cafeteria) {
		this.cafeteria = cafeteria;
	}

	public void consumir() {
		while (true) {
			int segundosEsperandoFuera = random.nextInt(3) + 1;
			try {
				Thread.sleep(segundosEsperandoFuera * 1000);
				if (cafeteria.haySitio()) {
					cafeteria.entraPersona();
					int segundosEsperandoParaSalir = random.nextInt(4) + 2;
					Thread.sleep(1000 * segundosEsperandoParaSalir);
					cafeteria.salePersona();
				} else
					System.out.println("Alumno no ha podido entrar en la cafetería.");

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void run() {
		consumir();
	}
}
