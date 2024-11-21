package com.example.firstapp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("Before the app starts!");
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(5000);


    }

    @Override
    public void start(Stage stage) {
        Platform.setImplicitExit(false);
        System.out.println(Thread.currentThread().getName());
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(25, 25, 25, 25));
        root.setSpacing(20);
        Label text = new Label("");
        Button button = new Button("Click me!");
        Button button1 = new Button("Exit explicitly!");
        button1.setOnAction(actionEvent -> {
            Platform.exit();
        });
        button.setOnAction(event -> {
            text.setText("welcome to javafx application!");
        });
        root.getChildren().addAll(text, button, button1);
        Scene scene = new Scene(root, 350, 300);
        stage.setScene(scene);
        stage.setTitle("First application");
        stage.show();
    }

//    @Override
//    public void stop() throws Exception {
//        System.out.println(Thread.currentThread().getName());
//        System.out.println("Closing the application");
//
//    }

    public static void main(String[] args) {
        launch();
    }
}