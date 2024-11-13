package ejercicio5.service;

public class newUserException extends Exception {

	private static final long serialVersionUID = 1L;

	public newUserException() {
	}

	public newUserException(String message) {
		super(message);

	}

	public newUserException(Throwable cause) {
		super(cause);

	}

	public newUserException(String message, Throwable cause) {
		super(message, cause);

	}

	public newUserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}
