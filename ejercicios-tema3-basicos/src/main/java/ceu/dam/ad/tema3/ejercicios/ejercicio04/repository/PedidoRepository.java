package ceu.dam.ad.tema3.ejercicios.ejercicio04.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ceu.dam.ad.tema3.ejercicios.ejercicio04.modelo.Pedido;


@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

	/**public Long insertar(Connection conn, Pedido pedido) throws SQLException {
		String sql = "insert into pedidos (fecha_pedido, fecha_entrega, cliente) values (?,?,?)";
		try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);){
			stmt.setDate(1, Date.valueOf(pedido.getFechaPedido()));
			stmt.setDate(2, Date.valueOf(pedido.getFechaEntrega()));
			stmt.setString(3, pedido.getCliente());
			stmt.execute();
			ResultSet rs = stmt.getGeneratedKeys();
			rs.next();
			return rs.getLong(1);
		}
	}
	
	public Pedido consultar(Connection conn, Long idPedido) throws SQLException {
		String sql = "SELECT * FROM PEDIDOS WHERE ID_PEDIDO = " + idPedido;
		try (PreparedStatement stmt = conn.prepareStatement(sql)){
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				Pedido p = new Pedido();
				p.setCliente(rs.getString("cliente"));
				p.setFechaEntrega(rs.getDate("fecha_entrega").toLocalDate());
				p.setFechaPedido(rs.getDate("fecha_pedido").toLocalDate());
				p.setIdPedido(idPedido);
				return p;
			}
			return null;
		}
	}*/
}
