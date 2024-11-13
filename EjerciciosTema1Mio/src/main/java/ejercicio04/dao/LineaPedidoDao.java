package ejercicio04.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mariadb.jdbc.Statement;

import ejercicio04.modelo.LineaPedido;

public class LineaPedidoDao {

	public void insertarLineaPedidos(Connection conn, LineaPedido linea) throws SQLException {
		String sql = "insert pedidos_lineas values(?,?,?,?)";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setLong(1, linea.getIdPedido());
			stmt.setInt(2, linea.getNumeroLinea());
			stmt.setString(3, linea.getArticulo());
			stmt.setBigDecimal(4, linea.getPrecio());
			stmt.execute();
		}
	}

	public List<LineaPedido> consultarLP(Connection conn, Long idPedido) throws SQLException {
		String sql = "select * from pedidos_lineas where id_pedido=?";
		try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			stmt.setLong(1, idPedido);
			List<LineaPedido> resultado = new ArrayList<>();
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				LineaPedido lp = new LineaPedido();
				lp.setIdPedido(rs.getLong("id_pedido"));
				lp.setNumeroLinea(rs.getInt("numero_linea"));
				lp.setArticulo(rs.getString("articulo"));
				lp.setPrecio(rs.getBigDecimal("precio"));
				resultado.add(lp);
			}
			return resultado;
		}
	}
}
