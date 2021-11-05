package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PieChart14 extends Application {

	@Override
	public void start(Stage primaryStage) {
		//Create a pie chart
		//Create the data
		//Add the data to the pie chart 
		//Add the pie to the scene graph 
		//add to the scene 
		//Add the scene to the stage 
		PieChart pieChart = new PieChart();
		PieChart.Data slice1 = new PieChart.Data("Desktop", 50);
		PieChart.Data slice2 = new PieChart.Data("Phone", 60);
		PieChart.Data slice3 = new PieChart.Data("Tablet", 36);
		
		pieChart.getData().addAll(slice1, slice2, slice3 );
		VBox vbox = new VBox(pieChart);
		//add layout to the scene 
		Scene scene = new Scene(vbox, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
