package ceu.dam.ad.mongo.model;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Articulo {

	@NotNull
	private String codigo;
	@NotNull
	private String descripcion;
	@NotNull
	private BigDecimal precio;
	
}
	
