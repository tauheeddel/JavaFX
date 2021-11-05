package application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClickCounter2 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Button btn = new Button();
		btn.setText("Click Me");
		Label lbl = new Label();
		lbl.setText("You have not clicked the button");
		//Button and Label
		
		//Layout Pane: BorderPane
		BorderPane bp = new BorderPane();
		//add controls to the Layout Pane
		bp.setTop(lbl); //put the label on the top
		//bp.setCenter(btn); // put the button in the center
		//bp.setBottom(btn);
		bp.setLeft(btn);
		
		Scene scene = new Scene(bp, 250, 150);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
