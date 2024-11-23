package com.example.vboxlayout;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox vBox = new VBox();
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.CENTER);
        vBox.setFillWidth(true);
        TextArea textArea = new TextArea();
//        VBox.setVgrow(textArea, Priority.ALWAYS);
        VBox.setMargin(textArea,new Insets(0,10,0,10));

        vBox.getChildren().add(textArea);
        Scene scene = new Scene(vBox, 500, 500);
        stage.setTitle("VBoxLayout");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}