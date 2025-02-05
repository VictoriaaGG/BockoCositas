package ceu.dam.ad.mongo.repository;

import java.util.List;

import ceu.dam.ad.mongo.model.Descansito;

public interface CustomDescansosRepository {
	public List<Descansito> buscarPorNumAlumnos(Integer minNumAlumnos);
}
