package Ejercicio01.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {
	public Connection abrirConexion() {
		String urlConexion = "jdbc:mariadb://10.50.16.101:3306/sakila";
		String driver = "org.mariadb.jdbc.Driver";
		String usuario = "sakila_alumnos";
		String password = "fuego";

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
