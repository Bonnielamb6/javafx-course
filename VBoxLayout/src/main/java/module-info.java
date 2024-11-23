module com.example.vboxlayout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vboxlayout to javafx.fxml;
    exports com.example.vboxlayout;
}