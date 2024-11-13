package ej1Botella;

public class Botella2 extends Thread {
	private String nombre;
	private char caracter;
	private int cantidad;
	private static long milis = 300;

	public Botella2(String nombre, char caracter, int cantidad) {
		super();
		this.nombre = nombre;
		this.caracter = caracter;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getCaracter() {
		return caracter;
	}

	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public static long getMilis() {
		return milis;
	}

	public static void setMilis(long milis) {
		Botella2.milis = milis;
	}

	public void Vaciar() {
		while (cantidad > 0) {
			System.out.print(caracter);
			cantidad--;
			try {
				Thread.sleep(milis);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	public void run() {
		this.Vaciar(); //dentro del metodo run se pone lo que quiere que hagamos el objeto en el hilo
	}

	@Override
	public String toString() {
		return "BotellaDeCaracteres [nombre=" + nombre + ", caracter=" + caracter + ", cantidad=" + cantidad + "]";
	}

	public static void main(String[] args) {

		Botella2 b1 = new Botella2("B-1", '*', 10);
		b1.start(); //se usa start para multihilo

		Botella2 b2 = new Botella2("B-2", '-', 15);
		b2.start();

		Botella2 b3 = new Botella2("B-1", 'A', 6);
		b3.run(); //se usa run para un hilo solo

	}
}
