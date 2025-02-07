package app.menu;

import java.io.IOException;

import app.App;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppController {
	public static final String FXML_MENU = "/app/menu/menu.fxml";

	protected static Stage primaryStage;

	public AppController() {

	}

	public AppController(Stage stage) {
		AppController.primaryStage = stage;
	}

	public AppController changeScene(String fxml) {

		try {
			FXMLLoader loader = new FXMLLoader(App.class.getResource(fxml));
			Scene scene = new Scene(loader.load());
			primaryStage.setScene(scene);
			return loader.getController();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Parent loadScene(String fxml) {
		try {
			FXMLLoader loader = new FXMLLoader(App.class.getResource(fxml));
			return loader.load();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
