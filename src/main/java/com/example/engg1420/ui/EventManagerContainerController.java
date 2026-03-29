package com.example.engg1420.ui;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class EventManagerContainerController {
    public static EventManagerApp EM = new EventManagerApp();
    @FXML
    public VBox VBoxContainer;

    public void goAddEvent()throws Exception{
        EM.addToVBox(1);
    }

    public VBox getVBoxContainer(){
        return VBoxContainer;
    }
}
