package carrerasDeCoches;

import java.util.Random;

public class Coche implements Runnable{
	private String nombre;
	private Integer kmEntrePausas;
	private Integer kmRecorridos;
	private Carrera carrera;
	private static Random random = new Random();

	public Coche(String nombre, Integer kmEntrePausas, Carrera carrera) {
		this.nombre = nombre;
		this.kmEntrePausas = kmEntrePausas;
		this.carrera = carrera;
		kmRecorridos = 0;
	}

	public void correrCarrera() {
		do {
			avanzar();
			System.out.printf("[Km %d] %s.%n ", kmRecorridos, nombre);
			pausar();
		} while (kmRecorridos < carrera.getKmTotales());
		System.out.printf("%s ha finalizado la carrera.%n ", nombre);
		carrera.subirAlPodio(nombre);
	}

	public void avanzar() {
		kmRecorridos += kmEntrePausas;
		if (kmRecorridos > carrera.getKmTotales()) {
			kmRecorridos = carrera.getKmTotales();
		}
	}

	public void pausar() {
		
		 try {
			int esperando = random.nextInt(4);
			Thread.sleep(esperando*1000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void run() {
		correrCarrera();
	}
}
