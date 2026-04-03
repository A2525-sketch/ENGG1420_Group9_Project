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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;







/*public String getEventid(){return eventid;}
public String getTitle(){return title;}
public String getDate(){return date;}
public String getLocation(){return location;}
public int getCapacity(){return capacity;}
public abstract String getEventType();*/

//@FXML allows fxml file to access different methods when action is performed


public class EventManagerController {
    public static EventManagerApp EMA;
    public static EditInfoController EIC = new EditInfoController();
    public static ShowInfoController SIC = new ShowInfoController();

    public FXMLLoader loader1;
    public FXMLLoader loader2;
    public int index;







    public Stage s = new Stage();
    @FXML
    public Label EMCLabel;
    @FXML
    public Button ShowInfoButton;
    @FXML
    public Button EditInfoButton;
    @FXML
    public Button CancelEventButton;









    //public static FXMLLoader loader;
    @FXML//allows fxml file to reference this method
    public void goEditInfo()throws Exception{
        EMA.setIndex(index);

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


        loader1 = new FXMLLoader(getClass().getResource("/ShowInfo.fxml"));
        Parent root = loader1.load();
        SIC = loader1.getController();


        SIC.setEventIdText(EMA.eventIDList.get(index));
        SIC.setTitle(EMA.titleList.get(index));
        SIC.setDate(EMA.dateList.get(index));
        SIC.setLocation(EMA.locationList.get(index));
        SIC.setCapacity(EMA.capacityList.get(index));
        SIC.setEventType(EMA.eventTypeList.get(index));

        SIC = loader1.getController();
        Scene scene = new Scene(root);
        SIC.setStage(s);
        s.setScene(scene);
        s.show();
    }




















    public void setIndex(int i){
        index = i;
    }




    public void setEMA(EventManagerApp E){
        EMA = E;
    }





}
