package procesos;

public class cuentaAtrasRunneable implements Runnable {
	private Integer valorMaximo;
	private String nombre;
	private int valor;
	private static int milis = 300;

	public cuentaAtrasRunneable(Integer valorMaximo, String nombre) {
		super();
		this.valorMaximo = valorMaximo;
		this.nombre = nombre;
		this.valor = valorMaximo;

	}

	public void run() {
		for ( valor = valorMaximo; valor >= 0; valor--) {
			System.out.println(this.toString()); 
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
		cuentaAtrasRunneable hola = new cuentaAtrasRunneable(10, "wuala");
		cuentaAtrasRunneable adios = new cuentaAtrasRunneable(15, "JESUSCRISTO");
		new Thread(hola).start();//utilizar crear thread e implementar runnable en vez de extender desde thread. Más limpio.
		new Thread(adios).start();
		//run pa hacer el metodo en el mismo hilo (no se mezclan)
		//start pa hacer el metodo en distintos hilos (se mezclan)
		
	}
}
