package basic_javafx_cc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderLayout;
import javafx.scene.control.Button;

public class ButtonGUI extends Application{
    Button button1;
    Button button2;
    Button button3;
    Button button4;

    public void start(Stage primaryStage) {
        this.button1 = new Button("button 1");
        this.button2 = new Button("button 2");
        this.button3 = new Button("button 3");
        FlowPane layout = new FlowPane(button1, button2, button3);

        button1.setOnAction(new RespondToBasicClick());
        button2.setOnAction(new RespondToBasicClick());

        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}