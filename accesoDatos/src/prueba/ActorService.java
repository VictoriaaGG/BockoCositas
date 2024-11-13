package prueba;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ActorDao;

public class ActorService extends Dao {
	private ActorDao dao;

	public List<Actor> consultarActores(String filtro) throws NoHayActoresException { 
		try (Connection conn = abrirConexion()) {
			return dao.buscar(conn, "%" + filtro + "%");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new NoHayActoresException("miau");
		}

	}
}
