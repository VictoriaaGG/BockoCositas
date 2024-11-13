package ejercicio03.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import Ejercicio01.dao.Dao;
import ejercicio03.dao.PagosDao;
import ejercicio03.modelo.Pago;

public class PagosService extends Dao {
	private PagosDao dao;

	public PagosService() {
		dao = new PagosDao();
	}
	
	public List<Pago> devolverPagos(Integer id) throws PagosException {
		try (Connection conn = abrirConexion()){
			return null;
		}catch (SQLException e) {
			System.out.println("Error en la base de datos");
			throw new PagosException("Error", e);
			
		}
	}
	}

