package ceu.dam.ad.mongo.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ceu.dam.ad.mongo.model.Pedido;
import ceu.dam.ad.mongo.model.PedidoDetalle;
import ceu.dam.ad.mongo.repository.PedidoRepository;

@Service
public class PedidoServiceImpl {

	@Autowired
	private PedidoRepository rep;

	public String registrarPedido(Pedido pedido) throws DatosIncorrectosException {
		if (rep.findByNumero(pedido.getNumero()) != null) {
			throw new DatosIncorrectosException("Ya hay un pedido con ese número");
		}
		return rep.save(pedido).getId();
	}

	public Pedido consultarPedido(String id) throws DatosIncorrectosException {
		Optional<Pedido> pedido = rep.findById(id);
		if (!pedido.isPresent()) {
			throw new DatosIncorrectosException("No hay ningún pedido con ese id");
		}
		return pedido.get();
	}

	public List<Pedido> buscarPedidos(LocalDate desde, LocalDate hasta) {
		return rep.findByFechaBetween(desde, hasta);

	}

	public List<Pedido> consultarPedidosCliente(String dni) {
		return rep.buscarPorDniCliente(dni);
	}

	public Pedido añadirDetalle(String id, PedidoDetalle detalle) throws DatosIncorrectosException {
		Optional<Pedido> pedidoOpt = rep.findById(id);
		if (!pedidoOpt.isPresent()) {
			throw new DatosIncorrectosException("No hay ningún pedido con ese id");
		}
		Pedido pedido = pedidoOpt.get();
		pedido.getDetalles().add(detalle);
		return rep.save(pedido);

	}

}
