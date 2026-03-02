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
    String caseDefault = "/main";
    String caseWaitlist = "waitlist.fxml";
    String caseEventManager = "/EventManager.fxml";
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
        //load a scene called WaitlistManager
    }
    @FXML
    private void goEvent() throws Exception{
        statusLabel.setText("Opening Event Management");
        //load a scene called EventManager
        //FXMLLoader evLoader = new FXMLLoader(getClass().getResource("/EventManager.fxml"));
        //Scene evScene = new Scene(evLoader.load());
        //Stage evStage = new Stage();

        EventManagerApp Ev = new EventManagerApp();

        Ev.start(new Stage());




    }

}
