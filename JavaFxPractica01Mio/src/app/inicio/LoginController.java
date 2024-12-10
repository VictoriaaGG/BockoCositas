package app.inicio;

import ceu.dam.javafx.practica1.modelo.Usuario;
import ceu.dam.javafx.practica1.services.LoginDenegadoException;
import ceu.dam.javafx.practica1.services.LoginService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController extends AppController {
	LoginService service;
	Usuario user;

	@FXML
	private Button btnEntrar;

	@FXML
	private Button btnLimpiar;

	@FXML
	private PasswordField pfContraseña;

	@FXML
	private TextField tfUsuario;

	@FXML
	private Label lbUsuario;

	@FXML
	private Label lbResultado;

	@FXML
	public void entrar(ActionEvent event) {
		try {
			user = null;
			service = new LoginService();
			user = service.login(tfUsuario.getText(), pfContraseña.getText());

			lbResultado.setText("Aceceso correcto");
			lbUsuario.setText(user.getNombre() + " -- " + user.getFechaRegistro());

		} catch (LoginDenegadoException e) {
			lbResultado.setText("Acceso denegado");
			tfUsuario.setText("");
			pfContraseña.setText("");
			tfUsuario.requestFocus();
		}

	}

	@FXML
	public void limpiar(ActionEvent event) {
		lbResultado.setText("");
		lbUsuario.setText("");
		tfUsuario.setText("");
		pfContraseña.setText("");
		tfUsuario.requestFocus();
	}

}
