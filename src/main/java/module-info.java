module com.example.engg1420 {

    requires javafx.controls;
    requires javafx.fxml;
    requires com.opencsv;
    requires java.sql;
    requires org.mongodb.driver.sync.client;
    requires org.mongodb.bson;
    requires java.desktop;

    opens com.example.engg1420.ui to javafx.fxml;

    exports com.example.engg1420.ui;
}