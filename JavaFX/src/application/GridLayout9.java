package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridLayout9 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Button btn1 = new Button("Btn 1");
		Button btn2 = new Button("Btn 2");
		Button btn3 = new Button("Btn 3");
		Button btn4 = new Button("Btn 4");
		Button btn5 = new Button("Btn 5");
		Button btn6 = new Button("Btn 6");
		Button btn7 = new Button("Btn 7");
		Button btn8 = new Button("Btn 8");
		Button btn9 = new Button("Btn 9");

		GridPane gridPane = new GridPane();
		gridPane.setMinSize(400, 200);
		gridPane.setPadding(new Insets(10));
		gridPane.setHgap(15);
		gridPane.setVgap(15);

		gridPane.add(btn1, 0, 0);
		gridPane.add(btn2, 1, 0);
		gridPane.add(btn3, 2, 0);
		gridPane.add(btn4, 3, 0);
		gridPane.add(btn5, 0, 1);
		gridPane.add(btn6, 2, 1);
		gridPane.add(btn7, 0, 2);
		gridPane.add(btn8, 1, 2);
		gridPane.add(btn9, 2, 2);

		Scene scene = new Scene(gridPane, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Grid Pane Layout");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
