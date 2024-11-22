module com.modulesfx.bindingsexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.modulesfx.bindingsexample to javafx.fxml;
    exports com.modulesfx.bindingsexample;
}