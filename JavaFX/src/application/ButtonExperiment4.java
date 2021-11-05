package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class ButtonExperiment4 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Button btn1 = new Button("Button 1");
		Button btn2 = new Button("Button 2");
		Button btn3 = new Button("Button 3");

		//create the spacer
		Region spacer = new Region();
		HBox.setHgrow(spacer, Priority.SOMETIMES);
		HBox hbox = new HBox(btn1, btn2, spacer, btn3);
		hbox.setMargin(btn1, new Insets(10));
		hbox.setMargin(btn2, new Insets(10));
		hbox.setMargin(btn3, new Insets(10));
		
		Scene scene = new Scene(hbox, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
