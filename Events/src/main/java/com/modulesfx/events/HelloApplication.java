package com.modulesfx.events;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        Label label = new Label("Click the button");
        Button button = new Button("Click me");
        root.getChildren().addAll(label, button);
//        button.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
//            label.setText("Thank you for clicking the button!");
//        });
        button.setOnAction(event -> {
            label.setText("Thank you for clicking the button!");
        });
        Scene scene = new Scene(root, 550, 500);
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}