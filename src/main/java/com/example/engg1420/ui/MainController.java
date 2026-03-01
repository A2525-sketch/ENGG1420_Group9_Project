package com.example.engg1420.ui;
import com.example.engg1420.model.Student;
import com.example.engg1420.model.User;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
public class MainController {

    @FXML
    private Label statusLabel;
    @FXML
    private void goBooking(){

        statusLabel.setText("Opening Booking Management");
    }
    @FXML
    private void goUser(){
        statusLabel.setText("Opening User Management");

    }
    @FXML
    private void goWaitlist(){

        statusLabel.setText("Opening Waitlist Management");
    }
    @FXML
    private void goEvent(){

        statusLabel.setText("Opening Event Management");
    }

}
