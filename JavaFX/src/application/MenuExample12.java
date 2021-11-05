package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuExample12 extends Application {

	@Override
	public void start(Stage primaryStage) {
		//Menu bar 
		//Create the menus -->> File Web SQL
		//add menu items to the above menus 
		//add menus to the menubar
		//add menubar to the layout pane(border pane)
		//add the layout pane to the scene
		//set the scene on the page 
		//display the stage 
		MenuBar menuBar = new MenuBar();
		Menu fileMenu = new Menu("File");
		Menu webMenu = new Menu("Web");
		Menu sqlMenu = new Menu("SQL");
		
		
		MenuItem newMenuItem = new MenuItem("New");
		MenuItem saveMenuItem = new MenuItem("Save");
		MenuItem exitMenuItem = new MenuItem("Exit");
		
		fileMenu.getItems().addAll(newMenuItem, saveMenuItem, exitMenuItem);
		
		CheckMenuItem htmlMenuItem = new CheckMenuItem("HTML"); 
		htmlMenuItem.setSelected(true);
		
		CheckMenuItem cssMenuItem = new CheckMenuItem("CSS"); 
		cssMenuItem.setSelected(true);
		webMenu.getItems().addAll(htmlMenuItem, cssMenuItem);
		
		RadioMenuItem mySqlItem = new RadioMenuItem("MySQL");
		RadioMenuItem oracleItem = new RadioMenuItem("Oracle");
		ToggleGroup tGroup= new ToggleGroup();
		mySqlItem.setToggleGroup(tGroup);
		oracleItem.setToggleGroup(tGroup);
		
		Menu tutorialMenu = new Menu("Tutorial");
		MenuItem m1 = new MenuItem("Java");
		MenuItem m2 = new MenuItem("JavaFX");
		MenuItem m3 = new MenuItem("Swings");
		tutorialMenu.getItems().addAll(m1,m2,m3);
		
		sqlMenu.getItems().addAll(mySqlItem, oracleItem, tutorialMenu);
		

		//add the menu to the menuBar
		menuBar.getMenus().add(fileMenu);
		menuBar.getMenus().add(webMenu);
		menuBar.getMenus().add(sqlMenu);
		
		BorderPane bp = new BorderPane();
		bp.setTop(menuBar);
		//add the layout pane to the scene
		Scene scene = new Scene(bp, 300, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
