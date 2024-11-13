package ejercicio5.modelo;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Usuario {
	private Long id;
	private String username;
	private String pass;
	private String email;
	private LocalDate fechaAlta;
	private LocalDate fechaUltLogin;
}
