package app.inicio;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class BienvenideController extends AppController {

	@FXML
	private Button btnSalir;

	@FXML
	private Label welcomeLabel;

	public BienvenideController() {
		welcomeLabel.setText(welcomeLabel.getText() + getParam("usuario"));
	}

	@FXML
	void salir(ActionEvent event) {
		changeScene(FXML_LOGIN);
	}
}
