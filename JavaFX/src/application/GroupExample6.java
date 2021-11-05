package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class GroupExample6 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Button b1 = new Button("Button Number 1       ");
		Button b2 = new Button("Button 2");
		
		Group group = new Group();
		//add the nodes to the group 
		//add the group to the scene 
		//add the scene to the stage
		group.getChildren().addAll(b1, b2);
		
		Scene scene = new Scene(group, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Group Example");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
