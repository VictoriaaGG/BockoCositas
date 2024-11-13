package ejercicio5Interfaz;

import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import ceu.dam.ad.ejerciciosTema3.csv.exceptions.CsvException;
import ejercicio02.service.Ejercicio02Service;
import ejercicios.ejercicio05.model.User;
import ejercicios.ejercicio05.service.DuplicateUserException;
import ejercicios.ejercicio05.service.UserException;
import ejercicios.ejercicio05.service.UserNotFoundException;
import ejercicios.ejercicio05.service.UserServiceImpl;
import ejercicios.ejercicio05.service.UserUnauthorizedException;

public class AppController {

	private JFrame frame;
	private LoginPanel login;
	private ProfilePanel profile;
	private ChangePassPanel changePass;
	private RegisterPanel register;
	private UserServiceImpl dao;
	private User user;
	private Ejercicio02Service userImpl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppController window = new AppController();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppController() {
		user = new User();
		login = new LoginPanel(this);
		changePass = new ChangePassPanel(this, user);
		register = new RegisterPanel(this);
		profile = new ProfilePanel(this, user);
		this.dao = new UserServiceImpl();
		this.userImpl = new Ejercicio02Service();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(login);
		frame.setLocationRelativeTo(null);
	}

	public void abrirLogin() {
		frame.setContentPane(login);
		frame.revalidate();

	}

	public void abrirProfile(User user) {
		frame.setContentPane(profile);
		frame.revalidate();
	}

	public void abrirchangePass() {
		frame.setContentPane(changePass);
		frame.revalidate();
	}

	public void abrirRegister() {
		frame.setContentPane(register);
		frame.revalidate();
	}

	public void guardarNewPass(Long id, String oldPass, String newPass) {
		try {
			dao.changePassword(id, oldPass, newPass);
		} catch (UserNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Usuario no encontrado", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (UserUnauthorizedException e) {
			JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (UserException e) {
			JOptionPane.showMessageDialog(null, "Error logueandote", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}

	}

	public void guardarUsuario(String username, String email, String contraseña) {
		User u = new User();
		try {
			u.setUsername(username);
			u.setEmail(email);
			u.setPassword(contraseña);
			user = dao.createUser(u);
		} catch (DuplicateUserException e) {
			JOptionPane.showMessageDialog(null, "Usuario duplicado", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (UserException e) {
			JOptionPane.showMessageDialog(null, "Error logueandote", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		user = u;
	}

	public void logearse(String login, String password) {
		try {
			user = dao.login(login, password);
			System.out.println(user.toString());
			abrirProfile(user);
		} catch (UserNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Usuario no encontrado", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (UserException e) {
			JOptionPane.showMessageDialog(null, "Error logueandote", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (UserUnauthorizedException e) {
			JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}

	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void openFileChooser() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Selecciona un csv");
		Integer selection = fileChooser.showOpenDialog(frame);

		if (selection == JFileChooser.APPROVE_OPTION) {
			try {
				File fileToOpen = fileChooser.getSelectedFile();
				userImpl.importarUsuarioCSV(fileToOpen.getAbsolutePath());
			} catch (CsvException e) {
				JOptionPane.showMessageDialog(null, "Error al leer el archivo", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
		}
	}

}