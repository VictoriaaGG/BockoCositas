package ceu.dam.ad.mongo.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
@Data
@Document
public class Pedido {
	@Id
	private String id;
	@NotNull(message="El cliente no puede estar en blanco")
	private Cliente cliente;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	@NotNull
	private LocalDate fecha;
	
	@NotNull
	private Integer numero;
	@Size(min=1)
	private List<PedidoDetalle> detalles;
	
}
