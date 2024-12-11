package app;

import app.inicio.AppController;
import ceu.dam.javafx.practica1.modelo.Usuario;
import ceu.dam.javafx.practica1.services.LoginDenegadoException;
import ceu.dam.javafx.practica1.services.LoginService;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

	public void start(Stage primaryStage) throws Exception {
		AppController controller = new AppController(primaryStage);
		controller.changeScene(AppController.FXML_LOGIN);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Login");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}
