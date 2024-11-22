package com.modulesfx.bindingsexample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        Label label = new Label("Welcome");
        TextField field = new TextField();
        TextField field1 = new TextField();
        field.setMaxWidth(200);
        root.getChildren().addAll(label, field, field1);
        //label.textProperty().bind(field.textProperty());
        field1.textProperty().bindBidirectional(field.textProperty());
        Scene scene = new Scene(root, 550, 550);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}