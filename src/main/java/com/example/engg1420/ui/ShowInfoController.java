package com.example.engg1420.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ShowInfoController {

    @FXML
    public Label eventid2;

    private Stage stage = new Stage();
    @FXML
    public void goClose()throws Exception{
        stage.close();
    }



    public void setEventIdText(String str){
        eventid2.setText("event id: " + str);
    }

    public void setStage(Stage stage){
        this.stage = stage;
    }




}
