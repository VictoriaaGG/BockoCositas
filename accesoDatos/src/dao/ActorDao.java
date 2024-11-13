package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import prueba.Actor;

public class ActorDao {

	public List<Actor> buscar(Connection conn, String filtro) throws SQLException {
		List<Actor> lista = new ArrayList<>();
		String sql = "select * from actor where first_name like ? or last_name like ?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, filtro);
			stmt.setString(2, filtro);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Actor actor = new Actor();
				actor.setActor_id(rs.getInt("actor_id"));
				actor.setFirst_name(rs.getString("first_name"));
				actor.setLast_name(rs.getString("last_name"));
				lista.add(actor);
			}
			return lista;
		}
	}
}
