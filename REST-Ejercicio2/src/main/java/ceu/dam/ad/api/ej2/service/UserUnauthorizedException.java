package ceu.dam.ad.api.ej2.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NON_AUTHORITATIVE_INFORMATION)
public class UserUnauthorizedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserUnauthorizedException() {
		// TODO Auto-generated constructor stub
	}

	public UserUnauthorizedException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public UserUnauthorizedException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public UserUnauthorizedException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UserUnauthorizedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
