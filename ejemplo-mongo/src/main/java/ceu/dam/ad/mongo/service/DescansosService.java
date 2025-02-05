package ceu.dam.ad.mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ceu.dam.ad.mongo.model.Descansito;
import ceu.dam.ad.mongo.repository.DescansosRepository;

@Service
public class DescansosService {
	@Autowired
	private DescansosRepository rep;

	public Descansito crearDescanso(Descansito des) {
		return rep.save(des);
	}

	public List<Descansito> buscarPorProfesor(String profesor) {
		return rep.findByProfesor(profesor);
	}

	public List<Descansito> buscarPorNumAlumnos(Integer minimo) {
		return rep.buscarPorNumAlumnos(minimo);
	}
}
