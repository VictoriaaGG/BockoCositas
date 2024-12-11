package app.inicio;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import app.App;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppController {
	public static final String FXML_LOGIN = "/app/inicio/login.fxml";
	public static final String FXML_WELCOME = "/app/inicio/bienvenida.fxml";
	protected static Stage primaryStage;

	public AppController() {

	}

	public AppController(Stage stage) {
		AppController.primaryStage = stage;
	}

	public void changeScene(String fxml) {

		try {
			FXMLLoader loader = new FXMLLoader(App.class.getResource(fxml));
			Scene scene = new Scene(loader.load());
			primaryStage.setScene(scene);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void addParam(String key, Object param) {
		Map<String, Object> mapa = (Map<String, Object>) primaryStage.getUserData();
		if (mapa == null) {
			mapa = new HashMap<String, Object>();
			primaryStage.setUserData(mapa);

		}
		mapa.put(key, param);
	}

	public Object getParam(String key) {
		Map<String, Object> mapa = (Map<String, Object>) primaryStage.getUserData();
		return mapa.get(key);
	}
}
