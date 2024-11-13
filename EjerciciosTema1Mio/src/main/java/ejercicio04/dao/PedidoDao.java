package ejercicio04.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.mariadb.jdbc.Statement;

import ejercicio04.modelo.Pedido;

public class PedidoDao {

	public Long insertarPedido(Connection conn, Pedido pedido) throws SQLException {
		String sql = "insert into pedidos (fecha_pedido, fecha_entrega, cliente) values (?,?,?)";
		try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
			stmt.setDate(1, Date.valueOf(pedido.getFechaPedido()));
			stmt.setDate(2, Date.valueOf(pedido.getFechaEntrega()));
			stmt.setString(3, pedido.getCliente());
			stmt.execute();
			ResultSet rs = stmt.getGeneratedKeys();
			rs.next();
			return rs.getLong(1);
		}
	}

	public Pedido consultarP(Connection conn, Long idPedido) throws SQLException {

		String sql = "select * from pedidos where idPedido= ?";
		Pedido p = new Pedido();

		try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
			stmt.setLong(1, idPedido);
			ResultSet rs = stmt.executeQuery();
			if(rs!=null) {
			p.setIdPedido(rs.getLong("id_pedido"));
			p.setFechaPedido(rs.getDate("fecha_pedido").toLocalDate());
			p.setFechaEntrega(rs.getDate("fecha_entrega").toLocalDate());
			p.setCliente(rs.getString("cliente"));
			}
			else {
				return null;
			}
		}
		return p;
	}

}
