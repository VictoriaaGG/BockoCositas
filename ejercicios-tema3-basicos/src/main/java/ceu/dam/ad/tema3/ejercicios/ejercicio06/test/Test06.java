package ceu.dam.ad.tema3.ejercicios.ejercicio06.test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

import ceu.dam.ad.tema3.ejercicios.ejercicio06.modelo.PedidoNorm;
import ceu.dam.ad.tema3.ejercicios.ejercicio06.modelo.PedidoLineaNorm;
import ceu.dam.ad.tema3.ejercicios.ejercicio06.service.PedidoException;
import ceu.dam.ad.tema3.ejercicios.ejercicio06.service.PedidoNotFoundException;
import ceu.dam.ad.tema3.ejercicios.ejercicio06.service.PedidosServiceNorm;

public class Test06 {
	public void test() {
		PedidoNorm pedidoNorm = new PedidoNorm();
		pedidoNorm.setFechaPedido(LocalDate.now());
		pedidoNorm.setFechaEntrega(LocalDate.of(2024, 12, 1));
		pedidoNorm.setCliente("Lucas Cangrejo");
		pedidoNorm.setLineas(new ArrayList<PedidoLineaNorm>());
		
		for (int j = 1; j <= 3; j++) {
			PedidoLineaNorm linea = new PedidoLineaNorm();
			linea.setArticulo("Artículo " + j);
			linea.setPrecio(new BigDecimal(938));
			pedidoNorm.getLineas().add(linea);
		}
		
		PedidosServiceNorm service = new PedidosServiceNorm();
		try {
			Integer idPedido = service.crearPedido(pedidoNorm);
			System.out.println("Pedido registrado con id: " + idPedido);
			
			PedidoNorm consultado = service.consultarPedido(idPedido);
			System.out.println(consultado);
		} catch (PedidoException e) {
			e.printStackTrace();
		} catch (PedidoNotFoundException e) {
			System.out.println(e);
		}
		
		
	}
}
