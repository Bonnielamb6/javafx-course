package com.example.grouplayout;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage){
        Group group = new Group();
        Button one = new Button("One");
        Button two = new Button("two");
        one.setLayoutX(50);
        one.setLayoutY(10);
        two.layoutXProperty().bind(one.layoutXProperty().add(one.widthProperty().add(10)));
        two.layoutYProperty().bind(one.layoutYProperty());
        group.setEffect(new DropShadow());
        group.setRotate(10);
        group.getChildren().addAll(one, two);
        Scene scene = new Scene(group,350,300);
        stage.setTitle("group layout");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}