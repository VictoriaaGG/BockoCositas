package ceu.dam.ad.api.ejemplo.model;

import java.util.UUID;

import org.hibernate.annotations.JdbcTypeCode;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Conductor {
	@Id
	@GeneratedValue
	@JdbcTypeCode(value = java.sql.Types.VARCHAR)
	private UUID uuidConductor;
	private String nombre;
	private Integer edad;

}
