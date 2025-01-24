package ceu.dam.ad.api.ej1.model;

import java.time.LocalDate;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Data;

@Data
@Entity
public class Actor {
	@Id
	@Column(name = "actor_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Schema(description = "Actor ID. Se debe enviar null para crear nueva entiedad")
	private Integer id;
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	
	@PastOrPresent
	private LocalDate lastUpdate;
}
