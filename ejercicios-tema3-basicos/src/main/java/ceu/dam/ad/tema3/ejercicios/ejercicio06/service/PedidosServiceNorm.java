package ceu.dam.ad.tema3.ejercicios.ejercicio06.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import ceu.dam.ad.tema3.ejercicios.ejercicio06.modelo.PedidoNorm;
import ceu.dam.ad.tema3.ejercicios.ejercicio06.modelo.PedidoLineaNorm;
import ceu.dam.ad.tema3.ejercicios.ejercicio06.repository.PedidoRepositoryNorm;

@Service
public class PedidosServiceNorm {
	private static final Logger log = LoggerFactory.getLogger(PedidosServiceNorm.class);

	@Autowired
	private PedidoRepositoryNorm pedidoRep;

	public PedidoNorm consultarPedido(Integer idPedido) throws PedidoException, PedidoNotFoundException {
		log.debug("Consultando pedido con id " + idPedido);
		try {
			Optional<PedidoNorm> pedidoOpt = pedidoRep.findById(idPedido);
			return pedidoOpt.orElseThrow(() -> new PedidoNotFoundException("No existe pedido con ese Id"));
		} catch (DataAccessException e) {
			log.error("Error registrando pedido", e);
			throw new PedidoException("Error al registrar pedido", e);
		}
	}

	public Integer crearPedido(PedidoNorm pedidoNorm) throws PedidoException {
		log.debug("Creando nuevo pedido....");
		try {
			try {
				log.debug("Insertando datos generales del pedido...");
				Integer numLinea = 1;
				log.debug("Insertando líneas del pedido...");
				for (PedidoLineaNorm linea : pedidoNorm.getLineas()) {
					linea.setNumeroLinea(numLinea);
					numLinea++;
				}

				pedidoRep.save(pedidoNorm);
				log.info("Pedido registrado con id " + pedidoNorm.getIdPedido());
				return pedidoNorm.getIdPedido();
			} catch (DataAccessException e) {
				throw e;
			}
		} catch (DataAccessException e) {
			log.error("Error creando pedido", e);
			throw new PedidoException("Error al registrar pedido", e);
		}
	}
}
