package com.example.engg1420.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ShowInfoController {

    @FXML
    public Label eventid2;
    public Label title2;
    public Label date2;
    public Label location2;
    public Label capacity2;
    public Label eventtype2;





    private Stage stage = new Stage();
    @FXML
    public void goClose()throws Exception{
        stage.close();
    }



    public void setEventIdText(String str){
        eventid2.setText("event id: " + str);
    }
    public void setTitle(String str){title2.setText("title: " + str);}
    public void setDate(String str){date2.setText("date: " + str);}
    public void setLocation(String str){location2.setText("location: " + str);}
    public void setCapacity(String str){capacity2.setText("capacity: " + str);}
    public void setEventType(String str){
        eventtype2.setText("eventType: " + str);}


    public void setStage(Stage stage){
        this.stage = stage;
    }








}
