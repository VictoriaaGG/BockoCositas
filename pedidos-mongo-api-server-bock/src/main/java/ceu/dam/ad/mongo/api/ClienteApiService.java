package ceu.dam.ad.mongo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ceu.dam.ad.mongo.model.Cliente;
import ceu.dam.ad.mongo.services.ClienteServiceImpl;
import ceu.dam.ad.mongo.services.DatosIncorrectosException;
import jakarta.validation.Valid;

@RestController
@RequestMapping("api/clientes")
public class ClienteApiService {

	@Autowired
	ClienteServiceImpl service;

	@PostMapping
	public Cliente createCliente(@Valid @RequestBody Cliente cliente) throws DatosIncorrectosException {
		return service.crearCliente(cliente);
	}

	@PutMapping
	public Cliente updateCliente(@Valid @RequestBody Cliente cliente) throws DatosIncorrectosException {
		return service.actualizarCliente(cliente);
	}

	@GetMapping("/{id}")
	public Cliente consultarClientePorId(@PathVariable String id) throws DatosIncorrectosException {
		return service.consultarClienteById(id);
	}

	@GetMapping("/dni/{dni}")
	public Cliente consultarClientePorDni(@Valid @PathVariable String dni) throws DatosIncorrectosException {
		return service.consultarClienteByDni(dni);
	}
}
