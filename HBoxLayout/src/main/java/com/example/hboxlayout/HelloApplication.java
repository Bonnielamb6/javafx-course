package com.example.hboxlayout;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.setFillHeight(false);
        Label label = new Label("Hello World");
        TextArea textArea = new TextArea();
        HBox.setHgrow(textArea, Priority.ALWAYS);
        HBox.setMargin(textArea,new Insets(0,10,0,10));
        hBox.getChildren().addAll(label, textArea);
        Scene scene = new Scene(hBox, 750, 500);
        stage.setScene(scene);
        stage.setTitle("HBox");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}