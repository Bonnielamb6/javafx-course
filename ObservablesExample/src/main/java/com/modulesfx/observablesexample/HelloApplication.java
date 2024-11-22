package com.modulesfx.observablesexample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
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

        ObservableList<String> list = FXCollections.observableArrayList("One", "Two", "Three");
        ListView<String> items = new ListView<>(list);
        TextField field = new TextField();
        field.setMaxWidth(200);
        Button button = new Button("Add");
        items.setItems(list);
        button.setOnAction(event -> {
            if(!field.textProperty().get().isEmpty()){
                list.add(field.textProperty().get());
            }
        });

        root.getChildren().addAll(items, field, button);
        Scene scene = new Scene(root, 550, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}