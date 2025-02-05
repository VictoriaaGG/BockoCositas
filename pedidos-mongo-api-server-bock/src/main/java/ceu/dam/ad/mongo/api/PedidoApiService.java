package ceu.dam.ad.mongo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ceu.dam.ad.mongo.model.Pedido;
import ceu.dam.ad.mongo.services.DatosIncorrectosException;
import ceu.dam.ad.mongo.services.PedidoServiceImpl;
import jakarta.validation.Valid;

@RestController
@RequestMapping("api/pedidos")
public class PedidoApiService {

	@Autowired
	private PedidoServiceImpl service;

	@PostMapping
	public String crearPedido(@Valid @RequestBody Pedido pedido) throws DatosIncorrectosException {
		return service.registrarPedido(pedido);
	}

	@GetMapping("/{id}")
	public Pedido buscarPedidoPorId(@PathVariable String id) throws DatosIncorrectosException {
		return service.consultarPedido(id);
	}
	
	
}
