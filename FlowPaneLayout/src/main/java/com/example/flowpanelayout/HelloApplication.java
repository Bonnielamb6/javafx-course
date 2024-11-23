package com.example.flowpanelayout;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FlowPane flowPane = new FlowPane();
        flowPane.setOrientation(Orientation.VERTICAL);
        flowPane.setHgap(10);
        flowPane.setVgap(10);
        flowPane.setRowValignment(VPos.BOTTOM);
        flowPane.setColumnHalignment(HPos.RIGHT);
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        TextArea textArea = new TextArea();
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");
        Button button6 = new Button("Button 6");

        flowPane.getChildren().addAll(button1, button2, button3, textArea, button4, button5, button6);
        Scene scene = new Scene(flowPane, 500, 500);
        stage.setTitle("Flowpane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}