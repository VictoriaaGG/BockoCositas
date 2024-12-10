package ceu.dam.ad.tema3.ejercicios.ejercicio01.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import ceu.dam.ad.tema3.ejercicios.ejercicio01.model.Pelicula;
import ceu.dam.ad.tema3.ejercicios.ejercicio01.repository.PeliculasRepository;

@Service
public class PeliculasService {

	@Autowired
	private PeliculasRepository repository;

	public List<Pelicula> consultarPeliculas(Integer longitud) throws PeliculasException {
		try {
			return repository.findAll().stream().filter(p -> p.getLongitud() < longitud).toList();
		} catch (DataAccessException e) {
			System.err.println("Error al consultar peliculas");
			throw new PeliculasException("Error al consultar peliculas en BBDD", e);

		}

	}

}
