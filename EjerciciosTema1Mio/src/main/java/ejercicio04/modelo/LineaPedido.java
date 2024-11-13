package ejercicio04.modelo;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class LineaPedido {
	private Long idPedido;
	private int numeroLinea;
	private String articulo;
	private BigDecimal precio;
}
