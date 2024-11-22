module com.modulesfx.observablesexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.modulesfx.observablesexample to javafx.fxml;
    exports com.modulesfx.observablesexample;
}