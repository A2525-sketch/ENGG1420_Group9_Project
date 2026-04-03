package com.example.engg1420.ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class EditInfoController {
    public EventManagerApp EMA = new EventManagerApp();



    @FXML
    public TextField eventidField;
    @FXML
    public TextField titleField;
    @FXML
    public TextField dateField;
    @FXML
    public TextField locationField;
    @FXML
    public TextField capacityField;
    @FXML
    public TextField eventtypeField;

    public Stage EditInfoStage;

    public FXMLLoader EditInfoLoader;



    @FXML
    public void goApply()throws Exception{

        EditInfoController e = EditInfoLoader.getController();
        EMA.eventIDList.set(EMA.Index, e.eventidField.getText());
        EMA.titleList.set(EMA.Index, e.titleField.getText());
        EMA.dateList.set(EMA.Index, e.dateField.getText());
        EMA.locationList.set(EMA.Index, e.locationField.getText());
        EMA.capacityList.set(EMA.Index, e.capacityField.getText());
        EMA.eventTypeList.set(EMA.Index, e.eventtypeField.getText());
        //System.out.println(EMA.eventIDList.get(EMA.Index));
    }

    @FXML
    public void goClose()throws Exception{
        EditInfoStage.close();
    }

    public void setStage(Stage stage){
        EditInfoStage = stage;
    }
    public void setLoader(FXMLLoader l){
        EditInfoLoader = l;
    }



}
