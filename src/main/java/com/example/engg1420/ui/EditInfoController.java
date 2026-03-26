package com.example.engg1420.ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditInfoController {


    @FXML
    public TextField eventid;

    public String stre1;

    private Stage stage = new Stage();

    private EventManagerController EMC;
    public FXMLLoader loader;
    @FXML
    public void goApply()throws Exception{
        loader = new FXMLLoader(getClass().getResource("/EditInfo.fxml"));
        Parent root = loader.load();
        EMC = loader.getController();
        stre1 = eventid.getText();
        System.out.println(eventid.getText());
        EMC.updateStr(stre1);

    }
    @FXML
    public void goClose()throws Exception{
        stage.close();
    }

    public void setStage(Stage stage){
        this.stage = stage;
    }

    public String getStr(){
        return stre1;
    }

    public void setCon(EventManagerController EMC){
        this.EMC = EMC;
    }

    public void setLoader(FXMLLoader l){
        loader = l;
    }


}
