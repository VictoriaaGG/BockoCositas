package ceu.dam.ad.tema3.ejercicios.ejercicio02.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import ceu.dam.ad.tema3.ejercicios.ejercicio02.model.Cliente;
import ceu.dam.ad.tema3.ejercicios.ejercicio02.repository.ClientesRepository;

@Service
public class ClienteService {

	@Autowired
	private ClientesRepository repository;

	public Map<String, Cliente> consultarMapaClientes(String email) throws ClientesException {
		try {
			List<Cliente> clientes = repository.findAllByEmail(email);
			return clientes.stream().collect(Collectors.toMap(Cliente::getEmail, c -> c));

		} catch (DataAccessException e) {
			throw new ClientesException();
		}
	}

	/**
	 * public Map<String, Cliente> consultarMapaClientes() throws ClientesException{
	 * try (Connection conn = null){ List<Cliente> clientes =
	 * dao.consultarClientes(conn); return
	 * clientes.stream().collect(Collectors.toMap(Cliente::getEmail, c->c)); }
	 * catch(SQLException e) { System.err.println("Error al consultar cliente");
	 * throw new ClientesException("Error al consultar cliente en BBDD", e); } }
	 */

}
