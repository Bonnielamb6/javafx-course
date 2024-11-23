module com.example.grouplayout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.grouplayout to javafx.fxml;
    exports com.example.grouplayout;
}