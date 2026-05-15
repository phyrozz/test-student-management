module com.example.test_gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.test_gui.controller to javafx.fxml;
    opens com.example.test_gui.model to javafx.base;
    exports com.example.test_gui.app;
}
