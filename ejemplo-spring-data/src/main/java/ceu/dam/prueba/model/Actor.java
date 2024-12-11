package ceu.dam.prueba.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity // le digo que está en la base de datos
//@Table(name = "actores") en caso de que la tabla se llame  de otra forma
@Data
public class Actor {

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // decirle que el id se genera automaticamente
	@Column(name = "actor_id")
	private Long id;
	private String firstName;
	private String lastName;
	
	
	

}
