package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxLayoutExample5 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Button btn1 = new Button("Number One");
		Button btn2 = new Button("Two");
		Button btn3 = new Button("The Third Button");
		
		VBox vbox = new VBox(20, btn1, btn2, btn3);
		vbox.setPadding(new Insets(10));
		
		vbox.setAlignment(Pos.BOTTOM_LEFT);
		
		btn1.setMaxWidth(Double.MAX_VALUE);
		btn2.setMaxWidth(Double.MAX_VALUE);
		btn3.setMaxWidth(Double.MAX_VALUE);
		
		//vbox.setSpacing(100);
		
		//vbox.getChildren().addAll(btn1, btn2, btn3);
		//add this layout to the scene 
		//add the scene to the stage 
		//display the stage
		Scene scene = new Scene(vbox, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
