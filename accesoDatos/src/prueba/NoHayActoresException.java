package prueba;

public class NoHayActoresException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoHayActoresException() {
		super();

	}

	public NoHayActoresException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public NoHayActoresException(String message, Throwable cause) {
		super(message, cause);

	}

	public NoHayActoresException(String message) {
		super(message);

	}

	public NoHayActoresException(Throwable cause) {
		super(cause);

	}

}
