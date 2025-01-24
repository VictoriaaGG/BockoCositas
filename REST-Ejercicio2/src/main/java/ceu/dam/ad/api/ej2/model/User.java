package ceu.dam.ad.api.ej2.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	@Size(min = 5, max = 30)
	private String username;
	@Email
	@NotBlank
	private String email;
	@NotBlank
	@Size(min = 8)
	private String password;
	@Column(name = "fecha_alta")
	private LocalDate createdDate;
	@Column(name = "fecha_ult_login")
	private LocalDate lastLoginDate;

}
