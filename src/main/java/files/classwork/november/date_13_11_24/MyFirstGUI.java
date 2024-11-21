package files.classwork.november.date_13_11_24;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyFirstGUI {
    
    public void start(Stage primaryStage) {
        Button button = new Button("Click Me");
        Scene scene = new Scene(button);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
