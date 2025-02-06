package ceu.dam.ad.mongo.api;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ceu.dam.ad.mongo.model.Pedido;
import ceu.dam.ad.mongo.model.PedidoDetalle;
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
	public Pedido buscarPedidoPorId(@Valid @PathVariable String id) throws DatosIncorrectosException {
		return service.consultarPedido(id);
	}

	@GetMapping
	public List<Pedido> buscarPorFechas(@Valid
			@RequestParam(required = false) @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate desde,
			@Valid @RequestParam(required = false) @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate hasta) {
		if (desde == null) {
			desde = LocalDate.now().minusMonths(1);
			return service.buscarPedidos(desde, hasta);
		}else if(hasta==null) {
			hasta = LocalDate.now();
			return service.buscarPedidos(desde, hasta);
		}
		return service.buscarPedidos(desde, hasta);

	}
	
	@GetMapping("/cliente/{dni}")
	public List<Pedido> buscarPedidosPorCliente(@Valid @PathVariable String dni){
		return service.consultarPedidosCliente(dni);
		
	}
	
	@PutMapping("/{id}")
	public Pedido añadirDetalle(@Valid @PathVariable String id,@Valid @RequestBody PedidoDetalle detalle) throws DatosIncorrectosException {
		return service.añadirDetalle(id, detalle);
	}
}
