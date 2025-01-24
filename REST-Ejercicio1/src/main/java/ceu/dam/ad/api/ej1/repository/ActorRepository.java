package ceu.dam.ad.api.ej1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ceu.dam.ad.api.ej1.model.Actor;
import java.time.LocalDate;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer> {
	public List<Actor> findByFirstNameContainingOrLastNameContaining(String filtro1, String filtro2);

	public List<Actor> findByLastUpdateBetween(LocalDate fecha1, LocalDate fecha2);
}
