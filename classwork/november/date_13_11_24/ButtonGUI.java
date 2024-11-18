package date_13_11_24;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class ButtonGUI extends Application{
    Button button1;
    Button button2;
    Button button3;
    Button button4;

    private int rotation = 0;

    public void start(Stage primaryStage) {
        BorderPane layout = new BorderPane();
        this.button1 = new Button("button 1");
        this.button2 = new Button("button 2");
        this.button3 = new Button("spin buttons");
        this.button4 = new Button("dont click me");

        button1.setOnAction(new RespondToBasicClick());
        button4.setOnAction(new RespondToBasicClick());
        
        int rotationDelta = 27;

        button3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                rotation += rotationDelta;
                button1.setRotate(rotation);
                button2.setRotate(rotation);
                button3.setRotate(rotation);
                button4.setRotate(rotation);
            }
        });

        button2.setOnAction(new EventHandler<ActionEvent>() {
            private int rotation = 0;
            public void handle(ActionEvent e) {
                rotation = 0;
                button1.setRotate(rotation);
                button2.setRotate(rotation);
                button3.setRotate(rotation);
                button4.setRotate(rotation);
            }
        });

        layout.setTop(button1);
        layout.setLeft(button2);
        layout.setRight(button3);
        layout.setBottom(button4);

        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    private class RespondToBasicClick implements EventHandler<ActionEvent> {

        public void handle(ActionEvent event) {
            Button b = (Button)event.getSource();
            if (b == button1) {
                System.out.println("ouch");
            } else {
                System.out.println("yippee");
            }
        }
    }
}

