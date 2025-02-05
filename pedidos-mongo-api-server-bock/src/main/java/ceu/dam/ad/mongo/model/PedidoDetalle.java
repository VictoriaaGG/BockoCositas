package ceu.dam.ad.mongo.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidoDetalle {

	@NotBlank
	private Articulo articulo;
	@Min(1)
	private Integer cantidad;
	
}
