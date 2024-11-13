package gordilloGallardoVictoriaPSP01;

public class LuciernagaT extends Thread{
	private String nombre;
	private Boolean encendido;
	private int energia;
	private static int milis = 100;

	public LuciernagaT(String nombre, int energia) {
		super();
		if (energia >= 1 && energia <= 50) {
			this.nombre = nombre;
			this.encendido = false;
			this.energia = energia;
		} else {
			System.out.println("Error, la energía debe estar entre 1 y 50");
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getEncendido() {
		return encendido;
	}

	public void setEncendido(Boolean encendido) {
		this.encendido = encendido;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public static int getMilis() {
		return milis;
	}

	public static void setMilis(int milis) {
		Luciernaga.setMilis(milis);
	}

	public void enciende() {
		if (this.energia > 0 && encendido == false) {
			encendido = true;
			while (energia > 0) {
				System.out.println(energia);
				energia--;
				try {
					Thread.sleep(milis);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		} else if (encendido = true) {
			while (energia >= 0) {
				System.out.println(energia);
				energia--;
				try {
					Thread.sleep(milis);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		}
		if (energia == 0) {
			encendido = false;
			System.out.println("La energía se ha acabado, luciernaga apagada");
		}
	}

	public static void main(String[] args) {
		Luciernaga a = new Luciernaga("Manuela", 33);
		Luciernaga b = new Luciernaga("Josefa", 3);
		Luciernaga c = new Luciernaga("Dolores", 16);

		a.enciende();
		b.enciende();
		c.enciende();
	}
}
