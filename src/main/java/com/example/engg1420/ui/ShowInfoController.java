package com.example.engg1420.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ShowInfoController {
    public ShowInfoApp A = new ShowInfoApp();
    public EditInfoApp B = new EditInfoApp();
    public static Label eventid2;
    @FXML
    public void goClose()throws Exception{

        A.start(new Stage());
    }
}
