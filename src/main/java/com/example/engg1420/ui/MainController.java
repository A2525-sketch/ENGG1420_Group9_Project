package com.example.engg1420.ui;
import com.example.engg1420.model.Student;
import com.example.engg1420.model.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import com.example.engg1420.ui.EventManagerApp;
public class MainController {
    @FXML
    private Label statusLabel;
    @FXML
    private void goBooking() throws Exception{

        statusLabel.setText("Opening Booking Management");
        BookingManagementApp bk = new BookingManagementApp();
        bk.start(new Stage());
    }
    @FXML
    private void goUser(){
        statusLabel.setText("Opening User Management");

    }
    @FXML
    private void goWaitlist(){

        statusLabel.setText("Opening Waitlist Management");
        //load a scene called WaitlistManager
    }
    @FXML
    private void goEvent() throws Exception{
        statusLabel.setText("Opening Event Management");


        EventManagerApp Ev = new EventManagerApp();

        Ev.start(new Stage());




    }

}
