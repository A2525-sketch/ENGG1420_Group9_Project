package com.example.engg1420.ui;

import com.example.engg1420.model.EventType;
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

        EventType ET= new EventType(eventidField.getText(), titleField.getText(), dateField.getText(), locationField.getText(),EMA.convertCharToInt(capacityField.getCharacters()), eventtypeField.getText());
        CSVWriterSimpleEvent writer = new CSVWriterSimpleEvent();
        writer.modifyEvent(ET.toString(), EMA.Index, EMA.rowCount);

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
