package com.example.engg1420.ui;//under this folder
//com.example.engg1420.ui.EventManagerController

import javafx.application.Application;
import com.example.engg1420.model.Event;
import com.example.engg1420.model.EventType;
import com.example.engg1420.model.Workshop;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
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

    /*public void seteMWin(EventManagerApp eMWin) {
        this.eMWin = eMWin;
    }*/





    private Label name;
    //list of events(name, info(button), edit(button), cancel(button))

    static Label Status1 = new Label();
    static Label Status2 = new Label();
    static Label Status3 = new Label();
    @FXML
    public TextField eventid;
    @FXML
    public Label eventId2;
    public String E1;
    @FXML//allows fxml file to reference this method
    private void goInfoE1() throws Exception {
        E1 = "hello";
        eventId2 = EM.setLabel();
        eventId2.setText(E1);
        EM.setOpt(1);
        EM.start(new Stage());



        //EventManagerApp infoE1 = new EventManagerApp();
        //infoE1.start(new Stage());

        //create event from event class
        //use array list at index '0' to display information for different labels;
        //EventType e1 = new Workshop("0", "none", "0","University of Guelph", 0,"none");//auto override the class with definition super(stuff); this.stuff = stuff;


    }


    @FXML
    public void goEditInfoE1()throws Exception {

        //EM.setOpt(2);
        //EM.start(new Stage());


    }
    @FXML
    public void goCancelE1()throws Exception {
        //EM.setOpt();
        EM.start(new Stage());
    }

    @FXML
    private void goInfoE2()throws Exception{
        EM.setOpt(3);
        EM.start(new Stage());
    }
    @FXML
    private void goEditInfoE2()throws Exception{
        EM.setOpt(4);
        EM.start(new Stage());
    }
    @FXML
    private void goCancelE2()throws Exception{

    }
    @FXML
    private void goInfoE3()throws Exception{
        EM.setOpt(5);
        EM.start(new Stage());

    }
    @FXML
    private void goEditInfoE3()throws Exception{
        EM.setOpt(6);
        EM.start(new Stage());
    }

    @FXML
    private void goCancelE3()throws Exception{
        //
    }
    @FXML
    private void closeWindow()throws Exception{
        EM.setOpt(7);
        EM.start(new Stage());
    }

    public void goApplyE1()throws Exception{

        //EM.saveState();
        //FXMLLoader loader1 = new FXMLLoader(getClass().getResource("/EM_goEditInfoE1.fxml"));
        //Parent root = loader1.load();
        E1 = eventid.getText();
        System.out.println(E1);
    }






    //create new event
}
