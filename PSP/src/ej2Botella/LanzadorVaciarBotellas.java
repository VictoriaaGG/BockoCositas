package ej2Botella;

import ej1Botella.Botella2;

public class LanzadorVaciarBotellas extends Thread{
	private Botella botella;

	public LanzadorVaciarBotellas(Botella botella) {
		this.botella = botella;
	}

	public void run() {
		botella.vaciar();
	}
//este metodo de separar el objeto del lanzador/main es el más limpio y el que recomienda el profesor
	public static void main(String[] args) {
		Botella2 b1 = new Botella2("B-1", '*', 10);
		b1.start();

		Botella2 b2 = new Botella2("B-2", '-', 15);
		b2.start();

		Botella2 b3 = new Botella2("B-1", 'A', 6);
		b3.run(); 
	}
}
