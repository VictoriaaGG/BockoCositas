package ceu.dam.ad.tema3.ejercicios.ejercicio04.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ceu.dam.ad.tema3.ejercicios.ejercicio04.modelo.PedidoLinea;
import ceu.dam.ad.tema3.ejercicios.ejercicio04.modelo.PedidoLineaKey;

@Repository
public interface PedidoLineaRepository extends JpaRepository<PedidoLinea, PedidoLineaKey> {
	
	public List<PedidoLinea> findByIdPedido(Long idPedido);

	/**public void insertar(Connection conn, PedidoLinea linea) throws SQLException {
		String sql = "insert into pedidos_lineas (id_pedido, numero_linea, articulo, precio) values (?,?,?,?)";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setLong(1, linea.getIdPedido());
			stmt.setInt(2, linea.getNumLinea());
			stmt.setString(3, linea.getArticulo());
			stmt.setBigDecimal(4, linea.getPrecio());
			stmt.execute();
		}
	}
	
	
	public List<PedidoLinea> consultar(Connection conn, Long idPedido) throws SQLException {
		String sql = "SELECT * FROM PEDIDOS_LINEAS WHERE ID_PEDIDO = " + idPedido;
		try (PreparedStatement stmt = conn.prepareStatement(sql)){
			ResultSet rs = stmt.executeQuery();
			List<PedidoLinea> lineas = new ArrayList<PedidoLinea>();
			while(rs.next()) {
				PedidoLinea linea = new PedidoLinea();
				linea.setArticulo(rs.getString("articulo"));
				linea.setPrecio(rs.getBigDecimal("precio"));
				linea.setNumLinea(rs.getInt("numero_linea"));
				linea.setIdPedido(idPedido);
				lineas.add(linea);
			}
			return lineas;
		}
	}*/

}
