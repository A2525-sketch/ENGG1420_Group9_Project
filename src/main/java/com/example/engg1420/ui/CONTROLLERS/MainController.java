package com.example.engg1420.ui.CONTROLLERS;
import com.example.engg1420.ui.APPS.BookingManagementApp;
import com.example.engg1420.ui.APPS.EventManagerApp;
import com.example.engg1420.ui.APPS.UserManagementApp;
import com.example.engg1420.ui.WaitlistManagementApp;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainController {
    @FXML
    private Label statusLabel;
    @FXML
    private void goBooking() throws Exception{
//change statuslabel for debugging purposes and/or to let user know what is supposed to happen
        statusLabel.setText("Opening Booking Management");
        //create new window for booking management
        BookingManagementApp bk = new BookingManagementApp();
        //start new booking window
        bk.start(new Stage());
        // other go functions are the same for each of the 4 buttons
    }
    @FXML
    private void goUser() throws Exception {
        statusLabel.setText("Opening User Management");
        UserManagementApp userApp = new UserManagementApp();
        userApp.start(new Stage());
    }
    @FXML
    private void goWaitlist()throws Exception{

        statusLabel.setText("Opening Waitlist Management");
        WaitlistManagementApp wl = new WaitlistManagementApp();
        wl.start(new Stage());
        //load a scene called WaitlistManager
    }
    @FXML
    private void goEvent() throws Exception{
        statusLabel.setText("Opening Event Management");


        EventManagerApp Ev = new EventManagerApp();

        Ev.start(new Stage());




    }

}
