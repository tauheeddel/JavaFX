package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginPage10 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Label text1 = new Label("Email: ");
		Label text2 = new Label("Password: ");
		TextField textField1 = new TextField();
		PasswordField textField2 = new PasswordField();
		Button button1 = new Button("Submit");
		Button button2 = new Button("Clear");
		
		GridPane gridPane = new GridPane();
		
		gridPane.setMinSize(400, 200);
		gridPane.setPadding(new Insets(15));
		gridPane.setVgap(5);
		gridPane.setHgap(5);
		gridPane.add(text1, 0, 0);
		gridPane.add(textField1, 1, 0);
		gridPane.add(text2, 0, 1);
		gridPane.add(textField2, 1, 1);
		gridPane.add(button1, 0, 2);
		gridPane.add(button2, 1, 2);
		
		//add this grid to the scene 
		Scene scene = new Scene(gridPane, 600, 600);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Login Form");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
