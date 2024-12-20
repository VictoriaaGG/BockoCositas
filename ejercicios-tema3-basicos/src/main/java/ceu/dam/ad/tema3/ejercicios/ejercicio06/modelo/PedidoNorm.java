package ceu.dam.ad.tema3.ejercicios.ejercicio06.modelo;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "pedidos")
public class PedidoNorm {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer idPedido;
	private LocalDate fechaPedido;
	private LocalDate fechaEntrega;
	private String cliente;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_pedido")
	private List<PedidoLineaNorm> lineas;
	
}
