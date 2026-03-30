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

    public EventManagerApp Ev = new EventManagerApp();

    @FXML
    private void goBooking() throws Exception{

        statusLabel.setText("Opening Booking Management");
        BookingManagementApp bk = new BookingManagementApp();
        bk.start(new Stage());
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


        Ev.initializeStuff();
        Ev.start(new Stage());
        //Ev.start(new Stage());

    }

}
