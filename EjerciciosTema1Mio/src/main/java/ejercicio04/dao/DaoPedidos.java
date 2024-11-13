package ejercicio04.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DaoPedidos {
	public Connection abrirConexion() {
		String urlConexion = "jdbc:mariadb://127.0.0.1:3306/pedidos";
		String driver = "org.mariadb.jdbc.Driver";
		String usuario = "pedidos";
		String password = "1234";

		try {
			Class.forName(driver);
			return DriverManager.getConnection(urlConexion, usuario, password);
		} catch (Exception e) {
			System.out.println("No he podido abrir la conexión");
			e.printStackTrace();
		}
		return null;
	}

	public void testConexion() {
		Connection conn = abrirConexion();
		System.out.println("Esta es mi conexión " + conn);
		if (conn != null) {
			System.out.println("TODO OK");
		} else {
			System.out.println("Esto no rula");
		}
	}
}
