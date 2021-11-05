package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxLayoutExample3 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Button btn1 = new Button("Button 1");
		Button btn2 = new Button("Button 2");
		Button btn3 = new Button("Button 3");

		HBox hbox = new HBox();
		hbox.getChildren().addAll(btn1, btn2, btn3);
		//hbox.setSpacing(50);
		//hbox.setPadding(new Insets(10));
		hbox.setMargin(btn1, new Insets(50));
		hbox.setMargin(btn2, new Insets(50));
		hbox.setMargin(btn3, new Insets(50));
		
		Scene scene = new Scene(hbox, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
