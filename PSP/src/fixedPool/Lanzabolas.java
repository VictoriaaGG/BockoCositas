package fixedPool;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Lanzabolas implements Runnable{
	private String nombre;

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public Lanzabolas(String nombre) {
		super();
		this.nombre = nombre;
	}


	@Override
	public void run() {
		LocalDateTime hora = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println("Lanzando bola desde " + this.nombre + " a las " + hora.format(formatter));
	}
}
