package ceu.dam.ad.tema3.ejercicios.ejercicio06.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ceu.dam.ad.tema3.ejercicios.ejercicio06.modelo.PedidoNorm;

@Repository
public interface PedidoRepositoryNorm extends JpaRepository<PedidoNorm, Integer>{

}
