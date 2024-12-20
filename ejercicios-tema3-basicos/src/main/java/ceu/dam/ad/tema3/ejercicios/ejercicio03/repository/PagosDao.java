package ceu.dam.ad.tema3.ejercicios.ejercicio03.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ceu.dam.ad.tema3.ejercicios.ejercicio03.model.Pago;

@Repository
public interface PagosDao extends JpaRepository<Pago, Long> {
	public List<Pago> findByCustomerId(Long customerId);

	/**
	 * public List<Pago> consultarPagos(Connection conn, Integer idCliente) throws
	 * SQLException{ ResultSet rs = null; try (Statement stmt =
	 * conn.createStatement()){ List<Pago> resultado = new ArrayList<Pago>(); String
	 * sql = "select * from payment where customer_id = " + idCliente; rs =
	 * stmt.executeQuery(sql); while (rs.next()) { Pago pago = new Pago();
	 * pago.setFecha(rs.getDate("payment_date").toLocalDate());
	 * pago.setImporte(rs.getBigDecimal("amount")); resultado.add(pago); } return
	 * resultado; } }
	 */

}
