package com.example.demo;

import javafx.application.Application;
import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Constant constant = new Constant(100);
        constant.changeConstant(200);
        System.out.println(constant.getReadOnlyNumber());
    }

    public static void main(String[] args) {
        launch();
    }

}
