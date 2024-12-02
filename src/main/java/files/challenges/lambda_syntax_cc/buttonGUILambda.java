package files.challenges.lambda_syntax_cc;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class buttonGUILambda extends Application{
    Button button1;
    Button button2;
    Button button3;

    private int button2NumClicks = 0;

    @Override
    public void start(Stage primaryStage) {
        this.button1 = new Button("button 1");
        this.button2 = new Button("click count: 0");
        this.button3 = new Button("button 3");
        FlowPane layout = new FlowPane(button1, button2, button3);

        button1.setOnAction(new RespondToLeftOrRightClick());
        button2.setOnAction( (e) -> {
            Button b = (Button)e.getSource();
            b.setText("click count: " + ++this.button2NumClicks);
        });
        button3.setOnAction(new RespondToLeftOrRightClick());

        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    private class RespondToLeftOrRightClick implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            Button b = (Button)event.getSource();
            if (b == button1) {
                System.out.println("you clicked the left button");
            } else if (b == button3) {
                System.out.println("you clicked the right button");
            }
        }
    }
}
