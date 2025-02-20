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
		LuciernagaT.setMilis(milis);
	}

	public void enciende() {
		
		 if (!encendido && energia > 0) {
	            encendido = true;
	            this.start();
	        }
		
		}
	
	@Override
    public void run() {
        try {
            while (energia > 0 && encendido) {
                System.out.println(nombre + " - Energía restante: " + energia);
                energia--;
                Thread.sleep(milis);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(nombre + " - La luciérnaga ha sido interrumpida.");
        } finally {
            encendido = false;
            System.out.println(nombre + " - La luciérnaga se ha apagado.");
        }
    }

	
	
	public static void main(String[] args) {
		LuciernagaT a = new LuciernagaT("Manuela", 33);
		LuciernagaT b = new LuciernagaT("Josefa", 3);
		LuciernagaT c = new LuciernagaT("Dolores", 16);

		a.enciende();
		b.enciende();
		c.enciende();
		
	}
}
