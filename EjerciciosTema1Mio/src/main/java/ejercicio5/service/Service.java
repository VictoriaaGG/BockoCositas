package ejercicio5.service;

import ejercicio5.modelo.Usuario;

public interface Service {

	public void changePass(Long id, String pass, String passNew) throws UserException;

	public Usuario registerUser(Usuario user) throws UserException;

	public Usuario loginUser(String login, String pass) throws UserException;

	public Usuario consultUser(Long id) throws UserException;
}
