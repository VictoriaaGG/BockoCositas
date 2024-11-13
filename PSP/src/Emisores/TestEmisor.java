package Emisores;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import carrerasDeCoches.Coche;

public class TestEmisor {

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("grupito");
		int numHilos = 4;
		List<Thread> hilos = new ArrayList<>();
		Character[] chars = {'a','b','c','4'};
		for (int i = 1; i < numHilos+1; i++) {
			Random random = new Random();
			random.nextInt(0,4);
			
			Thread t = new Thread(tg, new Emisor(chars));
			t.start();
			hilos.add(t);
		}
	}

}
