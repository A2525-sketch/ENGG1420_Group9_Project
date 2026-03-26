package com.example.engg1420.ui;//under this folder
//com.example.engg1420.ui.EventManagerController

import javafx.application.Application;
import com.example.engg1420.model.Event;
import com.example.engg1420.model.EventType;
import com.example.engg1420.model.Workshop;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
    public EditInfoController EIC = new EditInfoController();
    public ShowInfoController SIC = new ShowInfoController();


    public static String strE1;
    public static Stage s = new Stage();

    public static FXMLLoader loader;
    @FXML//allows fxml file to reference this method
    public void goEditInfo()throws Exception{
        loader = new FXMLLoader(getClass().getResource("/EditInfo.fxml"));
        Parent root = loader.load();

        EIC = loader.getController();
        EIC.setLoader(loader);
        EIC.setCon(this);

        Scene scene = new Scene(root);

        EIC.setStage(s);
        s.setScene(scene);
        s.show();

    }

    @FXML
    public void goShowInfo()throws Exception{
        loader = new FXMLLoader(getClass().getResource("/ShowInfo.fxml"));
        Parent root = loader.load();
        SIC = loader.getController();
        strE1 = EIC.eventid.getText();
        SIC.setEventIdText(strE1);
        Scene scene = new Scene(root);
        SIC.setStage(s);
        s.setScene(scene);
        s.show();



    }



    @FXML
    private void closeWindow()throws Exception{
        EM.setOpt(7);
        EM.start(new Stage());
    }

    private void goApply(){

    }

    public void updateStr(String str){
        strE1 = str;

    }








    //create new event
}
