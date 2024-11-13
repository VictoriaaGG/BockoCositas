package Emisores;

public class Emisor implements Runnable{
	private char character;
	private int segundos;

	public Emisor(char character, int segundos) {
		super();
		this.character = character;
		this.segundos = segundos;
	}
	
	public void emite() {
		
	}
	
	public void run() {
		emite();
	}

}
