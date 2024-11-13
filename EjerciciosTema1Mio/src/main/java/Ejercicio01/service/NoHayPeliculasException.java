package Ejercicio01.service;

public class NoHayPeliculasException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoHayPeliculasException() {
		super();
		
	}

	public NoHayPeliculasException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public NoHayPeliculasException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public NoHayPeliculasException(String message) {
		super(message);
		
	}

	public NoHayPeliculasException(Throwable cause) {
		super(cause);
		
	}
	

}
