package files.projects.project_5;

import files.projects.project_3.Line;
import files.projects.project_3.Point;
import files.projects.project_3.Square;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FractalDrawerGUI  extends Application{

    Canvas canvas = new Canvas();
    
    int numSides = 0;
    
    public void start (Stage primaryStage){
        BorderPane layout = new BorderPane();
        this.canvas = new Canvas(500, 500);
        SnowFlakeFractal squareFractal = new SnowFlakeFractal(new Square(new Point(100, 100), 50), 1);
        
        
        Button triangleChooser = new Button("Triangle Base Shape");
        Button squareChooser = new Button("Square Base Shape");

        triangleChooser.setOnAction(e -> numSides = 3);
        squareChooser.setOnAction(e -> numSides = 4);

        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setStroke(Color.BLACK);
        for (Line l : squareFractal.getLines()) {
            gc.strokeLine(l.getFirstPoint().getX(), l.getFirstPoint().getY(), l.getSecondPoint().getX(), l.getSecondPoint().getY());
        }

        layout.setBottom(this.canvas);
        layout.setTop(triangleChooser);
        layout.setTop(squareChooser);
        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
