package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CustomMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuExample13 extends Application {

	@Override
	public void start(Stage primaryStage) {
		//Menu bar 
		//Menu 
		//add the items to the menu 
		//add menu to the menu bar 
		//add menubar to the layout 
		//add the layout pane to the scene 
		//dispay the stage 
		MenuBar menuBar = new MenuBar();
		Menu menu = new Menu("File");
		MenuItem item1 = new MenuItem("New");
		MenuItem item2 = new MenuItem("Save");
		SeparatorMenuItem item3 = new SeparatorMenuItem(); 
		MenuItem item4 = new MenuItem("Exit");
		CustomMenuItem item5 = new CustomMenuItem(new Slider());
		
		//add menu items to the menu
		menu.getItems().addAll(item1, item2, item3, item4, item5);
		//add menu to the menubar 
		menuBar.getMenus().add(menu);
		BorderPane bp = new BorderPane();
		bp.setTop(menuBar);
		
		//add layout to the scene 
		Scene scene = new Scene(bp, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
