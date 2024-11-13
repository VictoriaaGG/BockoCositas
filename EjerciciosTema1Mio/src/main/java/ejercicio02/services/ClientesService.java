package ejercicio02.services;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

import ejercicio02.dao.ClientesDao;
import ejercicio02.modelo.Cliente;

public class ClientesService extends Service {
	private ClientesDao dao;

	public ClientesService() {
		dao = new ClientesDao();
	}

	public Map<String, Cliente> devolverMapa() throws ClientesException {
		try (Connection conn = abrirConexion()) {
			List<Cliente> lista = dao.devolverClientes(conn);

			Map<String, Cliente> mapa = new HashMap<>();
			// mapa.put(lista.stream().forEach(cliente ->
			// cliente.getEmail()),lista.stream().forEach(cliente ->
			// System.out.println(cliente)));
			mapa = lista.stream().collect(Collectors.toMap(cliente -> cliente.getEmail(), cliente -> cliente));
			return mapa;
		} catch (SQLException e) {
			System.err.println("Error al consultar la base de datos");
			throw new ClientesException("Error", e);
		}

	}

}
