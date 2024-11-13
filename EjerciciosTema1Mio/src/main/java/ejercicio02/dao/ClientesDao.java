package ejercicio02.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ejercicio02.modelo.Cliente;

public class ClientesDao {

	public List<Cliente> devolverClientes(Connection conn) throws SQLException {
		ResultSet rs = null;
		List<Cliente> resultado = new ArrayList<Cliente>();
		try (Statement stmt = conn.createStatement()) {
			rs = stmt.executeQuery("select * from customer");
			while (rs.next()) {
				Cliente c = new Cliente();
				c.setId(rs.getInt("customer_id"));
				c.setFirstName(rs.getString("first_name"));
				c.setLastName(rs.getString("last_name"));
				c.setEmail(rs.getString("email"));
				c.setActivo(rs.getBoolean("active"));
				resultado.add(c);
			}
		}
		return resultado;
	}
}
