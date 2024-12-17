package ceu.dam.ad.tema3.ejercicios.ejercicio04.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import ceu.dam.ad.tema3.ejercicios.ejercicio04.modelo.Pedido;
import ceu.dam.ad.tema3.ejercicios.ejercicio04.modelo.PedidoLinea;
import ceu.dam.ad.tema3.ejercicios.ejercicio04.repository.PedidoLineaRepository;
import ceu.dam.ad.tema3.ejercicios.ejercicio04.repository.PedidoRepository;
import jakarta.transaction.Transactional;

@Service
public class PedidosService {

	private static final Logger log = LoggerFactory.getLogger(PedidosService.class);

	@Autowired
	private PedidoRepository repositoryPedido;
	@Autowired
	private PedidoLineaRepository repositoryLinea;

	public Pedido consultarPedido(Long idPedido) throws PedidoException, PedidoNotFoundException {
		log.debug("Consultando pedido con id " + idPedido);
		try {
			Optional<Pedido> optional = repositoryPedido.findById(idPedido);
			Pedido pedido = optional.get();
			pedido.setLineas(repositoryLinea.findAllByIdPedido(idPedido));
			return optional.orElseThrow(() -> new PedidoNotFoundException("No se ha encontrado el pedido con id"));
		} catch (DataAccessException e) {
			log.error("Error registrando pedido", e);
			throw new PedidoException("Error al registrar pedido", e);
		}
	}
	
	@Transactional
	public Long crearPedido(Pedido pedido) throws PedidoException {
		log.debug("Creando nuevo pedido....");
		try {
			try {
				log.debug("Insertando datos generales del pedido...");
				repositoryPedido.save(pedido);
				Integer numLinea = 1;
				log.debug("Insertando líneas del pedido...");
				for (PedidoLinea linea : pedido.getLineas()) {
					linea.setIdPedido(pedido.getIdPedido());
					linea.setNumLinea(numLinea);
					numLinea++;
					repositoryLinea.save(linea);
				}
				log.info("Pedido registrado con id " + pedido.getIdPedido());
				Optional<Pedido> optional = repositoryPedido.findById(pedido.getIdPedido());
				Pedido pedidoMetido = optional.get();
				return pedidoMetido.getIdPedido();
			} catch (DataAccessException e) {
				throw e;
			}
		} catch (DataAccessException e) {
			log.error("Error creando pedido", e);
			throw new PedidoException("Error al registrar pedido", e);
		}
	}

}
