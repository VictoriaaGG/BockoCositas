package ceu.dam.prueba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import ceu.dam.prueba.model.Actor;
import ceu.dam.prueba.repositorie.ActorRepository;

@Service
public class ActorService {

	@Autowired // me despreocupo de crear el repositorio, no tengo que instanciarlo
	private ActorRepository repository;

	public Actor consultarActor(Long id) throws ActorNotFoundException {
		Optional<Actor> optional = repository.findById(id);
		Actor actor = optional.get();

		return optional.orElseThrow(() -> new ActorNotFoundException("No existe actor con ese Id"));
		/**
		 * if (!optional.isPresent()) { throw new ActorNotFoundException("No existe
		 * actor con ese Id"); } return actor;
		 */
	}

	// select
	public List<Actor> consultarActores(String primerNombre, String segundoNombre) {
		List<Actor> lista = repository.findByFirstNameContainingOrLastNameContaining(primerNombre, segundoNombre);
		return lista;

	}

	// crear

	public void crearActor(Actor a) throws ActorServiceException {
		try {
			repository.save(a);
		} catch (DataAccessException e) {
			throw new ActorServiceException();
		}
	}

	public void crearActores(List<Actor> actores) throws ActorServiceException {
		try {
			repository.saveAll(actores);
		} catch (DataAccessException e) {
			throw new ActorServiceException();
		}
	}

	public void actualizarActor(Actor a) {
		repository.save(a);
	}

	public void borrarActor(Long id) {
		repository.deleteById(id);
	}
}
