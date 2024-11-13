package ejercicio04.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import ejercicio04.dao.DaoPedidos;
import ejercicio04.dao.LineaPedidoDao;
import ejercicio04.dao.PedidoDao;
import ejercicio04.modelo.LineaPedido;
import ejercicio04.modelo.Pedido;

public class PedidosService extends DaoPedidos {
	private PedidoDao daoPedido;
	private LineaPedidoDao daoLinea;

	
	public PedidosService() {
		daoPedido = new PedidoDao();
		daoLinea = new LineaPedidoDao();
	}

	public Pedido consultarPedido(Long idPedido) throws PedidoException, SQLException{
		Pedido pedido = new Pedido();
		try(Connection conn= abrirConexion()){
			pedido = daoPedido.consultarP(conn, idPedido);
			List<LineaPedido> lineaLista = daoLinea.consultarLP(conn, idPedido);
			pedido.setLineaPedidos(lineaLista);
		}
		return pedido; 
		}//controlar excepciones
	
	public Long crearPedido(Pedido pedido) throws PedidoException {
		try (Connection conn = abrirConexion()){
			conn.setAutoCommit(false);
			try {
				Long idPedido = daoPedido.insertarPedido(conn, pedido);
				Integer numLinea = 1;
				for (LineaPedido linea : pedido.getLineaPedidos()) {
					linea.setIdPedido(idPedido);
					linea.setNumeroLinea(numLinea);
					numLinea++;
					daoLinea.insertarLineaPedidos(conn, linea);
				}
				
				conn.commit();
				return idPedido;
			}
			catch(SQLException e) {
				conn.rollback();
				throw e;
			}
		}
		catch(SQLException e) {
			System.err.println("Error al registrar pedido");
			throw new PedidoException("Error al registrar pedido", e);
		}
	}
}
