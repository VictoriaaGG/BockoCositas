package ceu.dam.ad.tema3.ejercicios.ejercicio04.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;

@Data
@Entity
@IdClass(PedidoLineaKey.class)
public class PedidoLinea {

	@Id
	private Long idPedido;
	@Id
	private Integer numLinea;
	private String articulo;
	private BigDecimal precio;
	

}
