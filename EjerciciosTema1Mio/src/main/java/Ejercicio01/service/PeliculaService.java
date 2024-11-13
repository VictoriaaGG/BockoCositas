package Ejercicio01.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import Ejercicio01.dao.Dao;
import Ejercicio01.dao.PeliculaDao;


public class PeliculaService extends Dao {
	private PeliculaDao dao;
	public List<Pelicula> consultarPeliculas(String filtro) throws NoHayPeliculasException { 
		try (Connection conn = abrirConexion()) {
			return dao.buscar(conn, "%" + filtro + "%");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new  NoHayPeliculasException("No hay pelis así,friki");
		}

	}
}
