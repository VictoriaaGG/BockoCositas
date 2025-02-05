package ceu.dam.ad.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Cliente {
	
	@Id
	private String id;
	@NotBlank(message="El dni no puede estar en blanco")
	private String dni;
	@NotBlank(message="El nombre no puede estar en blanco")
	private String nombre;
	@NotBlank(message="La dirección no puede estar en blanco")
	private String direccion;
	
	
}
