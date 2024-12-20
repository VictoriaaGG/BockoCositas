package ceu.dam.ad.tema3.ejercicios.ejercicio06.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ceu.dam.ad.tema3.ejercicios.ejercicio06.modelo.PedidoLineaNorm;

@Repository
public interface LineaPedidoRepositoryNorm extends JpaRepository<PedidoLineaNorm, Integer>{

}
