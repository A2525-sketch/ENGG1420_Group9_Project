package com.example.engg1420.ui;//under this folder
//com.example.engg1420.ui.EventManagerController

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;



//option 1: conditional statements for each apply


//@FXML allows fxml file to access different methods when action is performed


public class EventManagerController {

    public static EventManagerApp EM = new EventManagerApp();
    @FXML
    private TextField eventIdA;//input from textbox in EM_goEditInfoE1.fxml

    @FXML
    private Text eventIdB;


    public static StringProperty eventC = new SimpleStringProperty();
    public String eventE = "";
    private EventManagerUserInput EMUI;

    public EventManagerController(EventManagerUserInput EMUI) throws Exception{
        this.EMUI = EMUI;
    }


    public Stage stage = new Stage();



    @FXML//allows fxml file to reference this method
    public void goInfoE1() throws Exception {

        EM.setOpt(1, 1);
        EM.start(stage);
        eventIdB.setText("eventid: " + eventC.getValue());

    }

    @FXML
    public void goEditInfoE1()throws Exception {
        EM.setOpt(2, 0);
        EM.start(stage);

    }
    @FXML
    public void goCancelE1()throws Exception {
        //EM.setOpt();
        EM.start(new Stage());
    }

    @FXML
    private void goInfoE2()throws Exception{
        EM.setOpt(3, 0);
        EM.start(new Stage());
    }
    @FXML
    private void goEditInfoE2()throws Exception{
        EM.setOpt(4, 0);
        EM.start(new Stage());
    }
    @FXML
    private void goCancelE2()throws Exception{

    }
    @FXML
    private void goInfoE3()throws Exception{
        EM.setOpt(5, 0);
        EM.start(new Stage());

    }
    @FXML
    private void goEditInfoE3()throws Exception{
        EM.setOpt(6, 0);
        EM.start(new Stage());
    }

    @FXML
    private void goCancelE3()throws Exception{

    }

    @FXML
    public void goApplyE1() throws Exception{



         eventE = EMUI.getInput();


    }

    @FXML
    private void closeWindow()throws Exception{
        EM.setOpt(7, 0);
        EM.start(new Stage());
    }






    //create new event
}
