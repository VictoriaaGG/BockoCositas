package ceu.dam.ad.tema3.ejercicios.ejercicio04.modelo;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Pedido {
	
	@Id
	private Long idPedido;
	private LocalDate fechaPedido;
	private LocalDate fechaEntrega;
	private String cliente;
	private List<PedidoLinea> lineas;
	
	

}
