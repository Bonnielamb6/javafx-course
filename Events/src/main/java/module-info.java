module com.modulesfx.events {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.modulesfx.events to javafx.fxml;
    exports com.modulesfx.events;
}