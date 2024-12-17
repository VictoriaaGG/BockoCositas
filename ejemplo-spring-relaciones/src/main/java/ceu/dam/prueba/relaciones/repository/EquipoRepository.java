package ceu.dam.prueba.relaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ceu.dam.prueba.relaciones.modelo.Equipo;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo,Integer>{ 

}
