package com.example.engg1420.ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

public class EventManagerContainerController {
    public static EventManagerApp EM = new EventManagerApp();
    //public FXMLLoader loader8 = new FXMLLoader(getClass().getResource("/EventManager.fxml"));
    public static FXMLLoader loader8;
    public static EventManagerContainerController emc;


    @FXML
    public VBox VBoxContainer;

    @FXML
    public void goAddEvent()throws Exception{
        loader8 = EM.getEMContainerLoader();
        EM.EMContainerController = loader8.getController();
        EM.addToVBox(1);



    }

    public VBox getVBoxContainer(){
        return VBoxContainer;
    }
    public EventManagerContainerController getEMCC(){
        return emc;
    }

    public void setLoader8(FXMLLoader l){
        loader8 = l;
    }

    public FXMLLoader getLoader8(){
        return loader8;
    }
}
