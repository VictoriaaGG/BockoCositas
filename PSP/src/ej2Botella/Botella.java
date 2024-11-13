package ej2Botella;


public class Botella {
	private String nombre;
	private char caracter;
	private int cantidad;
	private static long milis = 300;

	public Botella(String nombre, char caracter, int cantidad) {
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
		Botella.milis = milis;
	}

	public void vaciar() {
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
}
