package com.example.engg1420.ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditInfoController {


    @FXML
    public TextField eventid;

    public String inputText;

    public static Stage stage1 = new Stage();

    public EventManagerController EMC = new EventManagerController();

    public FXMLLoader loader;

    @FXML
    public void goApply()throws Exception{
        EditInfoController e = loader.getController();
        inputText = eventid.getText();

        System.out.println("some info: " + e.eventid.getText());
        EMC.updateStr(inputText);
    }
    @FXML
    public void goClose()throws Exception{
        stage1.close();
    }



    public String getStr(){
        return inputText;
    }

    public EditInfoController getEIC(){
        return loader.getController();
    }


    public void setStage(Stage stage){
        stage1 = stage;
    }
    public void setLoader(FXMLLoader l){
        loader = l;
    }




}
