package gordilloGallardoVictoriaPSP01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LuciernagaR implements Runnable{
	private String nombre;
	private Boolean encendido;
	private int energia;
	private static int milis = 100;

	public LuciernagaR(String nombre, int energia) {
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
		LuciernagaR.milis = milis;
	}

	public void enciende(ExecutorService executor) {
		
		 if (!encendido && energia > 0) {
	            encendido = true;
	            executor.submit(this);
	        }
		
		}
	public void enciende() {
		
		 if (!encendido && energia > 0) {
	            encendido = true;
	            this.run();
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
		LuciernagaR a = new LuciernagaR("Manuela", 33);
		LuciernagaR b = new LuciernagaR("Josefa", 3);
		LuciernagaR c = new LuciernagaR("Dolores", 16);

		new Thread(a).start();
		new Thread(b).start();
		new Thread(c).start();
		
		ExecutorService executor = Executors.newFixedThreadPool(1);

		
        a.enciende(executor);
        a.enciende(executor);
        a.enciende(executor);

        executor.shutdown();
		
	}
}
