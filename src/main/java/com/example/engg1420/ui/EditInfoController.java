package com.example.engg1420.ui;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditInfoController {
    public EditInfoApp A = new EditInfoApp();

    @FXML
    public static TextField eventid;


    @FXML
    public void goApply()throws Exception{
        A.setOption(1);
        A.start(new Stage());
        //save textfield from current state of controller

    }
    @FXML
    public void goClose()throws Exception{
        A.setOption(2);
        A.start(new Stage());
        //close current window
    }
}
