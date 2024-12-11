package ceu.dam.prueba.repositorie;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ceu.dam.prueba.model.Actor;

//en T va el modelo y en Id el tipo del id
@Repository // con esto ya esta el DAO básico hecho
public interface ActorRepository extends JpaRepository<Actor, Long> {
	public List<Actor> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName);

}
