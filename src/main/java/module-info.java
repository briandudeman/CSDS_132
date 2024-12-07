module files {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.graphics;
    requires junit;

    opens files.classwork.november.date_13_11_24 to javafx.fxml;

    //opens files.challenges.lambda_syntax_cc to javafx.graphics;

    //exports files.challenges.java_optional_cc;
}
