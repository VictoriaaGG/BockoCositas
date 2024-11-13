package ej1Botella;

public class BotellaDeCaracteres {
	private String nombre;
	private char caracter;
	private int cantidad;
	private static long milis=300;

	public BotellaDeCaracteres(String nombre, char caracter, int cantidad) {
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
		BotellaDeCaracteres.milis = milis;
	}

	public void Vaciar() {
		while(cantidad>0) {
			System.out.print(caracter);
			cantidad--;
			try {
				Thread.sleep(milis);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

	@Override
	public String toString() {
		return "BotellaDeCaracteres [nombre=" + nombre + ", caracter=" + caracter + ", cantidad=" + cantidad + "]";
	}

	public static void main(String[] args) {
		
		BotellaDeCaracteres b1 = new BotellaDeCaracteres("B-1",'*',10);
		b1.Vaciar();

		BotellaDeCaracteres b2 = new BotellaDeCaracteres("B-2",'-',15);
		b2.Vaciar();

		BotellaDeCaracteres b3 = new BotellaDeCaracteres("B-1",'A',6);
		b3.Vaciar();

	}
}
