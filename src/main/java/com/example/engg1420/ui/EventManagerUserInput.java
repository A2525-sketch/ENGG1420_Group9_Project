package com.example.engg1420.ui;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class EventManagerUserInput {
    @FXML
    private TextField inputField;
    public String getInput()throws Exception{
        if(inputField == null){
            return "";
        }else{
            return inputField.getText();
        }
    }
}
