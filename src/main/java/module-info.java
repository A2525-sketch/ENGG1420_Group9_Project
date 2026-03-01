module com.example.engg1420 {

    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.engg1420.ui to javafx.fxml;

    exports com.example.engg1420.ui;
}