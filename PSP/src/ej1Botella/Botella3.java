package ej1Botella;

public class Botella3 implements Runnable{
	private String nombre;
	private char caracter;
	private int cantidad;
	private static long milis = 300;

	public Botella3(String nombre, char caracter, int cantidad) {
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
		Botella3.milis = milis;
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
		Vaciar(); //dentro del metodo run se pone lo que quiere que hagamos el objeto en el hilo
	}

	@Override
	public String toString() {
		return "BotellaDeCaracteres [nombre=" + nombre + ", caracter=" + caracter + ", cantidad=" + cantidad + "]";
	}

	public static void main(String[] args) {
		
		Botella3 b1 = new Botella3("B-1", '*', 10);
		Thread hilo1 = new Thread(b1);//cuando se implementa runnable hay q hacer hilos y ejecutar
		//el run o el start ahi

		Botella3 b2 = new Botella3("B-2", '-', 15);

		Botella3 b3 = new Botella3("B-1", 'A', 6);
		Thread hilo3 = new Thread(b3);
		
		hilo1.start();
		new Thread(b2).start(); //2 formas d ejecutar el aire
		hilo3.start();
	}
}
