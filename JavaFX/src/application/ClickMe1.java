package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClickMe1 extends Application {

	Button btn;

	@Override
	public void start(Stage primaryStage) {
		btn = new Button();
		btn.setText("Click Me");

		BorderPane pane = new BorderPane();
		pane.setLeft(btn);

		Scene scene = new Scene(pane, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
