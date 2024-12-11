package ceu.dam.ad.tema3.ejercicios.ejercicio02.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "customer")
@Data
public class Cliente {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) // decirle que el id se genera automaticamente
	@Column(name = "customer_id")
	private Long id;
	@Column(name = "first_name")
	private String nombre;
	@Column(name = "last_name")
	private String apellidos;
	private String email;
	@Column(name = "active")
	private Boolean activo;
	
	
}
