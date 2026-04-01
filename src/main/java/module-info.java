module com.example.engg1420 {

    requires javafx.controls;
    requires javafx.fxml;
    requires com.opencsv;

    opens com.example.engg1420.ui to javafx.fxml;

    exports com.example.engg1420.ui;
    exports com.example.engg1420.ui.CSVREADERS;
    opens com.example.engg1420.ui.CSVREADERS to javafx.fxml;
    exports com.example.engg1420.ui.CSVWRITERS;
    opens com.example.engg1420.ui.CSVWRITERS to javafx.fxml;
    exports com.example.engg1420.ui.CONTROLLERS;
    opens com.example.engg1420.ui.CONTROLLERS to javafx.fxml;
    exports com.example.engg1420.ui.APPS;
    opens com.example.engg1420.ui.APPS to javafx.fxml;
}