package ejercicio03.dao;

import ejercicio03.modelo.Pago;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PagosDao {
	public List<Pago> devolverPagos(Connection conn, Integer id) throws SQLException {
		String sql = "SELECT p.amount, p.payment_date FROM payment p JOIN customer c ON c.customer_id = p.customer_id WHERE p.customer_id= ";
		List<Pago> resultado = new ArrayList<Pago>();
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Pago p = new Pago();
				p.setImporte(rs.getBigDecimal("amount"));
				p.setFecha(rs.getDate("payment_date").toLocalDate());
			}
			return resultado;
	}
}
}
