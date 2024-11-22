module com.modulesfx.props {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.modulesfx.props to javafx.fxml;
    exports com.modulesfx.props;
}