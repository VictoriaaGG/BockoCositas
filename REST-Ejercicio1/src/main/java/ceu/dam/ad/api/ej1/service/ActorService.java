package ceu.dam.ad.api.ej1.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ceu.dam.ad.api.ej1.model.Actor;
import ceu.dam.ad.api.ej1.repository.ActorRepository;

@Service
public class ActorService {

	@Autowired
	ActorRepository rep;

	@Transactional
	public Actor crearActor(Actor actor) {
		actor.setLastUpdate(LocalDate.now());
		return rep.save(actor);
	}

	@Transactional
	public Actor actualizarActor(Actor actor) {
		actor.setLastUpdate(LocalDate.now());
		return rep.save(actor);
	}

	@Transactional
	public void borrarActor(Integer id) {
		rep.deleteById(id);
	}

	public Actor consultarActor(Integer id) throws NotFoundException {
		Optional<Actor> actorOpt = rep.findById(id);
		if (!actorOpt.isPresent()) {
			throw new NotFoundException("No existe coche con el id indicado");
		}
		Actor actor = actorOpt.get();
		return actor;
	}

	public List<Actor> buscarActoresNombreApellido(String filtro) {
		List<Actor> lista = rep.findByFirstNameContainingOrLastNameContaining(filtro, filtro);
		return lista;
	}

	public List<Actor> buscarActoresFecha(LocalDate fecha1, LocalDate fecha2) {
		if (fecha1 == null) {
			fecha1 = LocalDate.of(1900, 1, 1);
		}
		if (fecha2 == null) {
			fecha2 = LocalDate.of(2900, 1, 1);
		}
		List<Actor> lista = rep.findByLastUpdateBetween(fecha1, fecha2);
		return lista;
	}
}
