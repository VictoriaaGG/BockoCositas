package ejercicio5.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

import org.slf4j.LoggerFactory;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;

import ejercicio04.dao.DaoPedidos;
import ejercicio5.dao.UserDao;
import ejercicio5.modelo.Usuario;

public class UserService extends DaoPedidos implements Service {
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	private UserDao userDao;

	public UserService() {
		userDao = new UserDao();
	}

	@Override
	public void changePass(Long id, String pass, String passNew) throws UserException {
		try (Connection conn = abrirConexion()) {
			Usuario user = new Usuario();
			user = userDao.getById(conn, id);
			String newPassCifrada = DigestUtils.sha256Hex(passNew);
			String passCifrada = DigestUtils.sha256Hex(pass);
			if (passCifrada.equals(newPassCifrada)) {
				logger.info("Las dos contraseñas no pueden ser iguales");
				System.out.println("Las dos contraseñas no pueden ser iguales");
				throw new Exception("");
			} else if (passCifrada.equals(user.getPass())) {
				user.setPass(newPassCifrada);
				userDao.update(conn, user);
				logger.info("El usuario se ha actualizado correctamente");
				System.out.println("El usuario se ha actualizado correctamente");
			} else
				throw new Exception("");
			logger.info("Contraseña de usuario incorrecta.");
			System.out.println("Contraseña de usuario incorrecta, por favor introduzca la contraseña bien.");
		} catch (SQLException e) {
			logger.error("Error en la base de Datos", e);
			throw new UserException("Problema con la base de datos" + e);

		} catch (Exception e) {
			logger.error("Error en las contraseñas", e);
			throw new UserException("Ha surgido un problema con las contraseñas" + e);
		}
	}

	@Override
	public Usuario registerUser(Usuario user) throws UserException {
		try (Connection conn = abrirConexion()) {
			Usuario userU = userDao.getByUser(conn, user.getUsername());
			Usuario userC = userDao.getByEmail(conn, user.getEmail());
			if (userU == null && userC == null) {
				String passCifrada = DigestUtils.sha256Hex(user.getPass());
				user.setPass(passCifrada);
				user.setFechaAlta(LocalDate.now());
				user.setFechaUltLogin(LocalDate.now());
				user.setId(userDao.insert(conn, user));
				logger.info("Usuario registrado con éxito");
				return user;
			} else {
				logger.info("El usuario ya existe.");
				throw new newUserException("El usuario ya existe");
			}

		} catch (SQLException e) {
			logger.error("Error en la base de Datos", e);
			throw new UserException("Problema con la base de datos" + e);

		} catch (Exception e) {
			logger.error("El usuario ya ha sido creado", e);
			throw new UserException("Ha surgido un problema" + e);
		}
	}

	@Override
	public Usuario loginUser(String login, String pass) throws UserException {
		Usuario user = new Usuario();
		try (Connection conn = abrirConexion()) {
			user = userDao.getByUser(conn, login);
			if (user == null) {
				user = userDao.getByEmail(conn, login);
			}

			if (user.getPass() != null) {
				String passCifrada = DigestUtils.sha256Hex(pass);
				if (user.getPass().equals(passCifrada)) {
					logger.info("El usuario se ha logueado correctamente");
					return user;
				} else
					logger.info("Las contraseñas no son iguales");
				throw new Exception("");
			} else
				logger.info("El usuario con esa contraseña no existe");
			throw new Exception("");

		} catch (SQLException e) {
			logger.error("Error al conectar con la base de datos.");
			throw new UserException("Problema con la base de datos" + e);

		} catch (Exception e) {
			logger.error("Ha surgido un problema");
			throw new UserException("Ha surgido un problema" + e);

		}
	}

	@Override
	public Usuario consultUser(Long id) throws UserException {
		Usuario user = new Usuario();
		try (Connection conn = abrirConexion()) {
			user = userDao.getById(conn, id);
			if (user == null) {
				logger.info("El usuario con ese id no existe,TONTO.");
				throw new Exception("");
			}
			return user;
		} catch (SQLException e) {
			logger.error("Ha habido un problema con la base de datos.");
			throw new UserException("Problema con la base de datos" + e);

		} catch (Exception e) {
			logger.error("El usuario con ese id no existe.");
			throw new UserException("Ha surgido un problema" + e);
		}
	}

}
