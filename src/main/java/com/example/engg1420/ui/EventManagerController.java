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
    public static EditInfoController EIC = new EditInfoController();
    public static ShowInfoController SIC = new ShowInfoController();
    public static FXMLLoader loader1;
    public static FXMLLoader loader2;

    public static String strE1;
    public static Stage s = new Stage();


    //public static FXMLLoader loader;
    @FXML//allows fxml file to reference this method
    public void goEditInfo()throws Exception{
        loader2 = new FXMLLoader(getClass().getResource("/EditInfo.fxml"));
        Parent root = loader2.load();
        EIC = loader2.getController();
        EIC.setLoader(loader2);
        Scene scene = new Scene(root);
        s.setScene(scene);
        EIC.setStage(s);
        s.show();
    }

    @FXML
    public void goShowInfo()throws Exception{
        EIC = EIC.getEIC();
        loader1 = new FXMLLoader(getClass().getResource("/ShowInfo.fxml"));
        Parent root = loader1.load();
        SIC = loader1.getController();
        strE1 = EIC.eventid.getText();
        SIC.setEventIdText(strE1);
        SIC = loader1.getController();
        Scene scene = new Scene(root);
        SIC.setStage(s);
        s.setScene(scene);
        s.show();



    }

    public void setEditInfo(){

    }



    @FXML
    private void closeWindow()throws Exception{
        EM.setOpt(7);
        EM.start(new Stage());
    }



    public void updateStr(String str){
        strE1 = str;
    }

    public void createEvent(){

    }








    //create new event
}
