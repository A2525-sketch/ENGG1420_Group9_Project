package com.example.engg1420.ui;
import com.example.engg1420.model.Student;
import com.example.engg1420.model.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import com.example.engg1420.ui.MainApp;
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
    private void goEvent() throws Exception{//idk what throws exception does
        statusLabel.setText("Opening Event Management");
        //load a scene called EventManager

        FXMLLoader evloader = new FXMLLoader(getClass().getResource("/EventManager.fxml"));
        Scene evScene = new Scene(evloader.load());
        Stage evStage = new Stage();
        evStage.setScene(evScene);

        MainApp a = new MainApp();//
        a.setC(4);

        a.start(evStage);





    }

}
