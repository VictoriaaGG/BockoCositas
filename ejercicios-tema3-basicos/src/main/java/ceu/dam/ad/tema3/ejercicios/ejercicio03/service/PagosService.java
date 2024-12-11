package ceu.dam.ad.tema3.ejercicios.ejercicio03.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import ceu.dam.ad.tema3.ejercicios.ejercicio02.model.Cliente;
import ceu.dam.ad.tema3.ejercicios.ejercicio02.repository.ClientesRepository;
import ceu.dam.ad.tema3.ejercicios.ejercicio03.model.Pago;
import ceu.dam.ad.tema3.ejercicios.ejercicio03.repository.PagosDao;

@Service
public class PagosService {
	
	private static final Logger log = LoggerFactory.getLogger(PagosService.class);

	@Autowired
	private ClientesRepository clientesRepository;
	@Autowired
	private PagosDao pagosDao;
	
	
	public Map<String,List<Pago>> consultarPagoClientes() throws PagosException{
		try {
			Map<String,List<Pago>> mapa = new HashMap<>();
			List<Cliente> clientes = clientesRepository.findAll();
			for (Cliente cliente : clientes) {
				List<Pago> pagos = pagosDao.findAllByCustomerId(cliente.getId());
				mapa.put(cliente.getEmail(),pagos);
			}
			
			
		}
	}
	/**
	public Map<String, List<Pago>> consultarPagosClientes() throws PagosException{
		try (Connection conn = null){
			Map<String, List<Pago>> mapa = new HashMap<>();
			
			// 1. Obtener lista de clientes de ClienteDao
			List<Cliente> clientes = clientesRepository.consultarClientes(conn);
			// 2. Recorrer la lista de clientes
			for (Cliente cliente : clientes) {
				// 4. Por cada cliente --> Llamar a PagosDao y obtener su lista de pagos
				List<Pago> pagos = pagosDao.consultarPagos(conn, cliente.getId());
				// 5. Meter en el mapa el email del cliente + su lista de pagos
				mapa.put(cliente.getEmail(), pagos);
			}
			return mapa;
		}
		catch(SQLException e) {
			System.err.println("Error al obtener pagos de clientes de bbdd");
			throw new PagosException("Error al obtener pagos de cliente", e);
		}
	}*/
}
