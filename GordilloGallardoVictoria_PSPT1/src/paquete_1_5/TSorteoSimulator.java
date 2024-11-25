package paquete_1_5;

import java.util.ArrayList;
import java.util.Collections;

public class TSorteoSimulator extends Thread {
	private String nombreSorteo;
	private int numInicial;
	private int numFinal;
	private int cantidadBolas;
	private static long milis = 0;

	public TSorteoSimulator(String nombreSorteo, int numInicial, int numFinal, int cantidadBolas) {
		super();
		this.nombreSorteo = nombreSorteo;
		this.numInicial = numInicial;
		this.numFinal = numFinal;
		this.cantidadBolas = cantidadBolas;
	}

	public void generarUnaCombinacionGanadora(long milis) {
		TSorteoSimulator.milis = milis;
		this.start();
	}

	public void run() {
		ArrayList<Integer> bombo = new ArrayList<>();
		for (int i = numInicial; i < numFinal; i++) {
			bombo.add(i);
		}
		Collections.shuffle(bombo);
		for (int i = 0; i < cantidadBolas; i++) {
			System.out.println("- " + nombreSorteo + ": " + bombo.get(i));
			try {
				Thread.sleep(milis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(nombreSorteo + " les desea mucha suerte.");
	}

	@Override
	public String toString() {
		return "Sorteo " + nombreSorteo + " desde la bola " + numInicial + " a la " + numFinal + " donde se extraen "
				+ cantidadBolas + "bolas.";
	}

	public static void main(String[] args) {
		TSorteoSimulator bonolotoIt = new TSorteoSimulator("bonoloto italiana", 1, 90, 5);

		bonolotoIt.toString();
		bonolotoIt.generarUnaCombinacionGanadora(300);
	}
}
