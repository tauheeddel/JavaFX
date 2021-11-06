//BorderPaneExample7.java
//--module-path C:\Users<user>\Downloads\javafx-sdk-11\lib --add-modules=javafx.controls
package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class BorderPaneExample7 extends Application {

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

		// add the border pane to the scene
		// add the scene to the stage
		// show the stage
		bp.setTop(hbox1);
		bp.setBottom(hbox2);

		Scene scene = new Scene(bp, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
