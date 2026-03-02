package com.example.engg1420.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EventManagerController {
    //onAction button methods
    @FXML
    private Label eventlabel;
    @FXML
    private void BookingDebug(){

        eventlabel.setText("DEBUG TEST");
    }
}
