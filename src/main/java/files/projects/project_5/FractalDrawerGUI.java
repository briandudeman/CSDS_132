package files.projects.project_5;


import files.projects.project_3.EquilateralTriangle;
import files.projects.project_3.Line;
import files.projects.project_3.Point;
import files.projects.project_3.Square;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FractalDrawerGUI  extends Application{

    Canvas canvas = new Canvas();
    
    int numSides = 0;

    int sideLength = 0;

    int numLevels = 0;

    double rotation = 0;

    Fractal fractal;

    Point center = new Point(0, 0);

    public static boolean stringIsInt(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) > '9' || text.charAt(i) < '0') {
                return false;
            }
        }
        return true;
    }

    public static boolean stringIsDouble(String text) {
        int numPoints = 0;
        boolean isNumber = true;
        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) > '9' || text.charAt(i) < '0') && text.charAt(i) != '.') {
                isNumber = false;
            }
            if (text.charAt(i) == '.') {
                numPoints++;
            }
        }
        return (isNumber && numPoints == 1);
    }

    public void start (Stage primaryStage){
        BorderPane layout = new BorderPane();
        this.canvas = new Canvas(500, 500);
        SnowFlakeFractal squareFractal = new SnowFlakeFractal(new Square(new Point(100, 100), 50), 1);
        
        
        Button triangleChooser = new Button("Triangle Base Shape");
        Button squareChooser = new Button("Square Base Shape");

        triangleChooser.setOnAction(e -> numSides = 3);
        squareChooser.setOnAction(e -> numSides = 4);

        TextField sideLengthField = new TextField("side width");

        try {
            sideLengthField.setOnAction(e -> {
                if (!FractalDrawerGUI.stringIsInt(sideLengthField.getText())) {
                    sideLengthField.setText("NOT AN INTEGER");
                    throw new NumberFormatException();
                }
                this.sideLength = Integer.parseInt(sideLengthField.getText());
            });
        } catch (NumberFormatException e) {
            this.sideLength = 0;
        }

        TextField levelField = new TextField("level");

        try {
            levelField.setOnAction(e -> {
                if (!FractalDrawerGUI.stringIsInt(levelField.getText())) {
                    levelField.setText("NOT AN INTEGER");
                    throw new NumberFormatException();
                }
                this.numLevels = Integer.parseInt(levelField.getText());
            });
        } catch (NumberFormatException e) {
            this.numLevels = 0;
        }

        TextField rotationField = new TextField("rotation (in degrees)");

        try {
            rotationField.setOnAction(e -> {
                if (!FractalDrawerGUI.stringIsDouble(rotationField.getText())) {
                    rotationField.setText("NOT A DOUBLE");
                    throw new NumberFormatException();
                }
                this.rotation = Double.parseDouble(rotationField.getText());
            });
        } catch (NumberFormatException e) {
            this.rotation = 0;
        }

        TextField xField = new TextField("x coordinate of the center");

        try {
            xField.setOnAction(e -> {
                if (!FractalDrawerGUI.stringIsDouble(xField.getText())) {
                    xField.setText("NOT A DOUBLE");
                    throw new NumberFormatException();
                }
                this.center.setX(Double.parseDouble(xField.getText()));
            });
        } catch (NumberFormatException e) {
            this.center.setX(0);
        }

        TextField yField = new TextField("y coordinate of the center");

        try {
            yField.setOnAction(e -> {
                if (!FractalDrawerGUI.stringIsDouble(yField.getText())) {
                    yField.setText("NOT A DOUBLE");
                    throw new NumberFormatException();
                }
                this.center.setY(Double.parseDouble(yField.getText()));
            });
        } catch (NumberFormatException e) {
            this.center.setX(0);
        }


        GraphicsContext gc = canvas.getGraphicsContext2D();
        Button drawFractal = new Button("draw fractal");

        drawFractal.setOnAction(e -> {
            if (this.numSides == 3) {
                this.fractal = new SnowFlakeFractal(new EquilateralTriangle(this.center, this.sideLength), this.numLevels);
            } else if (this.numSides == 4) {
                this.fractal = new SnowFlakeFractal(new Square(this.center, this.sideLength), this.numLevels);
            }
            this.fractal.rotate(this.rotation);
            for (Line l : this.fractal.getLines()) {
                gc.strokeLine(l.getFirstPoint().getX(), l.getFirstPoint().getY(), l.getSecondPoint().getX(), l.getSecondPoint().getY());
            }

        });
        
        FlowPane shapeFlowPane = new FlowPane(triangleChooser, squareChooser);
        FlowPane detailsFlowPane = new FlowPane(sideLengthField, levelField, rotationField, xField, yField);
        FlowPane topFlowPane = new FlowPane(shapeFlowPane, detailsFlowPane);

        layout.setBottom(this.canvas);
        layout.setTop(topFlowPane);
        layout.setCenter(drawFractal);
        
        System.out.println(this.center.getX() + " " + this.center.getY());
        System.out.println(this.numLevels);
        System.out.println(this.sideLength);
        System.out.println(this.numSides);
        System.out.println(this.rotation);
        System.out.println(this.fractal);

        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
