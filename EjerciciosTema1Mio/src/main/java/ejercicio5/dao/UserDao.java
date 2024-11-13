package ejercicio5.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import org.mariadb.jdbc.Statement;

import ejercicio5.modelo.Usuario;

public class UserDao {
	public Long insert(Connection conn, Usuario user) throws SQLException {
		String sql = "insert into usuarios (username, pass, email, fecha_Alta, fecha_Ult_Login) values (?,?,?,?,?)";
		try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
			stmt.setString(1, user.getUsername());
			stmt.setString(2, user.getPass());
			stmt.setString(3, user.getEmail());
			stmt.setDate(4, Date.valueOf(user.getFechaAlta()));
			stmt.setDate(5, Date.valueOf(user.getFechaUltLogin()));
			stmt.execute();
			ResultSet rs = stmt.getGeneratedKeys();
			rs.next();
			return rs.getLong(1);
		}

	}

	public Usuario getByEmail(Connection conn, String email) throws SQLException {

		String sql = "select * from usuarios where email=?";
		Usuario u = new Usuario();
		try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
			stmt.setString(1, email);
			;
			ResultSet rs = stmt.executeQuery();
			if (rs != null) {
				u.setId(rs.getLong("id"));
				u.setUsername(rs.getString("username"));
				u.setPass(rs.getString("passs"));
				u.setEmail(rs.getString("email"));
				u.setFechaAlta(rs.getDate("fecha_Alta").toLocalDate());
				u.setFechaUltLogin(rs.getDate("fecha_Ult_Login").toLocalDate());

			} else {
				return null;
			}
		}
		return u;
	}

	public Usuario getById(Connection conn, Long id) throws SQLException {

		String sql = "select * from usuarios where id=?";
		Usuario u = new Usuario();
		try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
			stmt.setLong(1, id);
			;
			ResultSet rs = stmt.executeQuery();
			if (rs != null) {
				u.setId(rs.getLong("id"));
				u.setUsername(rs.getString("username"));
				u.setPass(rs.getString("passs"));
				u.setEmail(rs.getString("email"));
				u.setFechaAlta(rs.getDate("fecha_Alta").toLocalDate());
				u.setFechaUltLogin(rs.getDate("fecha_Ult_Login").toLocalDate());

			} else {
				return null;
			}
		}
		return u;
	}

	public Usuario getByUser(Connection conn, String username) throws SQLException {

		String sql = "select * from usuarios where username=?";
		Usuario u = new Usuario();
		try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
			stmt.setString(1, username);
			;
			ResultSet rs = stmt.executeQuery();
			if (rs != null) {
				u.setId(rs.getLong("id"));
				u.setUsername(rs.getString("username"));
				u.setPass(rs.getString("passs"));
				u.setEmail(rs.getString("email"));
				u.setFechaAlta(rs.getDate("fecha_Alta").toLocalDate());
				u.setFechaUltLogin(rs.getDate("fecha_Ult_Login").toLocalDate());

			} else {
				return null;
			}
		}
		return u;
	}

	public void update(Connection conn, Usuario user) throws SQLException {
		String sql = "UPDATE usuario SET username = ?,pass = ?,email = ?, fecha_Alta = ?,fecha_Ult_Login = ? WHERE id ="
				+ user.getId();
		try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
			stmt.setString(1, user.getUsername());
			stmt.setString(2, user.getPass());
			stmt.setString(3, user.getEmail());
			stmt.setDate(4, Date.valueOf(user.getFechaAlta()));
			stmt.setDate(4, Date.valueOf(user.getFechaUltLogin()));
			stmt.executeUpdate();
		}
	}
}
