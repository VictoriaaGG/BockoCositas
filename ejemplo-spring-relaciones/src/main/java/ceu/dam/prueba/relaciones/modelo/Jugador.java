package ceu.dam.prueba.relaciones.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Jugador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idJugador;
	private int dorsal;
	private String nombre;
	
	
	//el JoinColumn no puede ir en ambas keys, por eso se pone en donde esta como la foreign key
	@ManyToOne
	@JoinColumn(name = "id_equipo")
	private Equipo equipo;
	
	//le modificamos el to String pa que no escriba el equipo y nos pete
	public String toString() {
		return idJugador + " - " + dorsal + " - " + nombre;
	}
}
