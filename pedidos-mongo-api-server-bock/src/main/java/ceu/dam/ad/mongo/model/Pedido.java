package ceu.dam.ad.mongo.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
@Data
@Document
public class Pedido {
	@Id
	private String id;
	@NotBlank(message="El cliente no puede estar en blanco")
	private Cliente cliente;
	@NotBlank(message="La fecha no puede estar en blanco")
	private LocalDate fecha;
	@NotBlank(message="El número no puede estar en blanco")
	private Integer numero;
	@Size(min=1)
	private List<PedidoDetalle> detalles;
	
}
