package ceu.dam.prueba.relaciones;


import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ceu.dam.prueba.relaciones.modelo.Equipo;
import ceu.dam.prueba.relaciones.modelo.Estadio;
import ceu.dam.prueba.relaciones.modelo.Jugador;
import ceu.dam.prueba.relaciones.repository.EquipoRepository;
import ceu.dam.prueba.relaciones.repository.JugadorRepository;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		EquipoRepository repo = context.getBean(EquipoRepository.class);
		JugadorRepository repoJu = context.getBean(JugadorRepository.class);
		
		
		
		/**Jugador jugador = repoJu.findById(3).get();
		System.out.println(jugador);*/
		
	/**	Estadio estadio = new Estadio();
		estadio.setCapacidad(99999);
		estadio.setCiudad("SHANGAI");
		
		Equipo equipo = new Equipo();
		equipo.setNombre("CALAMARES FC");
		equipo.setEstadio(estadio);
		
		repo.save(equipo);*/

		Optional<Equipo> equipoOpt = repo.findById(2);
		Equipo equipo = equipoOpt.get();
		System.out.println(equipo);

	}

}
