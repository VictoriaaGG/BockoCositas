package procesos;

public class cuentaAtras extends Thread{
	private Integer valorMaximo;
	private String nombre;
	private int valor;
	private static int milis = 300;

	public cuentaAtras(Integer valorMaximo, String nombre) {
		super();
		this.valorMaximo = valorMaximo;
		this.nombre = nombre;
		this.valor = valorMaximo;

	}

	@Override
	public void run() {
		for ( valor = valorMaximo; valor >= 0; valor--) {
			System.out.println(this.toString()); // el objeto sobre el que se ejecute el metodo
			try {
				Thread.sleep(milis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

	@Override
	public String toString() {
		return "cuentaAtras [valorMaximo=" + valorMaximo + ", nombre=" + nombre + ", valor=" + valor + "]";
	}

	public static void main(String[] args) {
		cuentaAtras hola = new cuentaAtras(10, "wuala");
		hola.run();
		cuentaAtras adios = new cuentaAtras(15, "JESUSCRISTO");
		adios.run();
		//run pa hacer el metodo en el mismo hilo
		//start pa hacer el metodo en distintos hilos
	}
}
