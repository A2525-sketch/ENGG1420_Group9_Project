package com.example.engg1420.ui;//under this folder
//com.example.engg1420.ui.EventManagerController

import javafx.application.Application;
import com.example.engg1420.model.Event;
import com.example.engg1420.model.EventType;
import com.example.engg1420.model.Workshop;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;





/*public String getEventid(){return eventid;}
public String getTitle(){return title;}
public String getDate(){return date;}
public String getLocation(){return location;}
public int getCapacity(){return capacity;}
public abstract String getEventType();*/

//@FXML allows fxml file to access different methods when action is performed


public class EventManagerController {
    public static EventManagerApp EM = new EventManagerApp();
    public static EditInfoApp EIA = new EditInfoApp();
    public static ShowInfoApp SIA = new ShowInfoApp();



    @FXML//allows fxml file to reference this method


    public void goEditInfo()throws Exception{
        EIA.setOption(0);
        EIA.start(new Stage());

    }
    @FXML
    public void goShowInfo()throws Exception{
        SIA.setOption(0);
        SIA.start(new Stage());

    }



    @FXML
    private void closeWindow()throws Exception{
        EM.setOpt(7);
        EM.start(new Stage());
    }






    //create new event
}
