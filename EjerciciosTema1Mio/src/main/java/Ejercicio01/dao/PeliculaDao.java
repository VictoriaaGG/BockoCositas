package Ejercicio01.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Ejercicio01.service.Pelicula;


public class PeliculaDao {
	public List<Pelicula> buscar(Connection conn, String filtro) throws SQLException {
		List<Pelicula> lista = new ArrayList<>();
		String sql = "select * from actor where first_name like ? or last_name like ?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, filtro);
			stmt.setString(2, filtro);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Pelicula pelicula = new Pelicula();
				pelicula.setId(rs.getInt("film_id"));
				pelicula.setTitulo(rs.getString("title"));
				pelicula.setLongitud(rs.getInt("length"));
				lista.add(pelicula);
			}
			return lista;
		}
	}
}
