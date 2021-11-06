package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ShapeExample20 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Group gp = new Group();
		for (int i=0; i< 800; i+=10) {
			Line line1 = new Line(i, 0, i, 800); //vertical line
			//new Line(startX, startY, endX, endY)
			line1.setStroke(Color.LIGHTGREY);
			Line line2 = new Line(0,i,800, i); //horizontal lines 
			line2.setStroke(Color.LIGHTGREY);
			gp.getChildren().addAll(line1, line2);
		}
		//Create a rectangle 
		Rectangle r1 = new Rectangle(250, 325, 100, 140);
		r1.setStroke(Color.BLACK);
		r1.setFill(Color.YELLOW);
		r1.setStrokeWidth(5);
		gp.getChildren().add(r1);
		
		
		//Create a second rectangle 
		Rectangle r2 = new Rectangle(50,100,200,100);
		r2.setStroke(Color.RED);
		r2.setFill(Color.BLUE);
		r2.setStrokeWidth(5);
		r2.setArcWidth(25);
		r2.setArcHeight(25);
		gp.getChildren().addAll(r2);
		
		Circle c1 = new Circle(50,150,50);
		c1.setStroke(Color.BLACK);
		c1.setFill(Color.CHOCOLATE);
		c1.setStrokeWidth(5);
		gp.getChildren().addAll(c1);
		
		Ellipse e1 = new Ellipse(300, 250, 200, 50);
		e1.setFill(Color.RED);
		e1.setStroke(Color.BLACK);
		e1.setStrokeWidth(5);
		gp.getChildren().add(e1);
		
		Ellipse e2 = new Ellipse(250, 50, 200, 50);
		e2.setFill(Color.DARKOLIVEGREEN);
		e2.setStroke(Color.BLACK);
		e2.setStrokeWidth(5);
		gp.getChildren().add(e2);
		
		Scene scene = new Scene(gp, 500,550);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
