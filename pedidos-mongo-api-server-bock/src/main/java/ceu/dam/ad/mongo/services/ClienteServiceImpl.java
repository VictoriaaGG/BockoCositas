package ceu.dam.ad.mongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ceu.dam.ad.mongo.model.Cliente;
import ceu.dam.ad.mongo.repository.ClienteRepository;

@Service
public class ClienteServiceImpl {

	@Autowired
	private ClienteRepository rep;

	public Cliente crearCliente(Cliente cliente) throws DatosIncorrectosException {
		
		if (rep.findByDni(cliente.getDni())==null) {
			throw new DatosIncorrectosException("Ya hay un cliente así");
		}
		return rep.save(cliente);
	}

	public Cliente actualizarCliente(Cliente cliente) throws DatosIncorrectosException {
			if (rep.findByDni(cliente.getDni()) == null) {
				throw new DatosIncorrectosException("No hay ningún cliente con ese dni.");
			}
			return rep.save(cliente);
		
	}

	public Cliente consultarClienteById(String id) throws DatosIncorrectosException {
		Optional<Cliente> clienteOpt = rep.findById(id);
		if (!clienteOpt.isPresent()) {
			throw new DatosIncorrectosException("No hay ningún cliente con ese id.");
		}
		return clienteOpt.get();
	}
	
	public Cliente consultarClienteByDni(String dni) throws DatosIncorrectosException{
		if(rep.findByDni(dni)==null) {
			throw new DatosIncorrectosException("No hay ningún cliente con ese dni.");
		}
		
		return rep.findByDni(dni);
	}
}
