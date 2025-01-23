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
		return rep.save(actor);
	}
	@Transactional
	public Actor actualizarActor(Actor actor) {
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

	public List<Actor> buscarActoresNombreApellido(String filtro, String filtro2) {
		List<Actor> lista = rep.findByFirstNameOrLastNameContaining(filtro, filtro2);
		return lista;
	}

	public List<Actor> buscarActoresFecha(LocalDate fecha1, LocalDate fecha2) {
		List<Actor> lista = rep.findByLastUpdateBetween(fecha1, fecha2);
		return lista;
	}
}
