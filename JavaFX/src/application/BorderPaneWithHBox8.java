package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class BorderPaneWithHBox8 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Button btn1 = new Button("File");
		Button btn2 = new Button("Menu");
		Button btn3 = new Button("New");
		Button btn4 = new Button("Save");
		Button btn5 = new Button("Exit");
		BorderPane bp = new BorderPane();
		
		HBox hbox1 = new HBox(20);
		hbox1.getChildren().addAll(btn1, btn2, btn3);

		HBox hbox2 = new HBox(20);
		hbox2.getChildren().addAll(btn4, btn5);

		bp.setTop(hbox1);
		bp.setBottom(hbox2);
		
		Scene scene = new Scene(bp, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Border Pane with HBox");
		primaryStage.show();
		
		//Create the Controls
		//arrange the button in the horizontal 
		//then we added the layout on the border pane 
		//added the bp to the scene 
		//added the scene to the stage
	}

	public static void main(String[] args) {
		launch(args);
	}
}
