package ejercicio04.modelo;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class Pedido {
	private Long idPedido;
	private LocalDate fechaPedido;
	private LocalDate fechaEntrega;
	private String cliente;
	private List<LineaPedido> lineaPedidos;
}
